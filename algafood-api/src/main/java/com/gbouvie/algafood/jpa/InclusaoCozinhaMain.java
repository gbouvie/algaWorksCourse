package com.gbouvie.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.gbouvie.algafood.AlgafoodApiApplication;
import com.gbouvie.algafood.domain.model.Cozinha;
import com.gbouvie.algafood.domain.repository.CozinhaRepository;

public class InclusaoCozinhaMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Brasileira");
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Japonesa");
		
		cozinha1 = cozinhaRepository.adicionar(cozinha1);
		cozinha2 = cozinhaRepository.adicionar(cozinha2);
		
		System.out.printf("%d - %s\n", cozinha1.getId(), cozinha1.getNome());
		System.out.printf("%d - %s\n", cozinha2.getId(), cozinha2.getNome());
	}
	
}