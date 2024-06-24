package org.lorenzo.golemone.repository;
import org.lorenzo.golemone.model.Ordine;
import org.lorenzo.golemone.model.OrdineId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdineRepository extends JpaRepository<Ordine, OrdineId> {
}
