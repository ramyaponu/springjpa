package com.productMS.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="productid")
	private int productid;
	@Column(name="productname")
	private String productname;
	@Column(name="productquantity")
	private int productquantity;
	@Column(name="productcost")
	private float productcost;
	@Column(name="productdisc")
	private float productdisc;
	@Column(name="productdescri")
	private String productdescri;
	@Column(name="brand")
	private String brand;
	public Product(int productid, String productname, int productquantity, float productcost, float productdisc,
			String productdescri, String brand) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productquantity = productquantity;
		this.productcost = productcost;
		this.productdisc = productdisc;
		this.productdescri = productdescri;
		this.brand = brand;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}
	public float getProductcost() {
		return productcost;
	}
	public void setProductcost(float productcost) {
		this.productcost = productcost;
	}
	public float getProductdisc() {
		return productdisc;
	}
	public void setProductdisc(float productdisc) {
		this.productdisc = productdisc;
	}
	public String getProductdescri() {
		return productdescri;
	}
	public void setProductdescri(String productdescri) {
		this.productdescri = productdescri;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productquantity="
				+ productquantity + ", productcost=" + productcost + ", productdisc=" + productdisc + ", productdescri="
				+ productdescri + ", brand=" + brand + "]";
	}
	

}
