package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.RolePermission;

public interface RolePermissionDao {
	//获取所有权限
	@Select("select * from t_permission where flag=1") 
	public List<RolePermission> findAllPermissions();
	//根据角色id查找其对应的所有权限
	@Select("select 8 from t_permission where rid=#{id}")
	public RolePermission findPermissionsByRid(Integer id);

}
