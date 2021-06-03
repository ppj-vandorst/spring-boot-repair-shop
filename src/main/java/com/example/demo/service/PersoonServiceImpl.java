package com.example.demo.service;

import com.example.demo.exception.RecordNotFoundException;
import com.example.demo.model.Persoon;
import com.example.demo.repositories.PersoonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersoonServiceImpl implements PersoonService {
    private PersoonRepository persoonRepository;

    @Autowired
    public PersoonServiceImpl(PersoonRepository persoonRepository) {
        this.persoonRepository = persoonRepository;
    }

    @Override
    public List<Persoon> getPersonen() {
        return persoonRepository.findAll();
    }

    @Override
    public Persoon getPersoon(long id) {
        Optional<Persoon> person = persoonRepository.findById(id);

        if(person.isPresent()) {
            return person.get();
        } else {
            throw new RecordNotFoundException("Person does not exist");
        }
    }

    @Override
    public Persoon addPersoon(Persoon persoon) {
        return persoonRepository.save(persoon);
    }

    @Override
    public void removePersoon(long id) {
        persoonRepository.deleteById(id);
    }

    @Override
    public void updatePersoon(long id, Persoon nieuwPersoon) {
        Optional<Persoon> optionalPerson = persoonRepository.findById(id);
        if(optionalPerson.isPresent()) {
            persoonRepository.save(nieuwPersoon);
        } else {
            throw new RecordNotFoundException("Person does not exist");
        }
    }

    @Override
    public Persoon getByFirstname(String firstname) {
        Optional<Persoon> optionalPerson = persoonRepository.findByVoornaam(firstname);
        if(optionalPerson.isPresent()) {
            return optionalPerson.get();
        } else {
            throw new RecordNotFoundException("Person does not exist");
        }
    }

}
