package com.hero.hotel.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hero.hotel.dao.AccountDao;
import com.hero.hotel.pojo.Account;
import com.hero.hotel.service.AccountService;
@Service("accountService")
public class AccountServiceImpl implements AccountService{
	@Resource
	private AccountDao accountDao;
	@Override
	public List<Account> findAllVip() {
		return accountDao.findAll();
	}

}
