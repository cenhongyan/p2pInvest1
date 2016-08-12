package com.android.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.android.dao.DayIncomeDao;
import com.android.entity.DayIncome;

@Service
public class DayIncomeService {
	
	@Resource
	DayIncomeDao dayIncomeDao;
	
	public int insert()
	{
		
		
	    return 0;
	}
    
}
