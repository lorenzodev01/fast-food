package org.lorenzo.golemone.service;


import org.lorenzo.golemone.model.Ordine;
import org.lorenzo.golemone.model.OrdineId;
import org.lorenzo.golemone.model.Prodotto;
import org.lorenzo.golemone.repository.ProdottiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdottiService {

    @Autowired
    private ProdottiRepository prodottiRepository;

    public static boolean existsById(Long id) {
        return false;
    }

    public static void deleteProdotto(Long id) {

    }

    public List<Prodotto> getAllMenus() {
        return prodottiRepository.findAll();
    }

    public Prodotto getMenuById(Long id) {
        return prodottiRepository.findById(id).orElse(null);
    }

    public Prodotto saveMenu(Prodotto prodotto) {
        return prodottiRepository.save(prodotto);
    }

    public void deleteMenu(Long id) {
        prodottiRepository.deleteById(id);
    }

}
