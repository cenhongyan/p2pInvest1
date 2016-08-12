package com.android.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.android.dao.ProductInvestDao;
import com.android.entity.ProductInvest;

@Service
public class ProductInvestService {
	
	@Resource
	 ProductInvestDao productInvestDao;
	
	 public int insert(ProductInvest invest){
		return productInvestDao.insert(invest);
		
	}
	 
	 
	 public List<ProductInvest> selectAll(int status){
		return productInvestDao.selectAll(status);
		 
	 }

}
