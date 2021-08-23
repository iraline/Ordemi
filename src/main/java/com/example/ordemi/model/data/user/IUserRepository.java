package com.example.ordemi.model.data.user;

import com.example.ordemi.model.business.user.User;

import java.util.Optional;

public interface IUserRepository{
    public Optional<User> find(Long id);
    public User create(User entity);
    public void delete(Long id);
    public User update(User entity);

    public Iterable<User> getAll();
}