package it.esercizio.component;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.esercizio.entity.Persona;
import it.esercizio.entity.Seggio;
import it.esercizio.entity.TesseraElettorale;
import it.esercizio.repository.PersonaRepository;
import it.esercizio.repository.SeggioRepository;
import it.esercizio.repository.TesseraRepository;

@Component
public class DataPopulator implements CommandLineRunner{
	
	private final PersonaRepository pRepo;
	private final SeggioRepository sRepo;
	private final TesseraRepository tRepo;
	
	public DataPopulator(PersonaRepository pRepo, SeggioRepository sRepo, TesseraRepository tRepo) {
		super();
		this.pRepo = pRepo;
		this.sRepo = sRepo;
		this.tRepo = tRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Seggio s1 = new Seggio(5544, "Palestra Comunale", "Milano", "MI", "Lombardia");
		Seggio s2 = new Seggio(1010, "Liceo Scentifico Galilei", "Napoli", "NA", "Campania");
		Seggio s3 = new Seggio(2020, "Scuola Media Pascoli", "Firenze", "FI", "Toscana");
		Seggio s4 = new Seggio(3030, "Palestra Comunale", "Bologna", "BO", "Emilia Romagna");
		Seggio s5 = new Seggio(4040, "Biblioteca Civica", "Torino", "TO", "Piemonte");
		Seggio s6 = new Seggio(5050, "Scuola Primaria Rodari", "Bari", "BA", "Puglia");
		Seggio s7 = new Seggio(6060, "Centro Sociale", "Palermo", "PA", "Sicilia");
 		
		sRepo.saveAll(List.of(s1, s2, s3, s4, s5, s6, s7));
		
		
		Persona p1 = new Persona("RSSMRA80A01H501U", "Mario", "Rossi");
        Persona p2 = new Persona("VRDLNE85B02F205Z", "Elena", "Verdi");
        Persona p3 = new Persona("NREFRN92C03L219X", "Francesco", "Neri");
        Persona p4 = new Persona("RMNGLL98D04H501A", "Giulia", "Romano");
        Persona p5 = new Persona("SPSMRC88E05F839W", "Marco", "Esposito");
        Persona p6 = new Persona("RCCSFO94F06L219Q", "Sofia", "Ricci");
        Persona p7 = new Persona("MRNNTN82G07H501Y", "Antonio", "Marino");
        Persona p8 = new Persona("MRTVLN96H08F205K", "Valentina", "Moretti");
        Persona p9 = new Persona("FNTDVD91L09L219J", "Davide", "Fontana");
        Persona p10 = new Persona("RSSNNA89M10H501S", "Anna", "Russo");
        Persona p11 = new Persona("LNCBNC90A01H501U", "Luca", "Bianchi");
        
        pRepo.saveAll(List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11));
      
		
		TesseraElettorale t1 = new TesseraElettorale();
		t1.setDataScadenza(LocalDate.of(2030, 3, 23));
		t1.setPersona(p1);
		t1.setSeggio(s1);
		
		tRepo.save(t1);
		
		TesseraElettorale t2 = new TesseraElettorale();
		t2.setDataScadenza(LocalDate.of(2028, 5, 20));
		t2.setPersona(p2);
		t2.setSeggio(s2);
		
		tRepo.save(t2);

		
		TesseraElettorale t3 = new TesseraElettorale();
		t3.setDataScadenza(LocalDate.of(2021, 3, 15));
		t3.setPersona(p3);
		t3.setSeggio(s1);
		
		tRepo.save(t3);
		
		TesseraElettorale t4 = new TesseraElettorale();
		t4.setDataScadenza(LocalDate.of(2030, 10, 10));
		t4.setPersona(p4);
		t4.setSeggio(s3);
		
		tRepo.save(t4);
		
		TesseraElettorale t5 = new TesseraElettorale();
		t5.setDataScadenza(LocalDate.of(2022, 6, 30));
		t5.setPersona(p5);
		t5.setSeggio(s4);
		
		tRepo.save(t5);

		TesseraElettorale t6 = new TesseraElettorale();
		t6.setDataScadenza(LocalDate.of(2027, 8, 12));
		t6.setPersona(p6);
		t6.setSeggio(s5);
		
		tRepo.save(t6);

		TesseraElettorale t7 = new TesseraElettorale();
		t7.setDataScadenza(LocalDate.of(2031, 12, 31));
		t7.setPersona(p7);
		t7.setSeggio(s6);
		
		tRepo.save(t7);

		TesseraElettorale t8 = new TesseraElettorale();
		t8.setDataScadenza(LocalDate.of(2020, 4, 3));
		t8.setPersona(p8);
		t8.setSeggio(s2);
		
		tRepo.save(t8);

		TesseraElettorale t9 = new TesseraElettorale();
		t9.setDataScadenza(LocalDate.of(2028, 5, 3));
		t9.setPersona(p9);
		t9.setSeggio(s3);
		
		tRepo.save(t9);

		TesseraElettorale t10 = new TesseraElettorale();
		t10.setDataScadenza(LocalDate.of(2030, 2, 28));
		t10.setPersona(p10);
		t10.setSeggio(s5);
		
		tRepo.save(t10);

		TesseraElettorale t11 = new TesseraElettorale();
		t11.setDataScadenza(LocalDate.of(2032, 7, 16));
		t11.setPersona(p11);
		t11.setSeggio(s4);
		
		tRepo.save(t11);
		
		System.out.println("Database popolato con 7 seggi e 11 elettori");
		
	}
	
	

}
