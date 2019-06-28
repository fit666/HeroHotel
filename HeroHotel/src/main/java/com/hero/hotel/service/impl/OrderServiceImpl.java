package com.hero.hotel.service.impl;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.hero.hotel.dao.HouseDao;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.dao.OrderDao;
import com.hero.hotel.pojo.HouseType;
import com.hero.hotel.pojo.Info;
import com.hero.hotel.pojo.LiveNotes;
import com.hero.hotel.pojo.Order;
import com.hero.hotel.pojo.OrderItem;
import com.hero.hotel.pojo.User;
import com.hero.hotel.pojo.Vip;
import com.hero.hotel.service.OrderService;
@Service("orderService")
public class OrderServiceImpl implements OrderService{
	@Resource
	private OrderDao orderDao;
	@Resource
	private HouseDao houseDao;

	//订单表插入数据


	// 订单表插入数据
	@Override
	public void addOrder(Order order) {
		orderDao.addOrder(order);
	}
	//订单项插入数据
	@Override
	public void addOrderItem(OrderItem orderItem) {
		orderDao.addOrderItem(orderItem);
	}
	//个人信息表插入数据
	@Override
	public void addInfo(Info info) {
		orderDao.addInfo(info);
	}
	//查询个人信息id
	@Override
	public Info findId(String idcard) {
		return orderDao.findId(idcard);
	}

	//入住日志表插入数据
	@Override
	public void addLiveNotes(LiveNotes liveNotes) {
		orderDao.addLiveNotes(liveNotes);
	}

	//根据账号id获取消费金额，通过消费金额获取对应的会员折扣
	@Override
	public User findMonetaryByid(Integer id) {
		return orderDao.findMonetaryByid(id);
	}
	@Override
	public Vip findDiscountByMonetary(double vmoney) {
		return orderDao.findDiscountByMonetary(vmoney);
	}

	//查询订单id,根据订单编号查找
	@Override
	public Order findIdByOrderNumber(String orderNumber) {
		return orderDao.findIdByOrderNumber(orderNumber);
	}
	@Override
	public HouseType findPriceByTypeid(Integer typeid) {
		return orderDao.findPriceByTypeid(typeid);
	}
	//查找该类型的所有房间，查找当天入住日志表中该类房间已经入住的房间，
	@Override
	public List<Integer> findAllRoomsByTypeid(Integer typeid) {
		return orderDao.findAllRoomsByTypeid(typeid);
	}
	@Override
	public List<Integer> findAllliveRoomsByTypeid(LiveNotes liveNotes) {
		return orderDao.findAllliveRoomsByTypeid(liveNotes);
	}


	//查询所有
	@Override
	public List<Info> findAllOrders() {
		return orderDao.findAllInfo();
	}

	/*
	 * 查询某个角色的所有订单
	 * 1.根据名字获取该角色的个人信息
	 * 2.根据个人信息id获取该角色的账号id信息
	 * 3.根据账号id获取该角色的订单id
	 * 4.根据订单id获取所有的订单项id
	 */
	@Override
	public List<Info> findOrder(Info info) {

		return orderDao.findInfo(info);
	}
	//查询需要修改的订单信息
	@Override
	public ModelAndView findUpdateOrder(Integer id) {
		ModelAndView model = new ModelAndView();
		OrderItem orderItem = orderDao.findOrderItem(id);
		Order order = orderDao.findOrder(orderItem.getOrderid());
		Info info = orderDao.findOneInfo(order.getInfoid());
		model.addObject("info", info);
		model.addObject("order", order);
		model.addObject("orderItem", orderItem);
		return model;
	}

    @Override
    public ModelAndView deleteOrder(LiveNotes liveNotes, OrderItem orderItem, Order order, Info info) {
        return null;
    }

    //修改订单信息
	@Override
	public ModelAndView updateOrder(Info info, Order order, OrderItem orderItem) {
		ModelAndView model = new ModelAndView();
		System.out.println(info);
		Boolean result = orderDao.updateInfo(info);
		System.out.println(result);
		orderDao.updateOrderItem(orderItem);
		orderDao.updateOrder(order);
		return model;
	}

	//删除订单
	//@Override
	/*public ModelAndView deleteOrder(LiveNotes liveNotes, OrderItem orderItem, Order order,Info info) {
		ModelAndView model = new ModelAndView();
		orderDao.updateLiveNotesFlag(liveNotes);
		orderDao.updateOrderItemFlag(orderItem);
		orderDao.updateOrderFlag(order);
		User user = orderDao.findUser(info);
		Order order2 = orderDao.findOder(user.getId());
		model.addObject("uname", info.getUname());
		model.addObject(order2);
		return model;
	}*/



	@Override
	public Boolean settleAccounts(String houseid) {
//		Boolean flag = false;
//		orderDao.settleAccounts(houseid);
//		houseDao.changeHouseTypeByHouseid(houseid);
//		List<Integer> ids = orderDao.isNoSettle(houseid);
//		if (ids.size() == 0) {
//			flag = orderDao.changeOrderFlag(houseid);
//		}
//
//		Boolean flag = orderDao.settleAccounts(houseid);


		return null;
	}

	//根据某时间段查询住房情况
	@Override
	public Integer findHouseNumberByTypeid(List<String> todays, Integer typeid) {
		//所有的住房信息
		List<LiveNotes> houseByType = houseDao.findHouseByType(typeid);
		//根据房间类型查找所有的房间id
		List<Integer> houseidByType = houseDao.findHouseidByType(typeid);
		//可用房间数量
		Integer houseNumber=houseidByType.size();
		for (int i = 0; i < houseidByType.size(); i++) {
			for (int j = 0; j < houseByType.size(); j++) {
				if(todays.contains(houseByType.get(j).getDate())&&houseidByType.get(i).equals(houseByType.get(j).getHouseid())){
					houseNumber--;
					break;
				}

			}
		}
		return houseNumber;
	}
	//code by sxj , 大佬别删我
	@Override
	public void orderSubmit(String ordernumber, String currenttime, String name, String sex, String tel, String idcard, List<String> todays, List<Integer> housenumber,Integer userid,Double discount,String message) throws ParseException {
		//先放入用户信息，并返回一个用户id，先用手机号检索，如果有就不插入了，没有就插入
		Integer infoid = 0;
		Info userInfo=orderDao.findInfoByTel(tel);
		System.out.println(userInfo);
		if (userInfo==null){
			orderDao.addInfoByOrder(tel,name,sex,idcard,userid);
			Info info = orderDao.findInfoByTel(tel);
			infoid=info.getInfoid();
		}else {
			infoid=userInfo.getInfoid();
		}
		System.out.println("打个桩");
		//放入订单信息,返回一个orderid
		Integer orderid = 0;
		//计算总价格
        Double total=0.0;
		for (int i = 1; i <4 ; i++) {
			HouseType houseType=orderDao.findPriceByTypeid(i);
			total += housenumber.get(i) * houseType.getPrice();
		}
		System.out.println(total);

        String payway="online";
		orderDao.addOrderInfo(currenttime,ordernumber,message,infoid,payway,total,userid);
		orderid = orderDao.findOrderidByOrdernumebr(ordernumber);
		System.out.println(orderid);



		//为订单项做准备
		String starttime=todays.get(0);
		int day = todays.size();
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		Date d = f.parse(starttime);
		long time = d.getTime()+1000*60*60*24*day;
		Date d2 = new Date(time);
		String endtime = f.format(d2);

		System.out.println("aaaaaaaaaaaaaaa");

		//存入livenotes信息，这里需要一个infoid，来自info

		for (int typeid = 1; typeid <= 4 ; typeid++) {
			//所有的住房信息
			List<LiveNotes> houseByType = houseDao.findHouseByType(typeid);
			//根据房间类型查找所有的房间id
			List<Integer> houseidByType = houseDao.findHouseidByType(typeid);
			for (int i = 0; i < houseidByType.size(); i++) {
                System.out.println("执行2");
			    if(housenumber.get(typeid).equals(0)){
			        break;
                }
				for (int j = 0; j < houseByType.size(); j++) {
					if(todays.contains(houseByType.get(j).getDate())&&houseidByType.get(i).equals(houseByType.get(j).getHouseid())){
						houseidByType.remove(i);
						break;
					}
				}
				for (int j = 0; j < houseidByType.size(); j++) {
					if(housenumber.get(typeid).equals(0)){
						break;
					}
					for (int k = 0; k < todays.size(); k++) {
						houseDao.addDay(houseidByType.get(j),typeid,todays.get(k),infoid);

						HouseType houseType=orderDao.findPriceByTypeid(typeid);

						orderDao.addOrderitem(houseidByType.get(j),starttime,endtime,typeid,day,orderid,houseType.getPrice());

					}
					housenumber.set(typeid,housenumber.get(typeid)-1);
				}
			}


	    }

		//最后还有一个订单项表要插入，硬核直接插入



    }

    @Override
    public ModelAndView findAllOrder(Info info) {
        return null;
    }

	@Override
	public Order findOrderByUserid(Integer userid) {
		return orderDao.findOrderByUserid(userid);
	}

	@Override
	public List<Integer> findFlagById(Integer id) {
		return orderDao.findFlagById(id);
	}
}
