package com.hero.hotel.service;

import java.util.List;

import com.hero.hotel.pojo.Role;
import com.hero.hotel.pojo.ThePermission;

public interface RolePermissionService {

	List<ThePermission> findAllPermissions();
	//修改管理员的权限
	String changePermissions(Role data);

}
