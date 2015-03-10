package com.umedicine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.umedicine.service.PatientService;

@Controller
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@RequestMapping("/patients")
	public String listarPacientes(Model model){
		model.addAttribute("patients", patientService.listarPacientes());
		return "patients";
	}
	
	@RequestMapping("/patients/{id}")
	public String detail (Model model, @PathVariable int id){
		model.addAttribute("patient", patientService.listarPaciente(id));
		return "patient-detail";
	}
	
}
