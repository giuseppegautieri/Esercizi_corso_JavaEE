package it.esercizio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import it.esercizio.repository.SeggioRepository;
import it.esercizio.repository.TesseraRepository;

@Controller
public class ElettoraleController {
	
	@Autowired
	private TesseraRepository tRepo;

	@Autowired
	private SeggioRepository sRepo;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/seggi")
	public String elencoSeggi(Model model) {
		model.addAttribute("listaSeggi", sRepo.findAll());
		return "seggi";
	}
	
	@GetMapping("/elenco-voto")
	public String visualizzaElenco(@RequestParam(required = false)String cf, Model model) {
		
		if(cf != null && !cf.isEmpty()) {
			model.addAttribute("listaTessere", tRepo.findByPersonaCodiceFiscale(cf).stream().toList());
		}else {
			model.addAttribute("listaTessere", tRepo.findAll());
		}
		model.addAttribute("oggi", java.time.LocalDate.now());
		return "voto";
	}
}
