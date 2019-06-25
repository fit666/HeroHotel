package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hero.hotel.pojo.User;


public interface UserDao {
	
	//查询所有用户
	@Select("select * from t_user where roleid=1 and flag!=0")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="account",property="account"),
		@Result(column="tel",property="tel"),
		@Result(column="createtime",property="createtime"),
		@Result(column="monetary",property="monetary"),
		@Result(column="infoid",property="info",
				one=@One(select="com.hero.hotel.dao.InfoDao.findById")
		),
		@Result(column="monetary",property="vip",
				one=@One(select="com.hero.hotel.dao.VipDao.findById")
		)
	})
	public List<User> findAll();
	
	//查询数据库用户名（注册时使用）
	@Select("select * from t_user where account=#{account}")
	public User findAccountByAccount(User user);
	
	//插入注册的信息到数据库（注册时使用）
	@Insert("insert into t_user(account,password,tel,createtime) values(#{account},#{password},#{tel},#{createtime})")
	public boolean insertAccount(User user);
	//停用vip账号
	@Update("update t_user set flag=2 where id=#{id}")
	public boolean vipStop(Integer id);
	//启用vip账号
	@Update("update t_user set flag=1 where id=#{id}")
	public boolean vipStart(Integer id);
	//删除用户
	@Update("update t_user set flag=0 where id=#{id}")
	public boolean userDelete(Integer id);
	//获取所有已删除的会员
	@Select("select * from t_user where roleid=1 and flag=0")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="account",property="account"),
		@Result(column="tel",property="tel"),
		@Result(column="createtime",property="createtime"),
		@Result(column="monetary",property="monetary"),
		@Result(column="infoid",property="info",
				one=@One(select="com.hero.hotel.dao.InfoDao.findById")
		),
		@Result(column="monetary",property="vip",
				one=@One(select="com.hero.hotel.dao.VipDao.findById")
		)
	})
	public List<User> findAllDeletedVips();
	
	

}