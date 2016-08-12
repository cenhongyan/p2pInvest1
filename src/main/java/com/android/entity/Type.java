package com.android.entity;

import java.util.List;

public class Type {
	private Integer id;
	private String type;
	private List<Product> product;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Type [id=" + id + ", type=" + type + ", product=" + product
				+ "]";
	}


}
