package com.hero.hotel.service;


import com.hero.hotel.pojo.User;

public interface UserService {

	public User queryInfo(int account);

	public int updatePwd(User user);

}
