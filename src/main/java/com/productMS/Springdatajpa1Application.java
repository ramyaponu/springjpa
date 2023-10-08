package com.productMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productMS.Service.ProductService;
import com.productMS.productDto.ProductDto;

@SpringBootApplication
public class Springdatajpa1Application implements CommandLineRunner {
	@Autowired
 private ProductService productService;
	public static void main(String[] args) {
		System.out.println("main method");
		SpringApplication.run(Springdatajpa1Application.class, args);
		System.out.println("Applocation started");
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("run method called");
	//	addProduct();
	//	readProducts();
	updatePro();
		//deleteProducts();
		
	}
	public  void addProduct() {
		System.out.println("creating method");
		ProductDto dto=new ProductDto();
		dto.setProductid(1);
		dto.setProductname("shoe");
		dto.setQuantity(30);
	    dto.setProductcost(20000);
	    dto.setProductdisc(20);
	    dto.setProductdescri("bata");
	    dto.setBrand("bata");
	    productService.addProduct(dto);
		
	}
	public void readProducts() {
		Integer prodid=1;
		ProductDto dto=productService.readByDetails(prodid);
		System.out.println(dto);
	}
	public void updatePro() {
		ProductDto dto=new ProductDto();
	Integer id=2;
		dto.setProductname("mobile");
		dto.setQuantity(20);
		dto.setProductcost(100000);
		dto.setProductdisc(10);
		dto.setProductdescri("iphone12 pro");
		dto.setBrand("iphone");
productService.updateProduct(dto, id);
		
	}

	public void deleteProducts() {
		productService.deleteProducts(1);
	}
}
