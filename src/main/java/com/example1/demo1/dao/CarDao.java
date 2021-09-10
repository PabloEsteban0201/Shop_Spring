package com.example1.demo1.dao;


import com.example1.demo1.model.Car;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDao extends CrudRepository <Car, Long > {
    
    

}
