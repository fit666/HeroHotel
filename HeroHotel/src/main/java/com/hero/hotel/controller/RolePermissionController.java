package com.hero.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hero.hotel.pojo.RolePermission;
import com.hero.hotel.service.RolePermissionService;

@Controller
@RequestMapping("/permission")
public class RolePermissionController {
	@Autowired
	private RolePermissionService rolePermissionService;
	/*
	 * 获取所有角色的权限
	 */
	@RequestMapping("/findAllPermission")
	public ModelAndView findAllPermission(@RequestParam("id") Integer id){
		ModelAndView mav=new ModelAndView();
		System.out.println(id);
		//所有角色的权限
		List<RolePermission> permissions=rolePermissionService.findAllPermissions();
		
		//获取指定id角色的权限
		RolePermission rolePermission=rolePermissionService.findPermissionsByRid(id);
		System.out.println(rolePermission);
		mav.addObject("permissions", permissions);
		mav.addObject("rolePermission",rolePermission);
		mav.setViewName("/backstage-html/manager-permission-update.html");
		
		return mav;
	}
	
}
