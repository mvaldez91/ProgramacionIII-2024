package com.sesion14.demo.services;

import com.sesion14.demo.dao.ProductDao;
import com.sesion14.demo.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> findAll() {
        return (List<Product>)productDao.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productDao.findById(id).orElse(null);
    }

    @Override
    public void create(Product product) {
        productDao.save(product);
    }

    @Override
    public void update(Long id, Product product) {
        if (productDao.existsById(id)){
            product.setId(id);
            productDao.save(product);
        }
    }

    @Override
    public void delete(Long id) {
        if (productDao.existsById(id)){
            productDao.deleteById(id);
        }
    }

}
