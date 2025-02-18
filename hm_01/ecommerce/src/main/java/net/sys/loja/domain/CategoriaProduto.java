package net.sys.loja.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="categoria_produto")
public class CategoriaProduto {

	@Id
	@Column
	private Long id;
	
	private Produto produto;
	
	@Column
	private String nome;

	@Column
	private String descricao;

	 
 
	
	
}
