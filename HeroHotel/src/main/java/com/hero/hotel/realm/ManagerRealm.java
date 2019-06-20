package com.hero.hotel.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.hero.hotel.pojo.Manager;
import com.hero.hotel.service.ManagerService;

public class ManagerRealm extends AuthorizingRealm{
	@Autowired
	private ManagerService managerService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println("正在授权");
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		System.out.println("manager正在验证");
		//获取账号
		Integer account=Integer.parseInt((String)token.getPrincipal());
		System.out.println(account+"realm里的account");	
		Manager manager=managerService.findManagerPwd(account);
		System.out.println(manager+"managerRealm----------");
				
		if(manager==null){
			return null;
		}
		SimpleAuthenticationInfo info=
				new SimpleAuthenticationInfo(manager.getMaccount().toString(),manager.getPassword(),getName());
				
		return info;
	}

}
