package com.example.ordemi.model.data.gymClass;

import com.example.ordemi.model.business.entities.GymClass;

import java.util.Optional;

public interface IGymClassRepository {
    public Optional<GymClass> find(Long id);
    public GymClass create(GymClass entity);
    public void delete(Long id);
    public GymClass update(GymClass entity);

    public Iterable<GymClass> getAll();
}
