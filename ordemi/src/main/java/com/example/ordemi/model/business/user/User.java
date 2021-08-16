package com.example.ordemi.model.business.user;

import javax.persistence.*;

import com.example.ordemi.model.business.participation.Participation;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String role;

    @OneToMany(mappedBy = "user")
    private Set<Participation> participations;

    public User(Long id, String name){
            this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<Participation> getParticipations() {
        return participations;
    }

    public void setParticipations(Set<Participation> participations) {
        this.participations = participations;
    }
}