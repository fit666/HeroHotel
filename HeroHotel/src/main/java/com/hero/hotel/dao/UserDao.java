package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.User;


public interface UserDao {
	
	@Select("select * from users")
	public List<User> findUsers();

}
