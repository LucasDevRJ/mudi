package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.mvc.mudi.dto.RequisicaoNovoPedido;
import br.com.alura.mvc.mudi.model.Pedido;

@Controller
@RequestMapping("pedido") //todas as requisições de pedido virão para cá
public class PedidoController {

	@GetMapping("formulario")
	public String formulario() {
		return "pedido/formulario";
	}
	
	@PostMapping("novo")
	public String novo(RequisicaoNovoPedido requisicao) {
		
		Pedido pedido = requisicao.toPedido();
		
		return "pedido/formulario";
	}
}
