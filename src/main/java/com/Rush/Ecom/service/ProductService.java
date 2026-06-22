package com.Rush.Ecom.service;


import com.Rush.Ecom.model.Product;
import com.Rush.Ecom.repo.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private repository repo;
    public List<Product> getAllProducts(){
        return repo.findAll();

    }
    public Product getProduct(int id){
        return repo.findById(id).orElse(null);

    }


}
