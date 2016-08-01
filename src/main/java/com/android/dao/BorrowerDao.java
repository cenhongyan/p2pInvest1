package com.android.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.android.entity.Borrower;

public interface BorrowerDao {

	@Select("select * from borrower")
	List<Borrower> selectAll();
}
