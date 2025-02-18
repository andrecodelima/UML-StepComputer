package net.sys.loja.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="imagem_produto")
public class ImagemProduto {

	@Id
	@Column
	private Long id;
	
	private Produto produto;
	
	@Column
	private String url;


	 
 
	
	
}
