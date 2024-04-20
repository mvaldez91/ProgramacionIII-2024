package com.umg.sesion10.dao;

import com.umg.sesion10.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Long> {
}
