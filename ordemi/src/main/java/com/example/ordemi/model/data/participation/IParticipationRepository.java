package com.example.ordemi.model.data.participation;

import com.example.ordemi.model.business.entities.Participation;

import java.util.Optional;

public interface IParticipationRepository {

    public Optional<Participation> find(Long id);
    public Participation create(Participation entity);
    public void delete(Long id);
    public Participation update(Participation entity);

    public Iterable<Participation> getAll();
}
