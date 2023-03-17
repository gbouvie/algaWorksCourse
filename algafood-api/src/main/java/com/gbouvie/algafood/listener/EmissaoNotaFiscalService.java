package com.gbouvie.algafood.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.gbouvie.algafood.di.service.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalService {

	@EventListener
	public void ClienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Emitindo Nota Fiscal para cliente " + event.getCliente().getNome());
	}
	
}
