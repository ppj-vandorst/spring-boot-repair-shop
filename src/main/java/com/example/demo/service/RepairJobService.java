package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.model.RepairJob;

import java.util.List;

public interface RepairJobService {
    List<RepairJob> findAll();
    RepairJob save(RepairJob job);
}
