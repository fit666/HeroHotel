package com.hero.hotel.dao;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hero.hotel.pojo.User;

public interface UserDao {
	@Select("select account,password,tel,monetary,infoid from t_user where account=#{account} and flag=1")
	public User querySelf(int account);
	
	@Update("update t_user set password=#{password} where tel=#{tel}")
	public int updatePwd(User user);
}
