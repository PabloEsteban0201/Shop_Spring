package com.example1.demo1.dao;

import com.example1.demo1.model.Role;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleDao extends CrudRepository <Role, Long> {
    Role findByName(String name);
}
