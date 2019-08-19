package com.yc.blog.web;
import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yc.blog.biz.BizException;
import com.yc.blog.biz.UserBiz;
import com.yc.blog.vo.result;
import com.yc.boke.bean.User;

@RestController
@SessionAttributes("loginedUser")
public class UserAction {
	
	@Resource
	private UserBiz ub;
	
	@PostMapping("login")
	public result login(String name,String password,Model model) throws BizException{
		try{
			User user=ub.login(name,password);
			model.addAttribute("loginedUser", user);
			return new result(1,"ok",user);
		}catch(BizException e){
			return new result(0,e.getMessage());
		}catch(RuntimeException e){
			e.printStackTrace();
			//掩盖错误
			return new result(0, "业务繁忙，请稍后再试！");
		}
	}
}
