package com.hero.hotel.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hero.hotel.pojo.Info;

public interface InfoDao {
	//根据id查找用户信息
	@Select("select * from t_info where infoid=#{infoid}")
	public Info findById(Integer infoid);
	//更新管理员的个人信息
	@Update("update t_info set tel=#{tel},uname=#{uname},sex=#{sex} where infoid=#{infoid}")
	public boolean updateManagerMessage(Info info);
	//添加管理员的个人信息
	@Insert("insert into t_info(uname,sex,tel,idcard) values(#{uname},#{sex},#{tel},#{idcard})")
	public boolean addInfo(Info info);
	//获取新插入的个人信息的id
	@Select("select infoid from t_info where uname=#{uname} and sex=#{sex} and tel=#{tel} and idcard=#{idcard} and flag=1")
	public Integer findInfoidByInfo(Info info);

}
