package com.example1.demo1.dao;

import java.util.List;
import java.util.Optional;

import com.example1.demo1.model.Product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends CrudRepository <Product, Long> {

    Optional<Product> findByName(String name);
    Optional<Product> findById(Long id);
    
}
