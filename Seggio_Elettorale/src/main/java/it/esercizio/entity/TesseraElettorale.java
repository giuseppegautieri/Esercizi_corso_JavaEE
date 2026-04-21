package it.esercizio.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class TesseraElettorale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numeroTessera;
	private LocalDate dataScadenza;
	
	@OneToOne
	@JoinColumn(name = "persona_cf")
	private Persona persona;
	
	@ManyToOne
	@JoinColumn(name = "seggio_codice")
	private Seggio seggio;

	public TesseraElettorale() {
		super();
		
	}

	public TesseraElettorale(int numeroTessera, LocalDate dataScadenza) {
		super();
		this.numeroTessera = numeroTessera;
		this.dataScadenza = dataScadenza;
	}

	public int getNumeroTessera() {
		return numeroTessera;
	}

	public void setNumeroTessera(int numeroTessera) {
		this.numeroTessera = numeroTessera;
	}

	public LocalDate getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}
	
	
	public Persona getPersona() {
		return persona;
	}
	
	public Seggio getSeggio() {
		return seggio;
	}
	
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public void setSeggio(Seggio seggio) {
		this.seggio = seggio;
		
	}

}
