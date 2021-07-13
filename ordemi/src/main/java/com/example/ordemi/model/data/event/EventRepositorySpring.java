package com.example.ordemi.model.data.event;

import com.example.ordemi.model.business.entities.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EventRepositorySpring implements IEventRepository{

    @Autowired
    private EventDAO eventDAO;

    @Override
    public Optional<Event> find(Long id) {
        return eventDAO.findById(id);
    }

    @Override
    public Event create(Event entity) {
        return eventDAO.save(entity);
    }

    @Override
    public void delete(Long id) {
        eventDAO.deleteById(id);
    }

    @Override
    public Event update(Event entity) {
        return eventDAO.save(entity);
    }

    @Override
    public Iterable<Event> getAll() {
        return eventDAO.findAll();
    }
}
