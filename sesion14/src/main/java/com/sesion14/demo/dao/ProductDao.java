package com.sesion14.demo.dao;

import com.sesion14.demo.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Long> {
}
