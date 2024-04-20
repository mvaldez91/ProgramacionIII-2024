package com.umg.sesion9.services;

import com.umg.sesion9.data_access.ProductDao;
import com.umg.sesion9.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAll() {

        return (List<Product>)productDao.findAll();
    }

    @Override
    public Product findById(Long id) {
        Product result = productDao.findById(id).orElse(null);
        System.out.println(result);
        return productDao.findById(id).orElse(null);
    }
}
