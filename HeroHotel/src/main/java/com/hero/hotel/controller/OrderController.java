package com.hero.hotel.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import com.hero.hotel.utils.RegexUtil;
import net.sf.json.JSONArray;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.pojo.HouseType;
import com.hero.hotel.pojo.Info;
import com.hero.hotel.pojo.LiveNotes;
import com.hero.hotel.pojo.Order;
import com.hero.hotel.pojo.OrderItem;
import com.hero.hotel.pojo.User;
import com.hero.hotel.pojo.Vip;
import com.hero.hotel.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Resource
	private OrderService orderService;
	


	//查询所有订单记录
	@RequestMapping("/findallorder")
	public ModelAndView findAllOrder() {
		ModelAndView model = new ModelAndView();
		List<Info> infos= orderService.findAllOrders();
		model.addObject("infos", infos);
		model.setViewName("backstage-html/findOrder.html");
		return model;
	}

	//查询修改订单信息
	@RequestMapping("/findupdate")
	public ModelAndView findupdate(Integer id) {
		ModelAndView model = new ModelAndView();
		model = orderService.findUpdateOrder(id);
		model.setViewName("backstage-html/updateorder.html");
		return model;
	}
	//修改订单信息
	@RequestMapping("/updateorder")
	public ModelAndView updateOder(Info info,Order order,OrderItem orderItem,@DateTimeFormat(pattern="yyyy-MM-dd") Date date1,@DateTimeFormat(pattern="yyyy-MM-dd") Date date2) {
		ModelAndView model = new ModelAndView();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String starttime = sdf.format(date1);
		String endtime = sdf.format(date2);
		orderItem.setStarttime(starttime);
		orderItem.setEndtime(endtime);
		String updatetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());//获取当前修改订单时间
		order.setUpdatetime(updatetime);
		model = orderService.updateOrder(info,order, orderItem);
		List<Info> infos= orderService.findAllOrders();
		model.addObject("infos", infos);
		model.setViewName("backstage-html/findOrder.html");
		return model;
	}



	// 结账  要跳 那些页面 你来定
	@RequestMapping("/settleAccounts")
	public ModelAndView settleAccounts(Integer id, Integer houseid) {
		Boolean flag = orderService.settleAccounts(id, houseid);
		/*
		 * lining
		 */
		ModelAndView model = new ModelAndView();
		if (flag) {
			List<Info> infos= orderService.findAllOrders();
			model.addObject("infos", infos);
			model.setViewName("backstage-html/findOrder.html");
		}
		return model;
	}

       
	//提交用户的预订单，code by sxj
	@RequestMapping("/createorder")
	@ResponseBody
	public String createOrder(String message,String hn,String name,String tel,String sex,String idcard,HttpSession session) throws ParseException {
		List<Integer> housenumber= JSONArray.fromObject(hn);  //真的好厉害啊，那前端数组处理的很漂亮

        //获得当前时间currenttime
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String currenttime=df.format(new Date()).toString();// new Date()为获取当前系统时间

		//随机生成一个订单号id
		Random random=new Random();
		int rannum= (int)(random.nextDouble()*(99999-10000 + 1))+ 10000;
		long date = new Date().getTime();
		String ordernumber = String.valueOf(rannum) + "" + String.valueOf(date);

		//从session直接拿出要用的时间段
		List<String> todays=(List)session.getAttribute("timeslot");


		String result = "";
		User user = (User) session.getAttribute("user");
		if (user==null){
			result="请先登录";
			return result;
		}
		Integer id = user.getId();
		System.out.println("用户的id:"+id);
		//Vip vip = (Vip) user.getVip();
		//System.out.println(vip.getDiscount());
		
		Double discount = 0.8;   //从session获得会员等级得到折扣
		
		//如果这个用户已经有订单了，需要先将这个订单处理了
		List<Integer> flags = orderService.findFlagById(id);
		System.out.println(flags);
		if(flags!=null) {
			for (int i = 0; i < flags.size(); i++) {
				if(flags.get(i).equals(2)){
					result="你还有订单未处理";
					return result;
				}
			}
		}

		//在service里面去一次性把所有业务处理了
		//Integer id = 1;  //从session获得一个id


		


		if(!tel.matches(RegexUtil.REGEX_MOBILE)){
			result="手机号码格式不正确";
			return result;
		}
		else if(!idcard.matches(RegexUtil.REGEX_ID_CARD)){
			result="身份证格式不正确";
			return result;
		}else if(name.equals("")){
			result="请输入姓名";
			return result;
		}else if(housenumber.get(1).equals(0)&&housenumber.get(2).equals(0)&&housenumber.get(3).equals(0)&&housenumber.get(4).equals(0)){
			result="请添加住房信息";
			return result;
		}

		else {
			orderService.orderSubmit(ordernumber,currenttime,name,sex,tel,idcard,
					todays,housenumber,id,discount,message);
			result="订单生产";
		}

 		return result;
	}



}
