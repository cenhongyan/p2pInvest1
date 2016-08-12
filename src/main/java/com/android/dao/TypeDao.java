package com.android.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.android.entity.Type;

public interface TypeDao {
	
	@Select("select * from type")
    List<Type> selectAll();
}
