package com.example1.demo1.dao;

import java.util.List;
import java.util.Optional;

import com.example1.demo1.model.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public interface UserDao extends CrudRepository <User, Long>  {
    Optional<User> findByUsername(String username);
    Optional<User> findById(Long id);

    Optional <User> findByName(String name);

    //@Query("from User u where u.name = :letra ")
    @Query("from User u where u.name like CONCAT('%',:letra,'%')")
    List <User> findByInitial( @Param("letra") String letra );
    
    
}
