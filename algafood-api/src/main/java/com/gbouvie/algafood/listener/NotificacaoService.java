package com.gbouvie.algafood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.gbouvie.algafood.di.notificacao.NivelUrgencia;
import com.gbouvie.algafood.di.notificacao.Notificador;
import com.gbouvie.algafood.di.notificacao.TipoDoNotificador;
import com.gbouvie.algafood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {

	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void ClienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema foi ativado!");
	}
	
}
