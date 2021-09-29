package com.gbouvie.algafood.domain.exception;

public class EntidadeNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = -2637047118098507351L;

	public EntidadeNaoEncontradaException(String mensagem) {
		super(mensagem);
	}
}
