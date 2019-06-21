package com.hero.hotel.dao;

import com.hero.hotel.pojo.Reserve;
import com.hero.hotel.pojo.ReserveInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface Reserve_Dao {
    @Insert("insert into(lid,arrivetime,depositmoney,leavemessaege,autocancel," +
            "reserveorderstarttime,paynumber,discount,orderstatus,reservenumber," +
            "flag) reserve values(#{lid},#{arriveTime},#{depositMoney},#{leaveMessage}" +
            ",#{autoCancel},#{reverseOrderStartTime},#{payNumber},#{discount}," +
            "#{orderStatus},#{reserveNumber},#{flag})")
    public void addReserve(Reserve reserve);

    //模糊查询，根据名字查找该用户的预订单情况
    @Select("select * from reserve")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="lid",property="lid"),
            @Result(column="arrivetime",property="arriveTime"),
            @Result(column="leavemessage",property="leaveMessage"),
            @Result(column="autocancel",property="autoCancel"),
            @Result(column="reserveorderstarttime",property="reserveOrderStartTime"),
            @Result(column="paynumber",property="paynumber"),
            @Result(column="discount",property="discount"),
            @Result(column="orderstatus",property="orderStatus"),
            @Result(column="flag",property="flag"),
            @Result(column="id",property="reserveInfos",
                many=@Many(select="com.hero.hotel.dao.Reserve_Dao.findInfoByReserveid")
            )
    })
    public List<com.hero.hotel.pojo.sxj.Reserve> findReserveByName(String name);

    @Select("select * from reserveinfor where reserveid=#{reserveid}")
    public List<ReserveInfo>  findInfoByReserveid(int reserveid);
}
