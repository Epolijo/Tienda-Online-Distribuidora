package com.ecommerceleo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//primero vamos decirle que esto va aser un controler con @ para
//que spingfrmwer lo reconozca como tal, también un @recues

@Controller
@RequestMapping("/administrador")
public class AdministradorController {
	
	//ahora vamos a mapear el index asia esta url que sería localhost luego adminitrador  y el index
	//ponemos metodo public-q va a devolver una cadena metodo home
	//luego redireccionamos asis el archivo html
	
	@GetMapping("")
	public String index() {
		return"administrador/index";
	}


	
}
