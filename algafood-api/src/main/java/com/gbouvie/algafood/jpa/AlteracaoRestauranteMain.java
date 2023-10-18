package com.gbouvie.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.gbouvie.algafood.AlgafoodApiApplication;
import com.gbouvie.algafood.domain.model.Restaurante;
import com.gbouvie.algafood.domain.repository.RestauranteRepository;

public class AlteracaoRestauranteMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
		
		Restaurante restaurante = new Restaurante();
		restaurante.setId(1L);
		restaurante.setNome("teste altera");
		
		restauranteRepository.salvar(restaurante);
	}
	
}
