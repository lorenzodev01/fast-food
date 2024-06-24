package org.lorenzo.golemone.repository;


import org.lorenzo.golemone.model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdottiRepository extends JpaRepository<Prodotto, Long> {
}
