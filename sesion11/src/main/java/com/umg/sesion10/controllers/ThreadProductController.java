package com.umg.sesion10.controllers;


import com.umg.sesion10.entities.Product;
import com.umg.sesion10.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@RestController
@RequestMapping("/threads/products")
public class ThreadProductController {


    @Autowired
    ProductService productService;

    @PostMapping
    @RequestMapping("/create_csv")
    public void create_csv(){
        String csvSplitBy = ",";
        int NUMBER_OF_PRODUCTS =10000;
        String path = "products.csv";


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            File file = new File(path);
            boolean fileResult = false;
            if (!file.exists()){
                fileResult = file.createNewFile();
            }

            for (int i = 0; i < NUMBER_OF_PRODUCTS; i++) {
                String name = "Product " + i;
                double price = Math.random() * 100;
                int quantity = (int) (Math.random() * 10);

                String line = name + csvSplitBy + price + csvSplitBy + quantity;
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }


    @PostMapping("/no-threads")
    public void no_threads(@RequestBody Product product){

    }

}
