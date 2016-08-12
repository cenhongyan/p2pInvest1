package com.android.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.android.entity.Borrower;
import com.android.entity.Borrowerinfo;
import com.android.service.BorrowerService;
import com.android.service.BorrowerinfoService;

@Controller
public class BorrowerController {

  @Resource
  private BorrowerService borrowerService;
 
  @RequestMapping("borrower")
  @ResponseBody
  public String selectAll(){
	  List<Borrower> borrowerList = borrowerService.selectAll();  
	  return  JSON.toJSONString(borrowerList);
  }

  
  @RequestMapping("transfer")
  @ResponseBody
  public String selectByAll(){
	  List<Borrower> borrowerList = borrowerService.selectByAll();  
	  return  JSON.toJSONString(borrowerList);
  }
  
  
  @RequestMapping("borrowerForId")
  @ResponseBody
  public String selectById(int id){
	  Borrower borrowerList = borrowerService.selectById(id);  
	  return  JSON.toJSONString(borrowerList);
  }
  
  @RequestMapping("borrowerInvest")
  @ResponseBody
  public String select(){
	  System.out.println("进入--->>>");
	  Borrower borrowerList = new Borrower(); 
	  return  JSON.toJSONString(borrowerList);
  }
  
}
