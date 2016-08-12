package com.android.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.android.entity.Transfer;

public interface TransferDao {
	
	@Select("select * from transfer")
	List<Transfer> selectAll();

}
