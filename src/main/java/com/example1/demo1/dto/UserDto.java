package com.example1.demo1.dto;

import com.example1.demo1.model.User;

public class UserDto {
    private String username;
    private String password;
    private String name;
    private String color;
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
    public User getUserFromDto(){
        User user = new User();
        user.setColor(this.color);
        user.setName(this.name);
        user.setUsername(this.username);
        user.setPassword(this.password);
        return user;
    }
    public UserDto (String color, String name, String username, String password){
        super();
        this.color=color;
        this.name=name;
        this.password=password;
        this.username=username;
    }
}
