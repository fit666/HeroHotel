package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hero.hotel.pojo.House;
import com.hero.hotel.pojo.LiveNotes;

public interface HouseDao {

	@Select("select * from t_House")
	public List<House> findRoomAllStatus();

	@Select("select * from t_House where flag=#{flag}")
	public List<House> findRooms(Integer flag);

	@Select("select roomid from orderinfor where today=#{time} and flag=0")
	public List<Integer> findOrderInforRid(String time);

	// 修改 房间状态
	@Update("UPDATE t_house SET flag = #{flag} WHERE houseid = #{houseid} ")
	public Boolean changeHouseTypeByHouseid(@Param("flag") Integer flag, @Param("houseid") Integer houseid);

	@Select("select * from livenotes where typeid=#{typeid}")
	List<LiveNotes> findHouseByType(Integer typeid);

	@Select("select id from house where typeid=#{typeid}")
	List<Integer> findHouseidByType(Integer typeid);

	@Insert("insert into livenotes(houseid,typeid,date,infoid,flag) values(#{houseid},#{typeid},#{s},#{infoid},1)")
	public void addDay(Integer houseid, int typeid, String s, Integer infoid);

}