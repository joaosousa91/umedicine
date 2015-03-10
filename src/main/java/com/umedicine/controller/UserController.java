package com.umedicine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.umedicine.entity.Utilizador;
import com.umedicine.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute("user")
	public Utilizador addUtilizador(){
		return new Utilizador();
	}
	
	@RequestMapping("/users")
	public String utilizadores(Model model){
		model.addAttribute("users", userService.listarUtilizadores());
		return "users";
	}
	
	@RequestMapping("/users/{id}")
	public String detail (Model model, @PathVariable int id){
		model.addAttribute("user", userService.listarUtilizador(id));
		return "user-detail";
	}
	
	@RequestMapping("/register")
	public String mostraRegisto() {
		return "user-register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String efectuaRegisto(@ModelAttribute("user") Utilizador user) {
		userService.guardar(user);
		return "user-register";
	}


}
