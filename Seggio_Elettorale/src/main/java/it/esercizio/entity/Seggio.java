package it.esercizio.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Seggio {
	
	@Id
	private int codiceSeggio;
	private String sede;
	private String citta;
	private String provincia;
	private String regione;
	
	@OneToMany(mappedBy = "seggio")
	private List<TesseraElettorale> tessera;

	public Seggio() {
		super();
		
	}

	public Seggio(int codiceSeggio, String sede, String citta, String provincia, String regione) {
		super();
		this.codiceSeggio = codiceSeggio;
		this.sede = sede;
		this.citta = citta;
		this.provincia = provincia;
		this.regione = regione;
	}

	public int getCodiceSeggio() {
		return codiceSeggio;
	}

	public void setCodiceSeggio(int codiceSeggio) {
		this.codiceSeggio = codiceSeggio;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public List<TesseraElettorale> getTessera() {
		return tessera;
	}

	public void setTessera(List<TesseraElettorale> tessera) {
		this.tessera = tessera;
	}
	
	

}
