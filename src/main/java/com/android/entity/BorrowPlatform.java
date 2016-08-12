package com.android.entity;

import java.util.List;

public class BorrowPlatform {
	
	private Integer id;
	private String name;
	private String title;
    private Integer peopleNum;
	private Double annualRate;
	private String imageUrl;
	private List<Borrower> borrower;

	
	@Override
	public String toString() {
		return "BorrowPlatform [id=" + id + ", name=" + name + ", title="
				+ title + ", peopleNum=" + peopleNum + ", annualRate="
				+ annualRate + ", imageUrl=" + imageUrl + ", borrower="
				+ borrower + "]";
	}
	public Integer getPeopleNum() {
		return peopleNum;
	}
	public void setPeopleNum(Integer peopleNum) {
		this.peopleNum = peopleNum;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getAnnualRate() {
		return annualRate;
	}
	public void setAnnualRate(Double annualRate) {
		this.annualRate = annualRate;
	}
	public List<Borrower> getBorrower() {
		return borrower;
	}
	public void setBorrower(List<Borrower> borrower) {
		this.borrower = borrower;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
