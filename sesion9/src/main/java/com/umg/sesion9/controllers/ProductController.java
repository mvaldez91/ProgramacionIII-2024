package com.umg.sesion9.controllers;

import com.umg.sesion9.entities.Product;
import com.umg.sesion9.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> allProducts(){
        return productService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Product getProduct(@PathVariable Long id){
        return productService.findById(id);
    }

}
