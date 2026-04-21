package it.esercizio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.esercizio.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, String>{

}
