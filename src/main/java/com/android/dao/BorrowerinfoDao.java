package com.android.dao;

import org.apache.ibatis.annotations.Select;

import com.android.entity.Borrowerinfo;


public interface BorrowerinfoDao  {
	
	@Select("select * from borrowerinfo where bid = #{id}")
	public Borrowerinfo selectById(int id);

}
