package com.android.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.android.dao.BorrowerDao;
import com.android.entity.Borrower;

@Service
public class BorrowerService {
	@Resource
	BorrowerDao borrowerDao;
	public List<Borrower> selectAll(){
		return borrowerDao.selectAll();
	}

	public List<Borrower> selectByAll(){
		return borrowerDao.selectByAll();
	}
	
	public Borrower selectById(int id){
		return borrowerDao.selectById(id);
	}

}
