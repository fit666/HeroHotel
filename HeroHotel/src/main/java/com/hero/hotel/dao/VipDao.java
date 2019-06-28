package com.hero.hotel.dao;

import java.util.List;


import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.Vip;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hero.hotel.pojo.Vip;



public interface VipDao {
	@Select("select vname,discount where vmoney=#{i}")
	public Vip queryClassByMoney(int i);
	
	@Select("select * from t_vip ")
	public List<Vip> queryAllVip();

	//根据累计消费查找vip信息
/*	@Select("SELECT * FROM t_vip WHERE id = (select MAX(id) from t_vip where id =(select MAX(id) from t_vip WHERE vmoney<#{monetary}) or id= (select MIN(id) from t_vip WHERE vmoney>#{monetary}))")*/
	@Select("SELECT * FROM t_vip WHERE id =(select MAX(id) from t_vip WHERE vmoney<#{monetary})")
	public Vip findById(double monetary);
	//获取所有的vip信息
	@Select("select * from t_vip where flag=1")
	public List<Vip> findAllVips();
	//修改vip信息
	@Update("update t_vip set vmoney=#{vmoney},discount=#{discount} where id=#{id}")
	public boolean updateVip(Vip vip);
	// 删除vip
	@Update("update t_vip set flag=0 where id=#{id}")
	public boolean vipDel(Vip vip);
	//添加vip信息
	@Insert("insert into t_vip(vname,vmoney,discount) values(#{vname},#{vmoney},#{discount})")
	public boolean addVip(Vip vip);

}
