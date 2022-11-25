package com.ecommerceleo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerceleo.model.Producto;

//integer es el ID de cada clase 

@Repository
public interface ProductoRepository extends JpaRepository<Producto , Integer > {

}


//integer es el ID de cada clase 
//luego para que la clase la podamos inyectar,luego en el servis vamos ausar la notacion 
//@Repository , de esta manerael framework va a entender que este es un artefacto de 
//spring y lo va a inyectar donde nosotrso lo querramos usar 
