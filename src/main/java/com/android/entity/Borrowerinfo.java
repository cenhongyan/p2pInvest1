package com.android.entity;

public class Borrowerinfo {
	private Integer id;
	private Integer uid;
	private String sex;
	private Integer birthday;
	private String address;
	private String level;
	private String purpose;
	private Integer publish;
	private Integer success;
	private Integer norepayment;
	private Integer isverify;
	private Integer bid; 
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
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public Integer getPublish() {
		return publish;
	}
	public void setPublish(Integer publish) {
		this.publish = publish;
	}
	public Integer getSuccess() {
		return success;
	}
	public void setSuccess(Integer success) {
		this.success = success;
	}
	public Integer getNorepayment() {
		return norepayment;
	}
	public void setNorepayment(Integer norepayment) {
		this.norepayment = norepayment;
	}
	public Integer getIsverify() {
		return isverify;
	}
	public void setIsverify(Integer isverify) {
		this.isverify = isverify;
	}
	
	@Override
	public String toString() {
		return "Borrowerinfo [id=" + id + ", uid=" + uid + ", sex=" + sex
				+ ", birthday=" + birthday + ", address=" + address
				+ ", level=" + level + ", purpose=" + purpose + ", publish="
				+ publish + ", success=" + success + ", norepayment="
				+ norepayment + ", isverify=" + isverify + ", bid=" + bid + "]";
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	

}
