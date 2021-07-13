package com.example.ordemi.model.business.registers;

import com.example.ordemi.model.business.entities.GymClass;
import com.example.ordemi.model.data.gymClass.IGymClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GymClassRegister {

    @Autowired
    private IGymClassRepository gymClassRepository;

    public Optional<GymClass> find(Long id){
        return gymClassRepository.find(id);
    }

    public GymClass create(GymClass entity){
        return gymClassRepository.create(entity);
    }

    public void delete(Long id){
        gymClassRepository.delete(id);
    }

    public GymClass update(GymClass entity){
        return gymClassRepository.update(entity);
    }

    public Iterable<GymClass> getAll(){
        return gymClassRepository.getAll();
    }
}
