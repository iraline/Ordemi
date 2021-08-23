package com.example.ordemi.model.data.event;

import com.example.ordemi.model.business.event.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventDAO extends CrudRepository<Event, Long> {
}
