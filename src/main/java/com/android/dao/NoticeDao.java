package com.android.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.android.entity.Notice;

public interface NoticeDao {
	
	@Select("select * from notice")
	public List<Notice> selectAll();
	
	@Select("select * from notice where id = #{id}")
	public Notice selectById(int id);

}
