package com.example.ordemi.model.data.event;

import com.example.ordemi.model.business.event.Event;

import java.util.Optional;

public interface IEventRepository {
    public Optional<Event> find(Long id);
    public Event create(Event entity);
    public void delete(Long id);
    public Event update(Event entity);

    public Iterable<Event> getAll();
}
