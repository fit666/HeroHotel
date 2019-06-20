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
		System.out.println("正在验证");
		//获取账号
		Integer account=Integer.parseInt((String)token.getPrincipal());
				
		Manager manager=managerService.findManagerPwd(account);
				
		if(manager==null){
			return null;
		}
		SimpleAuthenticationInfo info=
				new SimpleAuthenticationInfo(manager.getMacCount().toString(),manager.getPassword(),getName());
				
		return info;
	}

}
