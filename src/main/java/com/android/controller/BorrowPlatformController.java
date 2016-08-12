package com.android.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.android.entity.BorrowPlatform;
import com.android.service.BorrowPlatformService;
@Controller
public class BorrowPlatformController {

	 @Resource
	BorrowPlatformService borrowPlatformService;
	 
	 @RequestMapping("platform")
	 @ResponseBody
	 public String selectAll(){
		 List<BorrowPlatform> list = borrowPlatformService.selectAll();
		 return JSON.toJSONString(list);
	 }
	  
}
