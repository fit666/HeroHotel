package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Many;

import com.hero.hotel.pojo.HouseType;

public interface HouseTypeDao {
	//查询所有房间信息
	@Select("select * from t_housetype where flag!=0")
	@Results({
		@Result(id=true,column="typeid",property="typeid"),
		@Result(column="price",property="price"),
		@Result(column="hname",property="hname"),
		@Result(column="serve",property="serve"),
		@Result(column="breakfast",property="breakfast"),
		@Result(column="typeid",property="houses",
			many=@Many(select="com.hero.hotel.dao.HouseDao.findAllByTypeid")
		)
	})
	List<HouseType> findAllHouses();
	//获取所有的房间类型
	@Select("select typeid,hname from t_housetype where flag!=0")
	List<HouseType> findAllType();
	
	List<HouseType> queryAllType();

}
