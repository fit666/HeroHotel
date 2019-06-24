package com.hero.hotel.service;

import java.util.List;

import com.hero.hotel.pojo.RolePermission;

public interface RolePermissionService {

	List<RolePermission> findAllPermissions();
	//根据角色id查询该角色拥有的权限
	RolePermission findPermissionsByRid(Integer id);

}
