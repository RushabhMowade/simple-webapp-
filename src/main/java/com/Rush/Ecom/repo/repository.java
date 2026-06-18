package com.Rush.Ecom.repo;

import com.Rush.Ecom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<Product, Integer> {

}
