package br.edu.ifms.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_atleta")
public class Atleta extends Pessoa<Long>{
	private static final long serialVersionUID = 1L;
	
	private LocalDate dataNascimento;

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
