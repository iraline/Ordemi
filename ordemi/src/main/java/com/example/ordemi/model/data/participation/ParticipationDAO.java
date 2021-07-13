package com.example.ordemi.model.data.participation;

import com.example.ordemi.model.business.entities.Participation;
import org.springframework.data.repository.CrudRepository;

public interface ParticipationDAO extends CrudRepository<Participation, Long> {
}
