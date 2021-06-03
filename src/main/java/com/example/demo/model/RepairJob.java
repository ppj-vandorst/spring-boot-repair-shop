package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RepairJob {

    @Id
    @GeneratedValue
    private Long id;

    private String description;

    @ManyToOne
    private Car car;

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Car getCar() {
        return car;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
