package net.sys.loja.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="pagamento")
public class Pagamento {

	@Id
	@Column
	private Long id;
	
	private Produto produto;
	
	private Pedido pedido;
	
	
	@Column
	private String metodo;
	
	 @Column
	private Integer quantidade;
	 
	 @Column
	private Float precoUnitario;
	 
	
 
	
	
}
