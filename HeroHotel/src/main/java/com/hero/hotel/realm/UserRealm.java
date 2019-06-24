package com.hero.hotel.realm;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.hero.hotel.dao.UserDao;
import com.hero.hotel.pojo.User;
import com.hero.hotel.service.UserService;
import com.hero.hotel.utils.RegexUtil;

public class UserRealm extends AuthorizingRealm {
	@Autowired
	private UserDao userDao;
	
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println("正在授权");
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//获取token中的账号
		String account=(String) token.getPrincipal();
		System.out.println("正在认证");
		//判断账号是手机号还是用户名，账号为字母开头，手机号为11位纯数字
		if(account.matches(RegexUtil.REGEX_MOBILE)) {
			//手机登录
			//从session中获取动态码
			HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
			        .getRequestAttributes()).getRequest();
			String tpl_value=(String) request.getSession().getAttribute("tpl_value");
			
			SimpleAuthenticationInfo info=
		new SimpleAuthenticationInfo(account,tpl_value,getName());
			return info;
			
		}else {
			//账号密码登录
			//从数据库中查找密码
			User u=new User();
			u.setAccount(account);
			User user=userDao.findAccountByAccount(u);
			
			SimpleAuthenticationInfo info=
					new SimpleAuthenticationInfo(account,user.getPassword(),getName());
			return info;
		}
	}

	

}
