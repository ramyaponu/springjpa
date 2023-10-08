package com.productMS.Service;


import com.productMS.entity.Product;
import com.productMS.productDto.ProductDto;

public interface ProductService {
	public  abstract String addProduct(ProductDto productinfo); 
	
	public  ProductDto readByDetails(Integer id);
	

	public Product updateProduct(ProductDto dto,Integer id);	
	
    public String deleteProducts(Integer id);
}
