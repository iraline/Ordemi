package com.example.ordemi.model.data.participation;

import com.example.ordemi.model.business.entities.Participation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ParticipationRepositorySpring implements IParticipationRepository{

    @Autowired
    private ParticipationDAO participationDAO;

    @Override
    public Optional<Participation> find(Long id) {
        return participationDAO.findById(id);
    }

    @Override
    public Participation create(Participation entity) {
        return participationDAO.save(entity);
    }

    @Override
    public void delete(Long id) {
        participationDAO.deleteById(id);
    }

    @Override
    public Participation update(Participation entity) {
        return participationDAO.save(entity);
    }

    @Override
    public Iterable<Participation> getAll() {
        return participationDAO.findAll();
    }
}
