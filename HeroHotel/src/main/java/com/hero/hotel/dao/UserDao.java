package com.hero.hotel.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.User;

public interface UserDao {
	
	//查询数据库用户名（注册时使用）
	@Select("select * from t_user where account=#{account}")
	public User findAccountByAccount(User user);
	
	//插入注册的信息到数据库（注册时使用）
	@Insert("insert into t_user(account,password,tel,createtime) values(#{account},#{password},#{tel},#{createtime})")
	public boolean insertAccount(User user);
}
