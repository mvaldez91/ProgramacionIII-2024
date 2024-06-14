package com.example.sesion15.services;

import com.example.sesion15.entities.Product;
import com.example.sesion15.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    };
    public Product findById(Long id){
        return repository.findById(id).orElse(null);
    };
    public void create(Product product){
        repository.save(product);
    };
    public void update(Long id, Product product){
        if (repository.existsById(id)){
            product.setId(id);
            repository.save(product);
        }

    };
    public void delete(Long id){
        if (repository.existsById(id)){
            repository.deleteById(id);
        }
    };
}
