package net.sys.loja.domain;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="pedido")
public class Pedido {

	@Id
	@Column
	private Long id;
	
	private Cliente cliente;
	
	private Produto produto;
	
	private Pagamento pagamento;
	
	
	@Column
	private LocalDate dataPedido;
	
	@Column
	private String status;
	
	@Column
	private List item;
	
	@Column
	private Float valorTotal;
	
	 
	 
 
	
	
}
