package com.productMS.productDto;

public class ProductDto {
	private int productid;
	private String productname;
	private int quantity;
	private float productcost;
	private float productdisc;
	private String productdescri;
	private String brand;
	@Override
	public String toString() {
		return "ProductDto [productid=" + productid + ", productname=" + productname + ", quantity=" + quantity
				+ ", productcost=" + productcost + ", productdisc=" + productdisc + ", productdescri=" + productdescri
				+ ", brand=" + brand + "]";
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDto(int productid, String productname, int quantity, float productcost, float productdisc,
			String productdescri, String brand) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.quantity = quantity;
		this.productcost = productcost;
		this.productdisc = productdisc;
		this.productdescri = productdescri;
		this.brand = brand;
	}
	
	
	
}
