package com.android.controller;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.android.entity.User;
import com.android.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("userInfo")
	@ResponseBody
     public String selectByName(String username){
	 User user = userService.selectByName(username);
	 return JSON.toJSONString(user);
   }
	
	@RequestMapping("judge")
	@ResponseBody
     public String judge(HttpServletRequest request){
		HashMap<String, Object> map = new HashMap<String, Object>();
		 Object user = request.getSession().getAttribute("user");
		 if(user == null)
		 {
			 map.put("code", 1);
			 return JSON.toJSONString(map);
		 }else{
			 user = (User)user;
		 }
		 map.put("code", 0);
		 map.put("user", user);
		// request.getSession().setAttribute(""+bid, true);
		 return JSON.toJSONString(map);
	
   }
	
	 @RequestMapping("user")
     public String selectuser(Model model){
	 return "users";
   }
}
