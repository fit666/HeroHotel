package com.hero.hotel.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hero.hotel.pojo.Comment;
import com.hero.hotel.service.CommentService;

@Controller
@RequestMapping("/comment")
public class CommentController {
	private CommentService commentService;
	


	public CommentService getCommentService() {
		return commentService;
	}



	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}



	//查询所有的评论
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Comment> findAll(Integer PageNum){
		System.out.println(PageNum);
		List<Comment> comments=commentService.findAll(PageNum);
		return comments;
	}
	//查询所有数量
		@RequestMapping("/findtotal")
		@ResponseBody
		public Integer findTotal(){
			return commentService.findTotal();
		}
		
		//添加评论
		@RequestMapping("/addComment")
		@ResponseBody
		public Boolean addComment(Comment comment,HttpSession session){
			
			
			return commentService.addComment(comment, session);
		}
		
		

}
