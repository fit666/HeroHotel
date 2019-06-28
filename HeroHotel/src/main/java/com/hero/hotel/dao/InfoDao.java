package com.hero.hotel.dao;


import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.hero.hotel.pojo.Info;
import org.apache.ibatis.annotations.Insert;




public interface InfoDao {
	@Select("select id,uname,sex,idcard,tel from t_info where userid=#{id}")
	public List<Info> queryInfoByTel(Integer id);
	
	@Insert("insert into t_info(tel,uname,sex,idcard,userid) values(#{tel},#{uname},#{sex},#{idcard},#{userid})")
	public int addInfo(Info info);

	//根据id查找用户信息
	@Select("select * from t_info where infoid=#{infoid}")
	public Info findById(Integer infoid);
	//更新管理员的个人信息
	@Update("update t_info set tel=#{tel},uname=#{uname},sex=#{sex} where infoid=#{infoid}")
	public boolean updateManagerMessage(Info info);
	//获取新插入的个人信息的id
	@Select("select infoid from t_info where uname=#{uname} and sex=#{sex} and tel=#{tel} and idcard=#{idcard} and flag=1")
	public Integer findInfoidByInfo(Info info);

}
