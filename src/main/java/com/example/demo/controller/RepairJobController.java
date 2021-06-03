package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.model.RepairJob;
import com.example.demo.service.CustomerService;
import com.example.demo.service.RepairJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/repair-jobs")
public class RepairJobController {
    private RepairJobService repairJobService;

    @Autowired
    public RepairJobController(RepairJobService repairJobService) {
        this.repairJobService = repairJobService;
    }

    @GetMapping
    public List<RepairJob> findAll() {
        return repairJobService.findAll();
    }

    @PostMapping
    public RepairJob save(@RequestBody RepairJob job) {
        return repairJobService.save(job);
    }
}
