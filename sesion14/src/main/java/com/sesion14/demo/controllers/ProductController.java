package com.sesion14.demo.controllers;


import com.sesion14.demo.entities.Product;
import com.sesion14.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> GetAll(){
        return productService.findAll();
    }

    @GetMapping(value="/{id}")
    public Product GetById(@PathVariable Long id){
        return productService.findById(id);
    }

    @PostMapping
    public void create(@RequestBody Product product){
        productService.create(product);
    }

    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Product product){
        productService.update(id, product);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        productService.delete(id);
    }
}
