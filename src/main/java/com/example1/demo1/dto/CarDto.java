package com.example1.demo1.dto;

import java.util.List;
import java.util.ArrayList;

import com.example1.demo1.model.Car;
import com.example1.demo1.model.Product;
import com.example1.demo1.model.User;

public class CarDto {

    private int total;
    private User userProp;
    private List<Product> listProducts = new ArrayList<>();

    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public User getUserProp() {
        return userProp;
    }
    public void setUserProp(User userProp) {
        this.userProp = userProp;
    }
    public List<Product> getListProducts() {
        return listProducts;
    }
    public void setListProducts(List<Product> listProducts) {
        this.listProducts = listProducts;
    }
    
    public Car getCarFromDto(){
        Car c = new Car();
        c.setUserProp(this.userProp);
        c.setTotal(this.total);
        c.setListProducts(this.listProducts);
        return c;
    }

}
