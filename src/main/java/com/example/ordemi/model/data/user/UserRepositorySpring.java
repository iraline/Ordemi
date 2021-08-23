package com.example.ordemi.model.data.user;

import com.example.ordemi.model.business.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserRepositorySpring implements IUserRepository{

    @Autowired
    private UserDAO userDAO;

    @Override
    public Optional<User> find(Long id) {
        return userDAO.findById(id);
    }

    @Override
    public User create(User entity) {
        return userDAO.save(entity);
    }

    @Override
    public void delete(Long id) {
        userDAO.deleteById(id);
    }

    @Override
    public User update(User entity) {
        return userDAO.save(entity);
    }

    @Override
    public Iterable<User> getAll() {
        return userDAO.findAll();
    }
}