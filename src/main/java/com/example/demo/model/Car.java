package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private long id;

    private String licensePlate;

    @OneToOne(mappedBy = "car")
    @JsonBackReference
    private Customer customer;

    @OneToMany(mappedBy = "car")
    private List<RepairJob> repairJobs;

    public long getId() {
        return id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<RepairJob> getRepairJobs() {
        return repairJobs;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setRepairJobs(List<RepairJob> repairJobs) {
        this.repairJobs = repairJobs;
    }
}
