package br.edu.ifms.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tecnico")
public class Tecnico extends Pessoa<Long>{
	private static final long serialVersionUID = 1L;
	
	private Boolean arbitro;
	
	@OneToMany(mappedBy = "tecnico")
	private List<Equipe> equipes;

	public Boolean getArbitro() {
		return arbitro;
	}

	public void setArbitro(Boolean arbitro) {
		this.arbitro = arbitro;
	}
	
}
