package org.lorenzo.golemone.controller;


import org.lorenzo.golemone.model.Prodotto;
import org.lorenzo.golemone.service.ProdottiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/prodotto")
public class ProdottiController {

    private final ProdottiService prodottiService;

    @Autowired
    public ProdottiController(ProdottiService prodottiService) {
        this.prodottiService = prodottiService;
    }

    @GetMapping
    public List<Prodotto> getAllMenus() {
        return prodottiService.getAllMenus();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prodotto> getMenuById(@PathVariable Long id) {
        Prodotto prodotto = prodottiService.getMenuById(id);
        if (prodotto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(prodotto);
    }

    @PostMapping
    public ResponseEntity<Prodotto> insertProdotto(@RequestBody Prodotto prodotto) {
        Prodotto createdProdotto = prodottiService.saveMenu(prodotto);
        return ResponseEntity.ok(createdProdotto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Prodotto> updateMenu(@PathVariable Long id, @RequestBody Prodotto prodottoDetails) {
        Prodotto prodotto = prodottiService.getMenuById(id);
        if (prodotto == null) {
            return ResponseEntity.notFound().build();
        }
        prodotto.setNome(prodottoDetails.getNome());
        prodotto.setPrezzo(prodottoDetails.getPrezzo());
        Prodotto updatedProdotto = prodottiService.saveMenu(prodotto);
        return ResponseEntity.ok(updatedProdotto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProdotto(@PathVariable Long id) {
        if (!ProdottiService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        ProdottiService.deleteProdotto(id);
        return ResponseEntity.noContent().build();
    }


}
