/**
 * 
 */
package com.umedicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umedicine.entity.Paciente;

/**
 * @author Jo�o
 *
 */
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{

}
