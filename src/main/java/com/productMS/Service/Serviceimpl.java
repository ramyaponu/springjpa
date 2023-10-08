package com.productMS.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productMS.entity.Product;
import com.productMS.productDto.ProductDto;
import com.productMS.repository.ProductRepository;
@Service(value="serviceimpl")
public  class Serviceimpl implements ProductService {
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
	
	@Override
	public ProductDto readByDetails(Integer id) {
		Optional<Product>op=ProductRepository.findById(id);
		Product p=op.orElseThrow(()-> new RuntimeException("No product found"+id));
		ProductDto dto=new ProductDto();
		dto.setProductid(p.getProductid());
		dto.setProductname(p.getProductname());
		dto.setQuantity(p.getProductquantity());
		dto.setProductcost(p.getProductcost());
		dto.setProductdisc(p.getProductdisc());
		dto.setProductdescri(p.getProductdescri());
		dto.setBrand(p.getBrand());
		
		return dto;
	}

	@Override
	public Product updateProduct(ProductDto dto,Integer id) {
		
		Optional<Product> pe=ProductRepository.findById(id);
		if(pe.isPresent()) {
			Product p=pe.get();
		p.setProductname(dto.getProductname());
		p.setProductquantity(dto.getQuantity());
		p.setProductcost(dto.getProductcost());	
		p.setProductdisc(dto.getProductdisc());
		p.setProductdescri(dto.getProductdescri());
		p.setBrand(dto.getBrand());
		 ProductRepository.save(p);
		 
		return p;
		
	}else
		throw new RuntimeException("not found"+id);
		

	}

	@Override
	public String deleteProducts(Integer id) {
		ProductRepository.deleteById(id);
		
		return "deleted successfully";
	}

	
}


