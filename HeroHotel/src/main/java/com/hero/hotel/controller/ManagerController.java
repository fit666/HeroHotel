package com.hero.hotel.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hero.hotel.pojo.Manager;
import com.hero.hotel.realm.CustomizedToken;
import com.woniu.hotel.enump.LoginType;

@Controller
@RequestMapping("/manager")
public class ManagerController {
	
	private static final String MANAGER_LOGIN_TYPE = LoginType.MANAGER.toString();
	 
    @RequestMapping("/login")
    public String login(Manager manager){
        Subject currentUser = SecurityUtils.getSubject();
        if(!currentUser.isAuthenticated()){
            CustomizedToken customizedToken = new CustomizedToken(manager.getMacCount(),manager.getPassword(), MANAGER_LOGIN_TYPE);
            //记住我
            if(manager.getRm()==1){
            	customizedToken.setRememberMe(true);
            }
            
            try {
                currentUser.login(customizedToken);
                return "admin/index";
            } catch (IncorrectCredentialsException ice) {
                System.out.println("用户名/密码不匹配！");
            } catch (LockedAccountException lae) {
                System.out.println("账户已被冻结！");
            } catch (AuthenticationException ae) {
                System.out.println(ae.getMessage());
            }
        }
        return "登录失败";
    }

}
