package com.Rush.Ecom.service;


import com.Rush.Ecom.model.Product;
import com.Rush.Ecom.repo.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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


    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {

     product.setImageName(imageFile.getOriginalFilename());
     product.setImageType(imageFile.getContentType());
     product.setImageDate(imageFile.getBytes());
     return repo.save(product);
    }
}
