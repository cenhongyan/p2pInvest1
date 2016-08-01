package com.android.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.android.dao.NoticeDao;
import com.android.entity.Notice;

@Service
public class NoticeService {

	@Resource
	NoticeDao noticeDao;
	public List<Notice> selectAll(){
		return noticeDao.selectAll();
	}
	
	
	public Notice selectId(int id){
		return noticeDao.selectById(id);
	};
}
