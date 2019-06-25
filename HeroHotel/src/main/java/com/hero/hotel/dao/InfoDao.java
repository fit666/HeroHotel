package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.hero.hotel.pojo.Info;


public interface InfoDao {
	@Select("select infoid,uname,sex,idcard,tel where tel=#{tel}")
	public List<Info> queryInfoByTel(String tel);
	
	@Update("insert into t_info(tel,uname,sex,idcard) values(#{tel},#{uname},#{sex},#{idcard})")
	public int addInfo(Info info);
}
