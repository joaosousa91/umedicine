/**
 * 
 */
package com.umedicine.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * @author João
 *
 */

@Entity
public class Utilizador {
	
	public List<TipoUtilizador> getPapeis() {
		return papeis;
	}

	public void setPapeis(List<TipoUtilizador> papeis) {
		this.papeis = papeis;
	}

	@Id
	@GeneratedValue
	private Integer id;
	
	private String username;
	private String password;
	
	@ManyToMany
	@JoinTable
	private List<TipoUtilizador> papeis;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
