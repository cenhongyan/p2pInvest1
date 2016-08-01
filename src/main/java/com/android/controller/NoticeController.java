package com.android.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.android.entity.Notice;
import com.android.entity.Product;
import com.android.service.NoticeService;
import com.android.service.ProductService;

@Controller
public class NoticeController {
	@Resource
	private NoticeService noticeService;
	@Resource
    private ProductService productService;
	@RequestMapping("notice")
	@ResponseBody
	public String selectAll(){
		
		List<Notice> notice = noticeService.selectAll();
	    
		
		return "";
	}
	
	

}
