package com.android.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.android.entity.Borrower;

public interface BorrowerDao {

	
	List<Borrower> selectAll();
	
	

	List<Borrower> selectByAll();
	
	//@Select("select * from borrower where id = #{id} UNION select * from borrowerinfo where bid = #{id}")
    Borrower selectById(int id);
	
}
