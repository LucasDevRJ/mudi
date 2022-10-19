package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi Note 8");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/714OLO-uw1L._AC_SL1500_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Celular-Xiaomi-Redmi-Global-Mineral/dp/B07YB7NLY7");
		pedido.setDescricao("Uma descrição qualquer para este pedido.");
		
		//para criar uma lista de pedidos
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedido);
		
		return "home";
	}
}
