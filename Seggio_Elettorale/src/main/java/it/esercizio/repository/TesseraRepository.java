package it.esercizio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.esercizio.entity.TesseraElettorale;

public interface TesseraRepository extends JpaRepository<TesseraElettorale, Integer>{

	Optional<TesseraElettorale>findByPersonaCodiceFiscale(String codiceFiscale);
}
