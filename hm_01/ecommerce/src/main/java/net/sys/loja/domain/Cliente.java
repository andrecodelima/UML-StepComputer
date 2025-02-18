package net.sys.loja.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="cliente")
public class Cliente {

	@Id
	@Column
	private Long id;
	
	private Usuario usuario;
	
	@Column
	private String cpf;
	
	@Column
	private LocalDate endereco;
	
	 
	
 
	
	
}
