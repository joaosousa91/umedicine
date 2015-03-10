/**
 * 
 */
package com.umedicine.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umedicine.entity.Paciente;
import com.umedicine.entity.TipoUtilizador;
import com.umedicine.entity.Utilizador;
import com.umedicine.repository.PacienteRepository;
import com.umedicine.repository.TipoUtilizadorRepository;
import com.umedicine.repository.UtilizadorRepository;

/**
 * @author João
 *
 */
@Transactional
@Service
public class InitDbService {

	@Autowired
	private TipoUtilizadorRepository tipoUtilizadorRepository;

	@Autowired
	private UtilizadorRepository userRepository;

	@Autowired
	private PacienteRepository pacienteRepository;

	@PostConstruct
	public void init(){
		TipoUtilizador tipoAdmin = new TipoUtilizador();
		tipoAdmin.setNome("ADMIN");
		tipoUtilizadorRepository.save(tipoAdmin);

		TipoUtilizador tipoPaciente = new TipoUtilizador();
		tipoPaciente.setNome("PACIENTE");
		tipoUtilizadorRepository.save(tipoPaciente);

		TipoUtilizador tipoMedico = new TipoUtilizador();
		tipoMedico.setNome("MÉDICO");
		tipoUtilizadorRepository.save(tipoMedico);

		Utilizador userAdmin = new Utilizador();
		userAdmin.setUsername("admin");
		userAdmin.setPassword("adminadmin");
		List<TipoUtilizador> papeis = new ArrayList<TipoUtilizador>();
		papeis.add(tipoAdmin);
		papeis.add(tipoMedico);
		papeis.add(tipoPaciente);
		userAdmin.setPapeis(papeis);
		userRepository.save(userAdmin);

		Utilizador userPedro = new Utilizador();
		userPedro.setUsername("Pedro");
		userPedro.setPassword("qwerty");
		userRepository.save(userPedro);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String str2date="05/05/1991";
		Date newdate = new Date();
		try {
			newdate = dateFormat.parse(str2date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Paciente paciente0 = new Paciente(1, "João", "Caucasiano", newdate);
		pacienteRepository.save(paciente0);
		
		str2date="10/03/2015";
		try {
			newdate = dateFormat.parse(str2date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		paciente0 = new Paciente(3352, "John Doe", "Africano", newdate);
		pacienteRepository.save(paciente0);



	}
}
