package com.example.ordemi.model.business.registers;

import com.example.ordemi.model.business.entities.Participation;
import com.example.ordemi.model.data.participation.IParticipationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ParticipationRegister {

    @Autowired
    private IParticipationRepository participationRepository;

    public Optional<Participation> find(Long id){
        return participationRepository.find(id);
    }

    public Participation create(Participation entity){
        return participationRepository.create(entity);
    }

    public void delete(Long id){
        participationRepository.delete(id);
    }

    public Participation update(Participation entity){
        return participationRepository.update(entity);
    }

    public Iterable<Participation> getAll(){
        return participationRepository.getAll();
    }
}
