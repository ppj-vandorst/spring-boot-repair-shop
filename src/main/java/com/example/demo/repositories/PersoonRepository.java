package com.example.demo.repositories;

import com.example.demo.model.Persoon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersoonRepository extends JpaRepository<Persoon, Long> {
    Optional<Persoon> findByVoornaam(String voornaam);
}
