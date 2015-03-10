package com.umedicine.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umedicine.entity.Utilizador;
import com.umedicine.repository.UtilizadorRepository;

@Service
@Transactional
public class UserService {

	@Autowired	
	private UtilizadorRepository userRepository;
	
	public List<Utilizador> listarUtilizadores(){
		return userRepository.findAll();
	}
	
	public Utilizador listarUtilizador(int id){
		return userRepository.findOne(id);
	}

	public void guardar(Utilizador user) {
		userRepository.save(user);
	}
}
