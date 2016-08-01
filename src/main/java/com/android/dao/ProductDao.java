package com.android.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.android.entity.Product;

public interface ProductDao {
	@Select("select * from product")
	List<Product> selectAll();
	
	@Select("select * from product where annualrate = (select max(annualrate) from product)")
	Product selectByMax();
	
	@Select("SELECT * FROM product WHERE tid=tid ORDER BY tid asc")
	List<Product> selectAllByOrder();

}
