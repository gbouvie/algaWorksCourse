package com.gbouvie.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gbouvie.algafood.di.modelo.Cliente;
import com.gbouvie.algafood.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("/hello")
	@ResponseBody
	public String Hello() {
		Cliente joao = new Cliente("João", "joao@xyz.com", "4548965454");
		
		ativacaoClienteService.ativar(joao);
		
		return "Hello!";
	}
	
}
