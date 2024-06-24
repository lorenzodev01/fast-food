package org.lorenzo.golemone.service;


import org.lorenzo.golemone.model.Ordine;
import org.lorenzo.golemone.model.OrdineId;
import org.lorenzo.golemone.repository.OrdineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrdineService {

    @Autowired
    private OrdineRepository ordineRepository;

    public List<Ordine> getAllOrdini() {
        return ordineRepository.findAll();
    }

    public Ordine saveOrdine(Ordine ordine) {
        return ordineRepository.save(ordine);
    }

    //Nel servizio, puoi utilizzare il metodo Optional per verificare se l'entità esiste.
    public Optional<Ordine> getOrdineById(OrdineId id) {
        return ordineRepository.findById(id);
    }

    public boolean existsById(OrdineId id) {
        return false;
    }

    public void deleteOrdine(OrdineId id) {

    }
}

