package com.android.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
	      List<Product> product = productDao.selectAll();
	        	
		  return product;
	}
	
	public List<Product> selectAllByOrder(){
		return productDao.selectAllByOrder();
	}
	
	
	public Product selectByMax(){
		
		/* Date date = new Date();
	    	
	    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	    	
	    	String sDate =sdf.format(date);
	    	Product product = productDao.selectByMax();
	    	product.setStartTime(sDate);*/
		   return productDao.selectByMax();
	}
	
	public Product selectById(int id){
		
       /* Date date = new Date();
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    	
    	String sDate =sdf.format(date);
    	Product product = productDao.selectById(id);
    	product.setStartTime(sDate);
		*/
		return productDao.selectById(id);
	}

}
