package com.hero.hotel.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.Account;

public interface AccountDao {
	
	//查询数据库用户名（注册时使用）
	@Select("select * from account where account=#{account}")
	public Account findAccountByAccount(Account account);
	
	//插入注册的信息到数据库（注册时使用）
	@Insert("insert into account(account,password,tell,registertime) values(#{account},#{password},#{tell},#{registertime})")
	public boolean insertAccount(Account account);
}
