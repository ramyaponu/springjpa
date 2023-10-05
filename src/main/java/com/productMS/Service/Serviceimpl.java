package com.productMS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productMS.entity.Product;
import com.productMS.productDto.ProductDto;
import com.productMS.repository.ProductRepository;
@Service(value="serviceimpl")
public class Serviceimpl implements ProductService {
	@Autowired
	private ProductRepository ProductRepository;
	@Override
	public  String addProduct(ProductDto productinfo) {
			
		Product pr=new Product();
	    
		pr.setProductid(productinfo.getProductid());
		pr.setProductname(productinfo.getProductname());
		pr.setProductquantity(productinfo.getQuantity());
		pr.setProductcost(productinfo.getProductcost());
		pr.setProductdisc(productinfo.getProductdisc());
		pr.setProductdescri(productinfo.getProductdescri());
		
		pr.setBrand(productinfo.getBrand());
		ProductRepository.save(pr);
	
		return "product added successfully";
	}
	

}
