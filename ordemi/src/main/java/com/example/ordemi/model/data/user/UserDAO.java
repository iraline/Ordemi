package com.example.ordemi.model.data.user;

import com.example.ordemi.model.business.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User, Long> {

}