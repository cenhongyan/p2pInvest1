package com.android.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.android.dao.TypeDao;
import com.android.entity.Type;

@Service
public class TypeService {
  
	@Resource
	TypeDao typeDao;
	
	public List<Type> selectAll(){
		return typeDao.selectAll();
	}
	
}
