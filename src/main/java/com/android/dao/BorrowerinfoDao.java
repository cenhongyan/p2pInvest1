package com.android.dao;

import org.apache.ibatis.annotations.Select;

import com.android.entity.Borrower;
import com.android.entity.Borrowerinfo;


public interface BorrowerinfoDao  {


	public Borrowerinfo selectById(int id);
}
