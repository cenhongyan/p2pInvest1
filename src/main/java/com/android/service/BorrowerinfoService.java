package com.android.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.android.dao.BorrowerinfoDao;
import com.android.entity.Borrowerinfo;

@Service
public class BorrowerinfoService {
    @Resource
	BorrowerinfoDao borrowerinfoDao;
	
	public Borrowerinfo selectById(int id){
		
		Borrowerinfo borrowerinfo = borrowerinfoDao.selectById(id);
		
		return borrowerinfo;
		
	}
}
