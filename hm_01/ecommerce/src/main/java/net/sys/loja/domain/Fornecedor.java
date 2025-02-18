package net.sys.loja.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="fornecedor")
public class Fornecedor {

	@Id
	@Column
	private Long id;
	
	@Column
	private Empresa empresa; 	 

	@Column
	private Produto produto;
	
	@Column
	private String nome;
	
	@Column
	private LocalDate Nascimento;
	
	@Column
	private String cnpj;
	
	@Column
	private String telefone;
	
	@Column
	private String email;
	
	@Column
	private String endereco;
	 
}
