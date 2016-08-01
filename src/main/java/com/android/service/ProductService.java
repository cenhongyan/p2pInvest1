package com.android.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.android.dao.ProductDao;
import com.android.entity.Product;
@Service
public class ProductService {
	@Resource
	ProductDao productDao;
	public List<Product> selectAll(){
		return productDao.selectAll();
	}
	
	public List<Product> selectAllByOrder(){
		return productDao.selectAllByOrder();
	}
	
	
	public Product selectByMax(){
		return productDao.selectByMax();
	}

}
