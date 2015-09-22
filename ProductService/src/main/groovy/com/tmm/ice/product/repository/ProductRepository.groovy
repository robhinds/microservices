package com.tmm.ice.product.repository

import com.tmm.ice.product.domain.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository extends CrudRepository<Product, Long> {
	
    List<Product> findByName( String name );
	
	List<Product> findOneByNameAndVersion( String name, String version );
	
}