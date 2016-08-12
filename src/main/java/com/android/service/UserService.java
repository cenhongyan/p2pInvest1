package com.android.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.android.dao.UserDao;
import com.android.entity.User;

@Service
public class UserService {

	@Resource
	 UserDao userDao;
	public List<User> selectAll(){
		return userDao.selectAll();
	}
	
	public User selectByName(String name){
		return userDao.selectByName(name);
	}
}
