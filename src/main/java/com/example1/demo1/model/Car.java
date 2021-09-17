package com.example1.demo1.model;

import javax.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int total;

    @OneToMany
    private List<Product> listProducts = new ArrayList<>();

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<Product> listProducts) {
        this.listProducts = listProducts;
    }

    public void addProduct (Product p){
            if(this.listProducts== null){
                this.listProducts = new ArrayList<>();
                this.listProducts.add(p);
            }else{
                this.listProducts.add(p);
            }
    }

    public void calculateTotal(){

        if(this.listProducts!=null){
            for(int i=0;i< this.listProducts.size();i++){
                this.total=this.listProducts.get(i).getPrice();
            }
        }
    
    }


}
