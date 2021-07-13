package com.example.ordemi.model.business.controllers;

import com.example.ordemi.model.business.entities.Participation;
import com.example.ordemi.model.business.registers.ParticipationRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ParticipationController {

    @Autowired
    private ParticipationRegister participationRegister;

    public Optional<Participation> find(Long id){
        return participationRegister.find(id);
    }

    public Participation create(Participation entity){
        return participationRegister.create(entity);
    }

    public void delete(Long id){
        participationRegister.delete(id);
    }

    public Participation update(Participation entity){
        return participationRegister.update(entity);
    }

    public Iterable<Participation> getAll(){
        return participationRegister.getAll();
    }
}
