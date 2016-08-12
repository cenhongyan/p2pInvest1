package com.android.entity;

public class Borrowerinfo {
	private Integer id;
	private Integer uid;
	private String sex;
	private Integer birthday;
	private String address;

    private String tel;
	
	private Integer success;
	private Integer noRepayment;
	private Integer borrowMoney;
	private String limit;
	private Integer income;
	private String realName;
	private Integer isVerify;
	private Borrower borrower;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getBirthday() {
		return birthday;
	}
	public void setBirthday(Integer birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Integer getSuccess() {
		return success;
	}
	public void setSuccess(Integer success) {
		this.success = success;
	}
	public Integer getNoRepayment() {
		return noRepayment;
	}
	public void setNoRepayment(Integer noRepayment) {
		this.noRepayment = noRepayment;
	}
	public Integer getBorrowMoney() {
		return borrowMoney;
	}
	public void setBorrowMoney(Integer borrowMoney) {
		this.borrowMoney = borrowMoney;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public Integer getIncome() {
		return income;
	}
	public void setIncome(Integer income) {
		this.income = income;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Integer getIsVerify() {
		return isVerify;
	}
	public void setIsVerify(Integer isVerify) {
		this.isVerify = isVerify;
	}
	public Borrower getBorrower() {
		return borrower;
	}
	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}
	@Override
	public String toString() {
		return "Borrowerinfo [id=" + id + ", uid=" + uid + ", sex=" + sex
				+ ", birthday=" + birthday + ", address=" + address + ", tel="
				+ tel + ", success=" + success + ", noRepayment=" + noRepayment
				+ ", borrowMoney=" + borrowMoney + ", limit=" + limit
				+ ", income=" + income + ", realName=" + realName
				+ ", isVerify=" + isVerify + ", borrower=" + borrower + "]";
	} 
	

}
