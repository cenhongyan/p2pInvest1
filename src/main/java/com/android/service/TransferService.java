package com.android.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.android.dao.TransferDao;
import com.android.entity.Transfer;


@Service
public class TransferService {
	@Resource
	TransferDao transferDao;
	
	public List<Transfer> selectAll(){
		return transferDao.selectAll();
	}

}
