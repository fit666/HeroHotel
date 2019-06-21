package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.User;


public interface UserDao {
	
	//查询所有用户
	@Select("select * from user")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="account",property="account"),
		@Result(column="tell",property="tell"),
		@Result(column="registerTime",property="registerTime"),
		@Result(column="costAllMoney",property="costAllMoney"),
		@Result(column="uid",property="userInfor",
				one=@One(select="com.hero.hotel.dao.UserInforDao.findById")
		),
		@Result(column="mid",property="vip",
				one=@One(select="com.hero.hotel.dao.MembersDao.findById")
		)
	})
	public List<User> findAll();

}
