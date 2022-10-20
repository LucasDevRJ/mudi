package br.com.alura.mvc.mudi.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;

@Repository
public interface PedidoRepository {
	
	public List<Pedido> findAll();
}
