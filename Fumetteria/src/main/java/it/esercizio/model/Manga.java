package it.esercizio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
public class Manga {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titolo;
	private String autore;
	private double prezzo;
	
	@ManyToOne
	@JoinColumn(name = "id_fumetteria")
	@JsonBackReference
	private Fumetteria fumetteria;
	
	public Manga() {
		
	}

	public Manga(String titolo, String autore, double prezzo, Fumetteria fumetteria) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
		this.fumetteria = fumetteria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public Fumetteria getFumetteria() {
		return fumetteria;
	}

	public void setFumetteria(Fumetteria fumetteria) {
		this.fumetteria = fumetteria;
	}
	
	
}
