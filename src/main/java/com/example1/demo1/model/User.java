package com.example1.demo1.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //la base de datos\

    @Column (unique = true)
    private String username; // Logeo
    @Column
    private String password; // Logeo
    @Column
    private String name; // informacion extra 
    @Column
    private String color; // informacion extra
    @OneToOne
    private Car carritoUser;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "USER_ROLES",
        joinColumns = {
            @JoinColumn(name="USER_ID")
        },
        inverseJoinColumns = {
            @JoinColumn(name = "ROLE_ID")
        }
    )
    private Set<Role> roles;
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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
     * @return the color
     */
    public String getColor() {
        return color;
    }
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    public Car getCarritoUser() {
        return carritoUser;
    }
    public void setCarritoUser(Car carritoUser) {
        this.carritoUser = carritoUser;
    }

    public void addRole(Role role){
        if(this.roles!=null){
            this.roles.add(role);
        }else{
            this.roles = new HashSet<>();
            this.roles.add(role);
        }
    }

    public void selectProduct(Product p){
        
    }
    
}
