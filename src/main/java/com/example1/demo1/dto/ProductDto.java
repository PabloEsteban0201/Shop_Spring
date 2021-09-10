package com.example1.demo1.dto;

import com.example1.demo1.model.Product;

public class ProductDto {

    private String name;
    private String description;
    private int price;

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }    

    public Product getProdutcFromDto(){
        Product p = new Product();
        p.setDescription(this.description);
        p.setName(this.name);
        p.setPrice(this.price);
        return p;
    }
    
}
