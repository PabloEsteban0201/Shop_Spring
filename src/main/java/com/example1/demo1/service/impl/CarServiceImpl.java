package com.example1.demo1.service.impl;

import com.example1.demo1.dao.CarDao;
import com.example1.demo1.model.Car;
import com.example1.demo1.model.Product;
import com.example1.demo1.model.User;
import com.example1.demo1.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "carService")
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao car_dao;
    
    public Car inicializarCar (Product p, User u){
        Car c = new Car();
        c.setUserProp(u);
        c.addProduct(p);

        return car_dao.save(c);  
    }
    



}
