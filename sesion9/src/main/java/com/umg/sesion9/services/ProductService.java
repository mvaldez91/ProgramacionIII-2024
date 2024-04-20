package com.umg.sesion9.services;

import com.umg.sesion9.entities.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll();
    public Product findById(Long id);
}
