package com.android.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.android.entity.ProductInvest;

public interface ProductInvestDao {

	@Insert("insert into productinvest(id,pid,uid,status,starttime,investMoney) values(#{id},#{pid},#{uid},#{status},#{startTime},#{investMoney})")
	int insert(ProductInvest invest);

  
	List<ProductInvest> selectAll(int status);
}
