package com.example.ordemi.model.business.controllers;

import com.example.ordemi.model.business.entities.User;
import com.example.ordemi.model.business.registers.UserRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserController {

    @Autowired
    private UserRegister userRegister;

    public Optional<User> find(Long id){
        return userRegister.find(id);
    }

    public User create(User entity){
        return userRegister.create(entity);
    }

    public void delete(Long id){
        userRegister.delete(id);
    }

    public User update(User entity){
        return userRegister.update(entity);
    }

    public Iterable<User> getAll(){
        return userRegister.getAll();
    }
}