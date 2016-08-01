package com.android.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.android.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("users")
   public String getAllUsers(Model model){
	   model.addAttribute("users", userService.selectAll());
	   return "users";
   }
}
