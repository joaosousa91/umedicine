/**
 * 
 */
package com.umedicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umedicine.entity.Paciente;

/**
 * @author João
 *
 */
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{

}
