package com.umedicine.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class TipoUtilizador {
	@Id
	@GeneratedValue
	private Integer id;
	
	private String nome;
	
	@ManyToMany(mappedBy="papeis")
	private List<Utilizador> utilizadores;

	public List<Utilizador> getUtilizadores() {
		return utilizadores;
	}

	public void setUtilizadores(List<Utilizador> utilizadores) {
		this.utilizadores = utilizadores;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
