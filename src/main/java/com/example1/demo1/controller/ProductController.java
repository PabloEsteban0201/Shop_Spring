package com.example1.demo1.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.example1.demo1.dto.ProductDto;
import com.example1.demo1.model.Product;
import com.example1.demo1.service.impl.CarServiceImpl;
import com.example1.demo1.service.impl.ProductServiceImpl;
import com.example1.demo1.service.impl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/product")
public class ProductController {
    
    @Autowired
    private CarServiceImpl carService;

    @Autowired
    private ProductServiceImpl productService;

    @Autowired
    private UserServiceImpl userService;
    
    @RequestMapping(value="/create", method = RequestMethod.POST)
    public Product creaProduct(@RequestBody ProductDto productDto, HttpServletResponse response){
        return productService.crearProduct(productDto) ;
    }

    @GetMapping("/listProducts")
    public List<Product> listProducts(){
        return productService.findAll();
    }
    

}
