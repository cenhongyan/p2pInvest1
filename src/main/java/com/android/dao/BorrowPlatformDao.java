package com.android.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.android.entity.BorrowPlatform;

public interface BorrowPlatformDao {

	@Delete("delete from borrowplatform where id = #{id}")
	int delete(int id);
	
	@Insert("insert into borrowplatform(id,name,title,peoplenum,annualrate) value(#{id},#{name},#{title},#{peopleNum},#{annualRate})")
	int insert(BorrowPlatform borrowPlatform);
	
	@Update("update borrowplatform set name = #{name} , title = #{title},"
			+ " peoplenum = #{peopleNum},annualrate=#{annualRate} where id = #{id}")
	int update(BorrowPlatform borrowPlatform);
	
	@Select("select * from borrowplatform")
	List<BorrowPlatform> selectAll();
	
}
