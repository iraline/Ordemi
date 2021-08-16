package com.example.ordemi.model.business.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EventController {

    @Autowired
    private EventRegister eventRegister;

    public Optional<Event> find(Long id){
        return eventRegister.find(id);
    }

    public Event create(Event entity){
        return eventRegister.create(entity);
    }

    public void delete(Long id){
        eventRegister.delete(id);
    }

    public Event update(Event entity){
        return eventRegister.update(entity);
    }

    public Iterable<Event> getAll(){
        return eventRegister.getAll();
    }
}
