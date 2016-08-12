package com.android.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.print.attribute.HashAttributeSet;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.android.entity.EncodingTool;
import com.android.entity.LoginResult;
import com.android.entity.User;
import com.android.service.UserService;

@Controller
public class LoginController {
	
	@Resource
	UserService userService;
	
	@RequestMapping(value="login",produces="application/json;charset=utf-8")
	@ResponseBody
	public String login(@RequestParam("username")String username,@RequestParam("password")String password,HttpSession session){
		
		HashMap<String, Object> map = new HashMap<>();
		
		User user = new User();
		user.setUserName(username);
		user.setPassword(password);
		
		if(session.getAttribute("user") != null)
		{
			  User user1 = (User) session.getAttribute("user");
			  map.put("msg", "登陆成功");
			  map.put("code", 0);
			  map.put("user", user1);
			  return JSON.toJSONString(map);
		}
		

		User u = userService.selectByName(EncodingTool.encodeStr(username));

		if(u != null)
		{
			if(u.getPassword().equals(password))
			{
				map.put("msg", LoginResult.SUCCESS);
				//持久化session
				session.setAttribute("user", u);
			}else{
				map.put("msg", LoginResult.WRONG_PASSWORD);
			}
		}else
		{
			map.put("msg", LoginResult.WRONG_USERNAME);
		}
		return JSON.toJSONString(map);
	}
	
	@RequestMapping(value="userlogin",produces="application/json;charset=utf-8")
	@ResponseBody
	public String login1(User user,HttpSession session){
		
		System.out.println("进入userlogin"+user.getUserName());
		HashMap<String, Object> map = new HashMap<>();
		if (session.getAttribute("user") !=null){
			User u = (User) session.getAttribute("user");
			map.put("msg", "登录成功");
			map.put("code",0);
			map.put("user", u);
			return JSON.toJSONString(map);
		}
		
		User temp = userService.selectByName(user.getUserName());
		if (temp!=null){
			if (temp.getPassword().equals(user.getPassword())){
				map.put("msg", "登录成功");
				map.put("code",0);
				map.put("user", temp);
				//持久化session
				session.setAttribute("user", temp);
				System.out.println("当前session为"+temp);
			}else{
				map.put("msg", "用户名密码不匹配");
			}
		}else{
			map.put("msg", "用户名不存在");
		}
		return JSON.toJSONString(map);
	}
	
	
  
       
    

}
