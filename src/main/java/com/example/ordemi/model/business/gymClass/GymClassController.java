package com.example.ordemi.model.business.gymClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GymClassController {

    @Autowired
    private GymClassRegister gymClassRegister;

    public Optional<GymClass> find(Long id){
        return gymClassRegister.find(id);
    }

    public GymClass create(GymClass entity){
        return gymClassRegister.create(entity);
    }

    public void delete(Long id){
        gymClassRegister.delete(id);
    }

    public GymClass update(GymClass entity){
        return gymClassRegister.update(entity);
    }

    public Iterable<GymClass> getAll(){
        return gymClassRegister.getAll();
    }
}
