package br.com.alura.mvc.mudi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	//Isso é um action, que irá processar a requisição do usuário e redirecionar para uma view.
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("nome", "Mundo"); //settando o valor do atributo
		return "hello";
	}
}
