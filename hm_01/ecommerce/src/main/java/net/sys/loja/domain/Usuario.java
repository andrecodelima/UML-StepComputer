package net.sys.loja.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="usuario")
public class Usuario {

	@Id
	@Column
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private LocalDate Nascimento;
	
	@Column
	private String cpf;
	
	@Column
	private String telefone;
	
	@Column
	private String email;
	
	@Column
	private String genero;
	
	@Column
	private String login;
	
	@Column
	private String password;
	
	@Column
	private LocalDateTime DataCriacao;
	
	
}
