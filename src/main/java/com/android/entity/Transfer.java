package com.android.entity;

import java.util.List;

public class Transfer {
	
	private Integer id;
	//private List<Borrower> borrower;
	private Integer bid;
	@Override
	public String toString() {
		return "Transfer [id=" + id + ", bid=" + bid + ", uid=" + uid + "]";
	}
	private Integer uid;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
}
