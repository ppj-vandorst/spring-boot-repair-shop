package com.example.demo.service;

import com.example.demo.model.RepairJob;
import com.example.demo.repositories.RepairJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepairJobServiceImpl implements RepairJobService {
    private RepairJobRepository repository;

    @Autowired
    public RepairJobServiceImpl(RepairJobRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<RepairJob> findAll() {
        return repository.findAll();
    }

    @Override
    public RepairJob save(RepairJob job) {
        return repository.save(job);
    }
}
