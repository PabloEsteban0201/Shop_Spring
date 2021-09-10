package com.example1.demo1.service.impl;

import com.example1.demo1.dao.RoleDao;
import com.example1.demo1.model.Role;
import com.example1.demo1.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Override
    public Role findByName(String name) {
        // TODO Auto-generated method stub
        return roleDao.findByName(name);
    }

    @Override
    public Role save(Role role) {
        // TODO Auto-generated method stub

        return roleDao.save(role);
    }
    
}
