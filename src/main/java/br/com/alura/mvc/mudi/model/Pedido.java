package br.com.alura.mvc.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pedido {

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public List<Oferta> getOfertas() {
		return ofertas;
	}

	public void setOfertas(List<Oferta> ofertas) {
		this.ofertas = ofertas;
	}

	private String nomeProduto;
	private BigDecimal valorNegociado;
	private LocalDate dataDaEntrega;
	private String urlProduto;
	private String urlImagem;
	private String descricao;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Oferta> ofertas;
	
	@Enumerated(EnumType.STRING)
	private StatusPedido status;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public BigDecimal getValorNegociado() {
		return valorNegociado;
	}
	
	public void setValorNegociado(BigDecimal valorNegociado) {
		this.valorNegociado = valorNegociado;
	}
	
	public LocalDate getDataDaEntrega() {
		return dataDaEntrega;
	}
	
	public void setDataDaEntrega(LocalDate dataDaEntrega) {
		this.dataDaEntrega = dataDaEntrega;
	}
	
	public String getUrlProduto() {
		return urlProduto;
	}
	
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	
	public String getUrlImagem() {
		return urlImagem;
	}
	
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public StatusPedido getStatus() {
		return status;
	}
	
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
}
