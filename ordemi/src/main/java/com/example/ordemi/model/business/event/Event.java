package com.example.ordemi.model.business.event;

import javax.persistence.*;

import com.example.ordemi.model.business.participation.Participation;
import com.example.ordemi.model.business.gymClass.GymClass;

import java.util.Date;
import java.util.Set;

@Entity
public class Event {

    @Id
    @GeneratedValue
    private Long id;
    private String gymTeacherName;
    private int max_people;
    private Date date;
    private String plano;

    @ManyToOne
    @JoinColumn(name="gym_class_id")
    private GymClass gymClass;

    @OneToMany(mappedBy = "event")
    private Set<Participation> participations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGymTeacherName() {
        return gymTeacherName;
    }

    public void setGymTeacherName(String gymTeacherName) {
        this.gymTeacherName = gymTeacherName;
    }

    public int getMax_people() {
        return max_people;
    }

    public void setMax_people(int max_people) {
        this.max_people = max_people;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public GymClass getGymClass() {
        return gymClass;
    }

    public void setGymClass(GymClass gymClass) {
        this.gymClass = gymClass;
    }

    public Set<Participation> getParticipations() {
        return participations;
    }

    public void setParticipations(Set<Participation> participations) {
        this.participations = participations;
    }
}
