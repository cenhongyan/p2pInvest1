package com.android.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.android.entity.Borrowerinfo;
import com.android.entity.User;
import com.android.service.BorrowPlatformService;
import com.android.service.BorrowerinfoService;

@Controller
public class BorrowerinfoController {
	 @Resource
	  private BorrowerinfoService borrowerinfoService;
	 
	 
	 @RequestMapping("borrowerinfo")
	 @ResponseBody
	 public Borrowerinfo selectById(@RequestParam("bid") int bid){
		return borrowerinfoService.selectById(bid);	 
	 }
	 
	 @RequestMapping("BorrowBuy")
	 @ResponseBody
	 public String borrowBuy(int bid,HttpServletRequest request){
		 
		// Borrowerinfo borrowerinfo = borrowerinfoService.selectById(bid);
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
	 
	 @RequestMapping("productBuy")
	 @ResponseBody
	 public String productBuy(int bid,HttpServletRequest request,Model model){
		 Borrowerinfo borrowerinfo = borrowerinfoService.selectById(bid);
		 
		 if(borrowerinfo != null)
		 {
			 model.addAttribute("borrowerinfo",borrowerinfo);
			 return "productinfo";
		 }
		 
		 return "error";
	 }

}
