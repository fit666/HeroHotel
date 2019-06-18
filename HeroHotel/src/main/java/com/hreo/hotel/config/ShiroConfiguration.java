package com.hreo.hotel.config;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hero.hotel.realm.MyRealm;

@Configuration
public class ShiroConfiguration {
	//1创建自定义realm
		@Bean
		public MyRealm myrealm() {
			System.out.println("创建myrealm");
			MyRealm myRealm=new MyRealm();
			return myRealm;
		}
		
		//2创建安全管理器
		@Bean
		public SecurityManager securityManager(MyRealm myRealm) {
			System.out.println("创建安全管理器");
			DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
			securityManager.setRealm(myRealm);
			return securityManager;
		}
		
	//3创建shiro过滤器
	@Bean
	public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager) {
		System.out.println("创建过滤器");
		ShiroFilterFactoryBean bean=new ShiroFilterFactoryBean();
		//配置安全管理器
		bean.setSecurityManager(securityManager);
		//配置拦截器
		//LinkedHashMap是一个根据某种规则有序的hashmap
		Map<String,String> map=new LinkedHashMap<String,String>();
		//配置无需认证的资源
		map.put("/index.html","anon");
		map.put("/register", "anon");
		map.put("/login", "anon");
		map.put("/druid/**", "anon");
		//配置登出
		map.put("/logout", "logout");
		
		//配置需要认证的资源
		map.put("/**", "authc");
		bean.setFilterChainDefinitionMap(map);
		//配置登录页面
		bean.setLoginUrl("/index.html");
		//配置登录成功后的页面
		bean.setSuccessUrl("/main.html");
		//配置未授权的	页面
		bean.setUnauthorizedUrl("/index.html");
		
		return bean;
	}
	
	
	
	
}
