package com.Rush.Ecom.controller;

import com.Rush.Ecom.model.Product;
import com.Rush.Ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService service;
    @RequestMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id){
        Product prod = service.getProduct(id);

        if(prod != null)
            return new ResponseEntity<>(prod, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){

        return new ResponseEntity<>(service.getAllProducts(),HttpStatus.OK);
    }
}
