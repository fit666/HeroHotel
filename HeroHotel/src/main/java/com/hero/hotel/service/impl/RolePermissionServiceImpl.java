package com.hero.hotel.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hero.hotel.dao.RolePermissionDao;
import com.hero.hotel.pojo.RolePermission;
import com.hero.hotel.service.RolePermissionService;

@Service("rolePermissionService")
public class RolePermissionServiceImpl implements RolePermissionService{
	@Resource
	private RolePermissionDao rolePermissionDao;
	/*
	 * 查询所有权限(non-Javadoc)
	 * @see com.hero.hotel.service.RolePermissionService#findAllPermissions()
	 */
	@Override
	public List<RolePermission> findAllPermissions() {
		
		return rolePermissionDao.findAllPermissions();
	}
	/*
	 * 根据角色id查找该角色对应的权限(non-Javadoc)
	 * @see com.hero.hotel.service.RolePermissionService#findPermissionsByRid(java.lang.Integer)
	 */
	@Override
	public RolePermission findPermissionsByRid(Integer id) {
		
		return rolePermissionDao.findPermissionsByRid(id);
	}
	
}
