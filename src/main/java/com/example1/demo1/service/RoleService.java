package com.example1.demo1.service;

import com.example1.demo1.model.Role;

public interface RoleService {
    Role findByName (String name);
    Role save (Role role);
}
