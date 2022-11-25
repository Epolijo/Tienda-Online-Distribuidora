package com.ecommerceleo.service;

import java.util.Optional;

import com.ecommerceleo.model.Producto;

public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id);	
	public void update(Producto producto);
	public void delete(Integer id);

}

//una intrface solo se define los metodos el public solo va a retornar un producto 
//y que le vamos a llamr de nombre save y q recibe como parametro un objeto de tipo producto.
//luego vamos a crear otro metodo que nos permita obtener un Optional de tipo poducto
//por que se utiliza optional  porq da la posibilodad de validar si es que el objeto que obtenermos,
//que mandamos a llamar de la base de datos existe o no .
//luego un get donde le pasamos un id del producto a buscar 
//luego vamos a definir el metodo que nos va a permitir actualizar UPDATE
//LUEGO el que nos va a permitir eliminar donde le paso el objeto a eliminar 
//..entonces aqui tenemoos la inteface con la definciin de los servicios 