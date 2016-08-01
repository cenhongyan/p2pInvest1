package com.android.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.android.entity.Borrowerinfo;
import com.android.service.BorrowerinfoService;

@Controller
public class BorrowerinfoController {
	 @Resource
	  private BorrowerinfoService borrowerinfoService;
	 @RequestMapping("selectById")
	 @ResponseBody
	 public Borrowerinfo selectById(@RequestParam("id") int id){
		return borrowerinfoService.selectById(id);	 
	 }

}
