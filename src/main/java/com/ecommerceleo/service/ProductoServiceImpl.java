package com.ecommerceleo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerceleo.model.Producto;
import com.ecommerceleo.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public Producto save(Producto producto) {
		
		return productoRepository.save(producto);
		
		//de esat manera tenemos implememtado nuestro metodo guardar 
	}

	@Override
	public Optional<Producto> get(Integer id) {
		return productoRepository.findById(id);
	}

	@Override
	public void update(Producto producto) {
		productoRepository.save(producto);
		
		//save se comporta ..cuado al objeto le mandamos como id un null este lo va a crear 
		//pero si al objeto lo mandamos con un id que ya existe en la base lo que va a hcer es actualizarlo 
		
	}

	@Override
	public void delete(Integer id) {
		productoRepository.deleteById(id);
		
	}
	
	//con esto ya esta implemnetado el metodo crud para los productos 

}


//a esta clase le ponemos implments que se extienda de la interface que hemos diseñado 
//se posiciona sobre el nombre de la clase enter en el primero add y se crea automaticamente los @override
// ..luego anotamos ala clase como un service de tal manera que nos permita inyectar en el controlador esat clase -produ servimpl 
// para hacer el llamado directamente a los metodos crud
// ahora implementamos metodo crud para producto 
//1-vamos a declarar objeto de tipo rpository  de esa interface , ya q lo q hace esta interf es obtener todos los metod
// crud q nos lo proporciona JPA repository entonces lo necesitamos para hacer la implementacion de de todo los metodos crud , 


//aqui utilizamos la notacion @autowairer que sirve para decir que estamos inyectando a esta clase un objeto 
//ponemos private






