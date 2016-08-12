package com.android.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.android.entity.User;

public interface UserDao {

	@Select("select * from user")
   List<User> selectAll();
	
	@Select("select * from user where username = #{userName}")
	User  selectByName(String name);
	
}
