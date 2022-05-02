package br.senac.juridico.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.juridico.service.AtendimentoRegistroService;



@RestController
@RequestMapping("api/registro")
public class AtendimentoRegistroController {
	
	private AtendimentoRegistroService registroService;

	
	
}
