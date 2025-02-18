package net.sys.loja.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="desenvolvedor")
public class Desenvolvedor {

	@Id
	@Column
	private Long id;
	
	private Cargo cargo;
	
	@Column
	private String nome;

	@Column
	private String descricao;

	 
 
	
	
}
