package org.lorenzo.golemone.controller;

import org.lorenzo.golemone.model.Ordine;
import org.lorenzo.golemone.model.OrdineId;
import org.lorenzo.golemone.service.OrdineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/ordini")
public class OrdineController {

    @Autowired
    private OrdineService ordineService;

    @GetMapping
    public List<Ordine> getAllOrdini() {
        return this.ordineService.getAllOrdini();

    }

    @PostMapping
    public Ordine createOrdine(@RequestBody Ordine ordine) {
        try {

            return ordineService.saveOrdine(ordine);
        } catch (Exception e) {

            System.out.println("errore!");
        }
        return ordine;
    }




    @DeleteMapping("/api/ordini")
    public ResponseEntity<Void> deleteOrdine(@PathVariable Long ordineId, @PathVariable Long prodottoid) {
        OrdineId id = new OrdineId(ordineId, prodottoid);
        if (!ordineService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        ordineService.deleteOrdine(id);
        return ResponseEntity.noContent().build();
    }


}
