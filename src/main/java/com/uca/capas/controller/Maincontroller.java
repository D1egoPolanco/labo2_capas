package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class Maincontroller {

	@GetMapping("agregarUsuario")
	public String enviarform (Usuario usuario) {
		
		return "agregarUsuario";
		}
	@PostMapping ("agregarUsuario")
	public String procesaForm (Usuario usuario) {
		return "mostrarMensaje";
	}
	
	
}
