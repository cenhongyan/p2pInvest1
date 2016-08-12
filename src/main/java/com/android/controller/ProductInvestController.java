package com.android.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.android.entity.ProductInvest;
import com.android.entity.User;
import com.android.service.ProductInvestService;
import com.android.service.UserService;

@Controller
public class ProductInvestController {

	@Resource
	ProductInvestService productInvestService;
	@Resource
	UserService userService;
	
	@RequestMapping("invest")
	@ResponseBody
	private String insert(HttpServletRequest request){
		
		String username = request.getParameter("username").trim();
		System.out.println(username);
		int pid = Integer.valueOf(request.getParameter("pid"));
		Double invest = Double.valueOf(request.getParameter("invest"));
		Map<String, Integer> map = new HashMap<String, Integer>();
	    System.out.println(username+","+pid+","+invest);
		User user = userService.selectByName(username);
		int uid = user.getId();
		
	    Long nowTime = System.currentTimeMillis();
		ProductInvest productInvest = new ProductInvest();
		productInvest.setPid(pid);
		productInvest.setUid(uid);
		productInvest.setStatus(0);
		productInvest.setInvestMoney(invest);
		productInvest.setStartTime(nowTime);
		
	int flag  =	productInvestService.insert(productInvest);
	
	if(flag >= 1)
	{
		map.put("msg", 1);
		return JSON.toJSONString(map);
	}else {
		map.put("msg", 0);
		return JSON.toJSONString(map);
	}
		
		
	}
	
	
	@RequestMapping("productInvest")
	@ResponseBody
	public String selectAll(String status){
		List<ProductInvest> list = productInvestService.selectAll(Integer.valueOf(status));
		return JSON.toJSONString(list);
	}	
}
