package net.sys.loja.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="carrinho")
public class ItemPedido {

	@Id
	@Column
	private Long id;
	
	@Column
	private Carrinho carrinho;
	
	@Column
	 private Integer quantidade;
	 
 
	
	
}
