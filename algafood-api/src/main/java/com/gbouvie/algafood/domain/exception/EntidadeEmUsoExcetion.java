package com.gbouvie.algafood.domain.exception;

public class EntidadeEmUsoExcetion extends RuntimeException{

	private static final long serialVersionUID = 5288476943942830176L;

	public EntidadeEmUsoExcetion(String mensagem) {
		super(mensagem);
	}
}
