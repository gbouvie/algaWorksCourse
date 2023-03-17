package com.gbouvie.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.gbouvie.algafood.di.modelo.Cliente;

@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefonr %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	
}
