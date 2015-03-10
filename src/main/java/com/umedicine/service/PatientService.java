package com.umedicine.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umedicine.entity.Paciente;
import com.umedicine.repository.PacienteRepository;

@Service
@Transactional
public class PatientService {

	@Autowired
	private PacienteRepository pacienteRepository;
	
	public List<Paciente> listarPacientes(){
		return pacienteRepository.findAll();
	}
	
	public Paciente listarPaciente(int id){
		return pacienteRepository.findOne(id);
	}
	
}
