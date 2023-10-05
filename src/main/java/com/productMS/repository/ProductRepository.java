package com.productMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.productMS.entity.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {

	

}
