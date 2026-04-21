package it.esercizio.service;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.esercizio.model.*;
import it.esercizio.repository.*;

@Component
public class DatabasePopulator implements CommandLineRunner{
	
	private final FumetteriaRepository fRepo;
	private final MangaRepository mRepo;
	
	public DatabasePopulator(FumetteriaRepository fRepo, MangaRepository mRepo) {
		this.fRepo = fRepo;
		this.mRepo = mRepo;
	}

	@Override
	public void run(String... args) throws Exception{
		Fumetteria f1 = new Fumetteria("Otaku Paradise", "Via del Corso 2");
		fRepo.save(f1);
		
		Manga m1 = new Manga("One Piece", "Oda", 5.90, f1);
		Manga m2 = new Manga("Berserk", "Miura", 7.90, f1);
		
		mRepo.saveAll(List.of(m1,m2));
		
		System.out.println("Database Manga popolato correttamente!");
	}
}
