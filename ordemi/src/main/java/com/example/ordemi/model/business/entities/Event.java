package com.example.ordemi.model.business.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
    @JoinColumn(name="gymclass_id")
    private GymClass gymClass;

    @ManyToMany(mappedBy = "events")
    private List<User> users;

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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
