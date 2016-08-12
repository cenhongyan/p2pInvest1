package com.android.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.android.entity.Product;

public interface ProductDao {
	@Select("select * from product")
	List<Product> selectAll();
	
	@Select("select * from product where annualrate = (select max(annualrate) from product)")
	Product selectByMax();
	
/*	@Select("SELECT * FROM product WHERE tid=tid ORDER BY tid asc")
	List<Product> selectAllByOrder();*/
	
/*	@Select("SELECT p.* ,t.type FROM product p,type t WHERE t.id = p.tid ORDER BY tid ")*/
	List<Product> selectAllByOrder();
	
	@Insert("insert into product(id,name,title,annualrate,timelimit,investmoney,starttime,total,startmoney,peoplenum,introduce,receivedway,tid) "
			+ "value(#{id},#{name},#{title},#{annualRate},#{timeLimit},#{investMoney},#{startTime}"
			+ ",#{total},#{startMoney},#{peopleNum},#{introduce},#{receivedWay},#{type.getId()})")
	  int insert(Product product);
	
	@Select("select * from product where id = #{id}")
	Product selectById(int id);

}
