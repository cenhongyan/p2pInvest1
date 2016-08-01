package com.android.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.android.entity.Borrower;
import com.android.entity.Borrowerinfo;
import com.android.service.BorrowerService;
import com.android.service.BorrowerinfoService;

@Controller
public class BorrowerController {

  @Resource
  private BorrowerService borrowerService;
 
  
  public String selectAll(){
	  List<Borrower> borrowerList = borrowerService.selectAll();
	  
/*	  List infoList = new ArrayList<>();
	  for(Borrower borower:borrowerList)
	  {
		  Borrowerinfo borrowerinfo = borrowerinfoService.selectById(borower.getBid());
	  }*/
	  
	  return  JSON.toJSONString(borrowerList);
  }

}
