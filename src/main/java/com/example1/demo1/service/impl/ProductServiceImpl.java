package com.example1.demo1.service.impl;

import java.util.List;
import java.util.Optional;

import com.example1.demo1.dao.ProductDao;
import com.example1.demo1.dto.ProductDto;
import com.example1.demo1.model.Product;
import com.example1.demo1.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "produtcService")
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductDao productDao;

    public Optional<Product> findById(Long id){

        return productDao.findById(id);
    } 

    public Product crearProduct(ProductDto productDto){
        return this.productDao.save(productDto.getProdutcFromDto());
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) productDao.findAll();
    }
    
    

}
