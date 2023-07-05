package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping("/turma")
public class TurmaController {
	
	@GetMapping
	public String mostraForm(Turma turma) {
		return "add-turma";
	}
	
	@Autowired
	private TurmaRepository turmaRepository;
	
	@PostMapping
	public ModelAndView addTurma(Turma turma) {
		turmaRepository.save(turma);
		ModelAndView modelAndView = new ModelAndView("add-turma");
		modelAndView.addObject("mensagem", "Salvo com sucesso!");
		return modelAndView;
	}
	
	@GetMapping("/lista")
	public ModelAndView listaTurma() {
		ModelAndView modelAndView = new ModelAndView("lista");
		List<Turma> turmas = turmaRepository.findAll();
		modelAndView.addObject("turmas", turmas);
		return modelAndView;
	}
	
}
