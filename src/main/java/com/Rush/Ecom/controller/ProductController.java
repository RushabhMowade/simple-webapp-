package com.Rush.Ecom.controller;

import com.Rush.Ecom.model.Product;
import com.Rush.Ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService service;
    @RequestMapping("")
    public String greet(){

        return " hello boi";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){

        return service.getAllProducts();
    }
}
