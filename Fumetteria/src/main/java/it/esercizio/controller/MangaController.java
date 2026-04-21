package it.esercizio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import it.esercizio.model.Fumetteria;
import it.esercizio.repository.FumetteriaRepository;

@Controller
@RequestMapping("/manga-world")
public class MangaController {
	
	@Autowired
	private FumetteriaRepository fRepo;
	
	@GetMapping("/lista")
	public String getLista(Model model){
		
		List<Fumetteria> fumetterie = fRepo.findAll();
		
		model.addAttribute("elenco", fumetterie);
		return "catalogo";
	}

}
