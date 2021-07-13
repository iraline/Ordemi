package com.example.ordemi.model.data.gymClass;

import com.example.ordemi.model.business.entities.GymClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GymClassRepositorySpring implements IGymClassRepository{

    @Autowired
    private GymClassDAO gymClassDAO;

    @Override
    public Optional<GymClass> find(Long id) {
        return gymClassDAO.findById(id);
    }

    @Override
    public GymClass create(GymClass entity) {
        return gymClassDAO.save(entity);
    }

    @Override
    public void delete(Long id) {
        gymClassDAO.deleteById(id);
    }

    @Override
    public GymClass update(GymClass entity) {
        return gymClassDAO.save(entity);
    }

    @Override
    public Iterable<GymClass> getAll() {
        return gymClassDAO.findAll();
    }
}
