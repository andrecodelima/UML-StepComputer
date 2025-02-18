package net.sys.loja.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="empresa")
public class Empresa {

	@Id
	@Column
	private Long id;
	
	@Column(name="nome_fantasia")
	private String nomeFantasia;
 
	@Column(name="razao_social")
	private String razaoSocial;
	

 
	
 
	
	
}
