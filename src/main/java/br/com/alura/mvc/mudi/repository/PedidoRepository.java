package br.com.alura.mvc.mudi.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

	List<Pedido> findByStatus(StatusPedido status, Sort sort);

	@Query("SELECT p FROM Pedido p JOIN p.user u WHERE u.username = :username")
	List<Pedido> findAllByUsuario(@Param("username") String username);

	@Query("SELECT p FROM Pedido p JOIN p.user u WHERE u.username = :username and p.status = :status")
	List<Pedido> findByStatusUser(@Param("status")StatusPedido status,@Param("username") String username);
	
}
