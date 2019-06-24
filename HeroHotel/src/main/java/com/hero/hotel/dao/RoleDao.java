package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.Role;

public interface RoleDao {
	
	@Select("select * from t_role where flag=1") 
	public List<Role> findAllRoles();

}
