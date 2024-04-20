package com.umg.sesion10.services;
import com.umg.sesion10.entities.Product;

import java.util.List;

public interface ProductService {

    public List<Product> findAll();
    public Product findById(Long id);
    public void create(Product product);
    public void update(Long id, Product product);
    public void delete(Long id);


}