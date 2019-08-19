package com.yc.blog.web;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.yc.blog.biz.ComentBiz;
import com.yc.blog.vo.result;
import com.yc.boke.bean.Comment;
import com.yc.boke.bean.User;

@RestController
public class ComentAction {
	
	@Resource
	private ComentBiz cb;
	
	@PostMapping("comment")
	public result comment(@Valid Comment comm,Errors errors,
			@SessionAttribute(name="loginedUser",required=false) User user){
		
		if(user==null){
			return new result(0,"请先进行登录再评论");
		}
		//设置评论人
		comm.setCreateby(user.getId());
		
		if(errors.hasErrors()){
			return new result(0,"评论失败",errors.getAllErrors());
		}
		try{
		cb.comment(comm);
		return new result(1,"评论成功",comm);
		}catch(RuntimeException e){
			e.printStackTrace();
			return new result(0,"业务繁忙，请稍后再试");
		}
	}
}
