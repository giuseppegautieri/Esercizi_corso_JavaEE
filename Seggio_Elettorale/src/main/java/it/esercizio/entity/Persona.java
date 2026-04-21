package it.esercizio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Persona {
	
	@Id
	private String codiceFiscale;
	private String nome;
	private String cognome;
	
	@OneToOne(mappedBy = "persona")
	private TesseraElettorale tessera;
	
	public Persona() {
		super();
		
	}

	public Persona(String codiceFiscale, String nome, String cognome) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	
}
