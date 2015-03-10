package com.umedicine.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paciente {
	@Id
	private Integer nprocesso;
	
	private String nomePaciente;
	private String raca;
	private Date dataNascimento;

	public Paciente(){}

	public Paciente(Integer nproc, String nome, String raca, Date dob){
		this.nprocesso = nproc;
		this.nomePaciente = nome;
		this.raca = raca;
		this.dataNascimento = dob;
	}

	public Integer getNprocesso() {
		return nprocesso;
	}

	public void setNprocesso(Integer nprocesso) {
		this.nprocesso = nprocesso;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
