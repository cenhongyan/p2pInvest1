package com.android.entity;

/**
 * @author Administrator
 * 借款人
 */
public class Borrower {
	private int id;
	private Double annualrate; //年利率
	private Integer total;  
	private String timelimit;
	private Integer percentage;
	private String receivedway;
	private Integer peoplenum;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getAnnualrate() {
		return annualrate;
	}
	public void setAnnualrate(Double annualrate) {
		this.annualrate = annualrate;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public String getTimelimit() {
		return timelimit;
	}
	public void setTimelimit(String timelimit) {
		this.timelimit = timelimit;
	}
	public Integer getPercentage() {
		return percentage;
	}
	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}
	public String getReceivedway() {
		return receivedway;
	}
	public void setReceivedway(String receivedway) {
		this.receivedway = receivedway;
	}
	public Integer getPeoplenum() {
		return peoplenum;
	}
	public void setPeoplenum(Integer peoplenum) {
		this.peoplenum = peoplenum;
	}
	@Override
	public String toString() {
		return "Borrower [id=" + id + ", annualrate=" + annualrate + ", total="
				+ total + ", timelimit=" + timelimit + ", percentage="
				+ percentage + ", receivedway=" + receivedway + ", peoplenum="
				+ peoplenum + "]";
	}
	

}
