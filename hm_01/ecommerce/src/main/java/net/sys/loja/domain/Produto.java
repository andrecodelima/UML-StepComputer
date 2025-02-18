package net.sys.loja.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="produto")
public class Produto {

	@Id
	@Column
	private Long id;
	
	private CategoriaProduto categoriaProduto;
	
	@Column
	private String nome;
	
	@Column
	private String descricao;
	
	@Column
	private Float preco;
	
	@Column
	private Integer estoque;
	
	@Column
	private String imagem;
	
	@Column
	private String status;
	
	@Column
	private LocalDateTime dataCadastro;

}
