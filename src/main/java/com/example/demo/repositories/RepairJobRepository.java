package com.example.demo.repositories;

import com.example.demo.model.RepairJob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairJobRepository extends JpaRepository<RepairJob, Long> {
}
