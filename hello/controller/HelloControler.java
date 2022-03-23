package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloControler {
	
	@GetMapping("/hello")
	public String hello() {
		
		return "Hello World!!";
	}

	@GetMapping("/bsm")
	public String bsm(){
		
		return  "Lista de BMS's" 
				+ "Orientação ao Futuro\n"
				+ "Responsabilidade Pessoal\n"
				+ "Mentalidade de Crescimento\n"
				+ "Persistência\n"
				+ "Habilidades\n"
				+ "Trabalho em Equipe\n"
				+ "Atenção aos Detalhes\n"
				+ "Proatividade\n"
				+ "Comunicacao";
	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		
		return "Os objetivos da semana consistem em: \n Aprendizagem MySQL"
				+ "Diagramas no MySQL"
				+ "Conceitos do STS";
	}
	
}
