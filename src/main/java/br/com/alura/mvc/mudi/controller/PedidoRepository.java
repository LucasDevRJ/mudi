package br.com.alura.mvc.mudi.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.alura.mvc.mudi.model.Pedido;

public class PedidoRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<Pedido> recuperaTodosPedidos() {
		Query query = entityManager.createQuery("SELECT p FROM Pedido p", Pedido.class);
		List<Pedido> pedidos = query.getResultList();
		return query.getResultList();
	}
}
