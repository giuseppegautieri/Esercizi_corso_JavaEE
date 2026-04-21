package it.esercizio.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Fumetteria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String indirizzo;
	
	@OneToMany(mappedBy = "fumetteria", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Manga> listaManga = new ArrayList<>();
	
	public Fumetteria() {
		
	}

	public Fumetteria(String nome, String indirizzo) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public List<Manga> getListaManga() {
		return listaManga;
	}

	public void setListaManga(List<Manga> listaManga) {
		this.listaManga = listaManga;
	}
	
	

}
