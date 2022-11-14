package br.com.alura.mvc.mudi.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.mvc.mudi.dto.RequisicaoNovaOferta;
import br.com.alura.mvc.mudi.model.Oferta;

@RestController
@RequestMapping("/api/ofertas")
public class OfertasRest {

	@PostMapping
	public Oferta criarOferta(RequisicaoNovaOferta requisicao) {
		
	}
}
