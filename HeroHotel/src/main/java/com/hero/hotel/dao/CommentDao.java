package com.hero.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hero.hotel.pojo.Comment;

public interface CommentDao {
	//查找所有评论,PageNum当前页
	@Select("select * from t_comment where flag=1 order by id desc limit #{pageNum},10")
	public List<Comment> findAll( Integer pageNum );

	//查找评论总数
	@Select("select count(*) from t_comment where flag=1")
	public Integer findAllNumber();
	
	//添加评论
	@Insert("insert into t_comment(orderid,createtime,massage,userid,name) values(#{orderid},#{createtime},#{massage},#{name}) ")
	public Boolean addComment(Comment comment);
}
