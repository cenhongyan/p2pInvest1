package com.android.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.android.dao.BorrowPlatformDao;
import com.android.entity.BorrowPlatform;
@Service
public class BorrowPlatformService {
	@Resource
	BorrowPlatformDao borrowPlatformDao;
	public int delete(int id){
		return borrowPlatformDao.delete(id);
	}
	
	public int insert(BorrowPlatform borrowPlatform) {
		 return borrowPlatformDao.insert(borrowPlatform);
	}

	public int update(BorrowPlatform borrowPlatform) {
		 return borrowPlatformDao.update(borrowPlatform);
	}
	
	public List<BorrowPlatform> selectAll(){
		 return borrowPlatformDao.selectAll();
	}
}
