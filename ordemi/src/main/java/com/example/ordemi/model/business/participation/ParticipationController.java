package com.example.ordemi.model.business.participation;

import com.example.ordemi.model.business.participation.Participation;
import com.example.ordemi.model.business.participation.ParticipationRegister;
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
