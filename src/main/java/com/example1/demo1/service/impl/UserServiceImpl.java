package com.example1.demo1.service.impl;

import java.util.List;
import java.util.Optional;

import com.example1.demo1.dao.RoleDao;
import com.example1.demo1.dao.UserDao;
import com.example1.demo1.dto.UserDto;
import com.example1.demo1.model.Role;
import com.example1.demo1.model.User;
import com.example1.demo1.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;
    @Override
    public User save(UserDto infoUsuario) {
        User userToSave = infoUsuario.getUserFromDto();
        Role usr = roleDao.findByName("Usuario");
        userToSave.addRole(usr);
        //Optional<Role> usr = roleDao.findById((long) 1);
        //userToSave.addRole(usr.get());
        
        return userDao.save(userToSave);
    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return (List<User>) userDao.findAll();
    }

    @Override
    public Optional<User> findOne(String username) {
        // TODO Auto-generated method stub
        return userDao.findByUsername(username);
    }

    @Override
    public List<User> findByInitial(String letra) {
        // TODO Auto-generated method stub
        return userDao.findByInitial(letra);
    }

    @Override
    public Optional<User> findByName(String name) {
        // TODO Auto-generated method stub
        return findByName(name);
    }

    
    public Optional<User> findById(Long id){
       
       //Puente (Arquitectura)
        return userDao.findById(id);
    }

    
}
