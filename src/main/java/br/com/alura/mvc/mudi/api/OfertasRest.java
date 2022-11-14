package br.com.alura.mvc.mudi.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.mvc.mudi.dto.RequisicaoNovaOferta;

@RestController
@RequestMapping("/api/ofertas")
public class OfertasRest {

	public Oferta criarOferta(RequisicaoNovaOferta requisicao) {
		
	}
}
