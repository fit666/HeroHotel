package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hero.hotel.pojo.HouseType;
import com.hero.hotel.pojo.Info;
import com.hero.hotel.pojo.LiveNotes;
import com.hero.hotel.pojo.Order;
import com.hero.hotel.pojo.OrderItem;
import com.hero.hotel.pojo.User;
import com.hero.hotel.pojo.Vip;
import java.util.Date;

/*
 * 订单的添加、修改、删除
 */
public interface OrderDao {
	/*
	 * 添加
	 * 前端发送数据有：姓名，性别，电话，身份证，预定天数，预定到达时间，房间类型，押金，留言，到达取消时间是否自动取消预订
	 */
	//订单表插入数据
	@Insert("insert into t_order(createtime,updatetime,ordernumber,total,userid,infoid) values(#{createtime},#{updatetime},#{ordernumber},"
			+ "#{total},#{userid},#{infoid})")
	public void addOrder(Order order);
	//查询订单id,根据订单编号查找
	@Select("select * from t_order where orderNumber = #{orderNumber}")
	public Order findIdByOrderNumber(String orderNumber);
	//订单项插入数据
	@Insert("insert into t_orderitem(typeid,orderid,quantity,starttime,day,price,endtime,houseid) values(#{typeid},"
			+ "#{orderid},#{quantity},#{starttime},#{day},#{price},#{endtime},#{houseid})")
	public void addOrderItem(OrderItem orderItem);
	//个人信息表插入数据
	@Insert("insert into t_info(tel,uname,sex,idcard) values(#{tel},#{uname},#{sex},#{idcard})")
	public void addInfo(Info info);
	//查询个人信息id
	@Select("select * from t_info where idcard = #{idcard}")
	public Info findId(String idcard);
	//入住日志表插入数据
	@Insert("insert into t_livenotes(houseid,typeid,infoid,date) values(#{houseid},#{typeid},#{infoid},#{date})")
	public void addLiveNotes(LiveNotes liveNotes);
	//查找房间价格
	@Select("select * from t_housetype where typeid=#{typeid}")
	public HouseType findPriceByTypeid(Integer typeid);
	/*
	 * 筛选可以入住房间信息
	 */
	//查找该类型的所有房间，查找当天入住日志表中该类房间已经入住的房间，
	@Select("select id from t_house where typeid=#{typeid}")
	public List<Integer> findAllRoomsByTypeid(Integer typeid);
	@Select("select houseid from t_livenotes where typeid=#{typeid} and date=#{date} and flag=1")
	public List<Integer> findAllliveRoomsByTypeid(LiveNotes liveNotes);
	
	
	
	//根据账号id获取消费金额，通过消费金额获取对应的会员折扣
	@Select("select * from t_user where id=#{id}")
	public User findMonetaryByid(Integer id);
	@Select("select * from t_vip where vmoney=#{vmoney}")
	public Vip findDiscountByMonetary(double vmoney);
	
	/*
	 * 删除订单
	 * 1.进入订单页面，自动先查询该用户的所有订单和订单项，1的为可删，2则为不可删（flag为1的表示可以已定但还未入住的，
	 * flag为2的表示已定已入住的的，3表示取消的订单）
	 * 2点击删除按钮，后台将订单和订单项中的flag修改为3，之后再自动查询一次，显示给页面
	 */
	
	
	
	/*
	 * 查询所有订单
	 */
	@Select("select * from t_info")
	@Results({
		@Result(id=true,column="infoid",property="infoid"),
		@Result(column="infoid",property="orders",many=@Many(select="findAllOrders"))
	})
	public List<Info> findAllInfo();
	
	@Select("select * from t_order")
	@Results({
		@Result(id=true,column="orderid",property="orderid"),
		@Result(column="orderid",property="oderItems",many=@Many(select="findAllOrderItem"))
	})
	public List<Order> findAllOrders();
	
	@Select("select * from t_orderitem where orderid=#{orderid}")
	public List<OrderItem> findAllOrderItem(Integer orderid);
	
	
	
	
	/*
	 * 查询某个角色的所有订单
	 * 1.根据名字获取该角色的个人信息
	 * 2.根据个人信息id获取该角色的账号id信息
	 * 3.根据账号id获取该角色的订单id
	 * 4.根据订单id获取所有的订单项id
	 * 5.根据个人信息id获取房间id
	 */
	@Select("select * from t_info where uname like CONCAT('%',#{uname},'%') or tel like #{tel}")
	@Results({
		@Result(id=true,column="infoid",property="infoid"),
		@Result(column="infoid",property="orders",many=@Many(select="findOrders"))
	})
	public List<Info> findInfo(Info info);
	
	@Select("select * from t_order")
	@Results({
		@Result(id=true,column="orderid",property="orderid"),
		@Result(column="orderid",property="oderItems",many=@Many(select="findItem"))
	})
	public List<Order> findOrders();
	
	@Select("select * from t_orderitem where orderid=#{orderid}")
	public List<OrderItem> findItem(Integer orderid);
	
	
	
	/*@Select("select * from t_info where uname=#{uname} or infoid=#{infoid}")
	public Info findInfo(Info info);*/
	@Select("select * from t_user where infoid=#{infoid} or tel=#{tel}")
	public User findUser(Info info);
	@Select("select * from t_order where infoid=#{infoid}")
	@Results({
		@Result(id=true,column="orderid",property="orderid"),
		@Result(column="orderid",property="oderItems",many=@Many(select="findAllItemByUserid"))
	})
	public Order findOder(Integer infoid);
	@Select("select * from t_orderitem where orderid=#{orderid} and flag=1")
	public List<OrderItem> findAllItemByUserid(Integer orderid);
	@Select("select * from t-liveinfo where infoid=#{infoid}")
	public List<LiveNotes> findAllInforByinfoid(Integer infoid);
	
	
	
	
	/*
	 * 查询修改订单信息
	 */
	@Select("select * from t_orderitem where id=#{id}")
	public OrderItem findOrderItem(Integer id);
	@Select("select * from t_order where orderid=#{orderid}")
	public Order findOrder(Integer orderid);
	@Select("select * from t_info where infoid=#{infoid}")
	public Info findOneInfo(Integer infoid);
	/*
	 * 修改订单：从前端传入个人信息id
	 * 1.修改个人信息表
	 * 2.修改订单表
	 * 3.修改订单项表
	 */
	@Update("update t_info set uname=#{uname},tel=#{tel} where infoid = #{infoid}")
	public Boolean updateInfo(Info info);
	@Update("update t_order set updatetime=#{updatetime} where flag = 1")
	public void updateOrder(Order order);
	@Update("update t_orderitem set starttime=#{starttime},endtime=#{endtime},day=#{day},typeid=#{typeid} where orderid=#{orderid} and flag = 1")
	public void updateOrderItem(OrderItem orderItem);


	// 1 表示 已入住订单 收入 日
	@Select("select sum(total) from t_order where TO_DAYS(createtime) = TO_DAYS(#{daytime}) AND flag = 1")
	public Double findMoneyDayIn(Date daytime);

	// 2 表示 退款订单 退款 日
	@Select("select sum(total) from t_order where TO_DAYS(createtime) = TO_DAYS(#{daytime}) AND flag = 2")
	public Double findMoneyDayOut(Date daytime);

	// 1 表示 已入住订单 收入 月
	@Select("select sum(total) from t_order where date_format(createtime,'%Y-%m')=date_format(#{Monthtime},'%Y-%m') AND flag = 1")
	public Double findMoneyMonthIn(String Monthtime);

	// 2 表示 退款订单 退款 月
	@Select("select sum(total) from t_order where date_format(createtime,'%Y-%m')=date_format(#{Monthtime},'%Y-%m') AND flag = 2")
	public Double findMoneyMonthOut(String Monthtime);

	//  修改订单  结账处理
	@Update("UPDATE t_orderitem SET falg = 2 WHERE  houseid= #{houseid} AND  flag = 1")
	public Boolean settleAccounts(String houseid);

	
	// 查询订单里的订单项 有没有  没有结账的id
	@Select("SELECT id FROM t_orderitem WHERE orderid = (SELECT orderid FROM t_orderitem WHERE houseid = #{houseid} ) AND  flag = 1")
	public List<Integer> isNoSettle(String houseid);
	
	
	// order表改成  完成状态
	
	@Update("UPDATE t_order SET flag = 2 WHERE orderid = (SELECT orderid FROM t_orderitem WHERE houseid = #{houseid} )  AND  flag = 1")
	public Boolean changeOrderFlag(String houseid);

	//添加订单的用户信息，code by sxj
	@Insert("insert into t_info(tel,uname,sex,idcard) values(#{tel},#{name},#{sex},#{idcard})")
	public void addInfoByOrder(String tel, String name, String sex, String idcard);


	@Select("select * from t_info where tel=#{tel}")
	public Info findInfoByTel(String tel);


	//添加订单，code by sxj
	@Insert("insert into t_order(createtime,ordernumber,message,infoid,payway,total,userid) values(#{currenttime},#{ordernumber},#{message},#{infoid},#{payway},#{total},#{userid})")
	public void addOrderInfo(String currenttime, String ordernumber, String message, Integer infoid, String payway, Double total, Integer userid);

	//返回订单id
	@Select("select orderid from t_order where ordernumber=#{ordernumber}")
	public Integer findOrderidByOrdernumebr(String ordernumber);

	//添加订单项
    @Insert("insert into t_orderitem(houseid,starttime,endtime,typeid,day,orderid,quantity,price) values(#{integer},#{starttime},#{endtime},#{typeid},#{day},#{orderid},1,80)")
    void addOrderitem(Integer integer, String starttime, String endtime, int typeid, int day, Integer orderid);




    //检索订单（包含订单项）
    @Select("select * from t_order where userid=#{userid}")
	@Results({
			@Result(id=true,column = "orderid",property = "orderid"),
			@Result(id=true,column = "userid",property = "userid"),
			@Result(column = "message",property = "message"),
			@Result(column = "infoid",property = "infoid"),
			@Result(column = "updatetime",property = "updatetime"),
			@Result(column = "ordernumber",property = "ordernumber"),
			@Result(column = "payway",property = "payway"),
			@Result(column = "payway",property = "payway"),
			@Result(column = "total",property = "total"),
			@Result(column = "flag",property = "flag"),
			@Result(column = "orderid",property = "oderItems",
					many = @Many(select = "com.hero.hotel.dao.OrderDao.findOrderItemByOrderid")
			)
	})
	public Order findOrderByUserid(Integer userid);

    @Select("select * from t_orderitem where orderid=#{orderid}")
	public List<OrderItem> findOrderItemByOrderid(Integer orderid);
}
