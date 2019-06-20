package com.hero.hotel.dao;

import com.hero.hotel.pojo.Reserve;
import org.apache.ibatis.annotations.Insert;

public interface Reserve_Dao {
    @Insert("insert into(lid,arrivetime,depositmoney,leavemessaege,autocancel," +
            "reserveorderstarttime,paynumber,discount,orderstatus,reservenumber," +
            "flag) reserve values(#{lid},#{arriveTime},#{depositMoney},#{leaveMessage}" +
            ",#{autoCancel},#{reverseOrderStartTime},#{payNumber},#{discount}," +
            "#{orderStatus},#{reserveNumber},#{flag})")
    public void addReserve(Reserve reserve);
}
