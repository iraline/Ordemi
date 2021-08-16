package com.example.ordemi.model.business.user;

import com.example.ordemi.model.data.user.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserRegister {

    @Autowired
    private IUserRepository userRepository;

    public Optional<User> find(Long id){
        return userRepository.find(id);
    }

    public User create(User entity){
        return userRepository.create(entity);
    }

    public void delete(Long id){
        userRepository.delete(id);
    }

    public User update(User entity){
        return userRepository.update(entity);
    }

    public Iterable<User> getAll(){
        return userRepository.getAll();
    }

}