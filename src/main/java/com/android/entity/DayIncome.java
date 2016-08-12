package com.android.entity;

public class DayIncome {

	private Integer id;
	private Double income;
	private long time;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getIncome() {
		return income;
	}
	public void setIncome(Double income) {
		this.income = income;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "DayIncome [id=" + id + ", income=" + income + ", time=" + time
				+ "]";
	}
	
	
	
}
