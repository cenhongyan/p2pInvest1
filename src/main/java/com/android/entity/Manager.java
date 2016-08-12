package com.android.entity;

public class Manager {
	private Integer id;
	private String manageName;
	private String managePwd;
	@Override
	public String toString() {
		return "Manager [id=" + id + ", manageName=" + manageName
				+ ", managePwd=" + managePwd + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getManageName() {
		return manageName;
	}
	public void setManageName(String manageName) {
		this.manageName = manageName;
	}
	public String getManagePwd() {
		return managePwd;
	}
	public void setManagePwd(String managePwd) {
		this.managePwd = managePwd;
	}
        
}
