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
		addProduct();
		
	}
	public  void addProduct() {
		System.out.println("creating method");
		ProductDto dto=new ProductDto();
		dto.setProductid(2);
		dto.setProductname("mobile");
		dto.setQuantity(30);
	    dto.setProductcost(50000);
	    dto.setProductdisc(20);
	    dto.setProductdescri("i phone 13pro ");
	    dto.setBrand("iphone");
	    productService.addProduct(dto);
		
	}

}
