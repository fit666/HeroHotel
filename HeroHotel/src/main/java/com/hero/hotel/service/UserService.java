package com.hero.hotel.service;



import com.hero.hotel.pojo.Account;

public interface UserService {
	
	public String register(Account account);
	public String sendMessage(Account account);
}
