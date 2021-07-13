package com.example.ordemi.model.business.registers;

import com.example.ordemi.model.business.entities.Event;
import com.example.ordemi.model.data.event.IEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EventRegister {

    @Autowired
    private IEventRepository eventRepository;

    public Optional<Event> find(Long id){
        return eventRepository.find(id);
    }

    public Event create(Event entity){
        return eventRepository.create(entity);
    }

    public void delete(Long id){
        eventRepository.delete(id);
    }

    public Event update(Event entity){
        return eventRepository.update(entity);
    }

    public Iterable<Event> getAll(){
        return eventRepository.getAll();
    }
}
