package com.ecommerceleo.controller;

import org.slf4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerceleo.model.Producto;

//import com.ecommerceleo.model.Producto;

@Controller
@RequestMapping("/productos")

public class ProductoController {
	
	
	private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);
	
	@GetMapping("")
	public String show() {
		return "productos/show";
	}
	
	@GetMapping("/create")

	public String create() {
		return"productos/create";
	}
	
	@PostMapping("/save")
	public String save(Producto producto) {
		LOGGER.info("Este es el objeto producto {}",producto);
		
		return"redirect:/productos";
	}
}

//aqui vamos a crear un metodo que nos permita redireccionar hacia esa vista, lo que vamos a hacer para eso es craer un nuevo metodo//
//