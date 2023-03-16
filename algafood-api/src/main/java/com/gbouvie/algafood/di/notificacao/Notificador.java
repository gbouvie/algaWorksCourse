package com.gbouvie.algafood.di.notificacao;

import com.gbouvie.algafood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}