package com.android.dao;

import org.apache.ibatis.annotations.Insert;

import com.android.entity.DayIncome;

public interface DayIncomeDao {
	
	@Insert("insert into dayincome(id,income,time)values(#{id},#{income},#{time})")
	public void insert(DayIncome dayIncome);

}
