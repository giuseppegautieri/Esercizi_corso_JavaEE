package it.esercizio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.esercizio.model.Fumetteria;

@Repository
public interface FumetteriaRepository extends JpaRepository<Fumetteria, Long>{

}
