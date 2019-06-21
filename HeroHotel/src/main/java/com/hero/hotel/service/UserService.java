package com.hero.hotel.service;



import com.hero.hotel.pojo.User;

public interface UserService {
	
	public String register(User user);
	public String sendMessage(User user);
}
