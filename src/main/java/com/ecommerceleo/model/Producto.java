package com.ecommerceleo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//esta clase va a definir los productos de nuestro ecommerce

@Entity
@Table(name="productos")

public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private double precio;
	private int cantidad;
	
	
	
	@ManyToOne
	private Usuario usuario;// Este campo lo relaciono con la atabla usuario 
	
	//con el manytoone  lo que va a hacer internamenet el framework es crear un campo en 
	//en la tabla poductos para mandar el ID del usuario o un usuario como objeto
	//y que se mapee directamnte a la clase usuario
	//por eso en clase-usuario-le ponemos meppeo con el atibut usuario
	//ahora tenemos rlacionado usuario-producto
	
	//tambièn creamos un contructor vacio//
	public Producto() {
		
	}
	
	//un contructor con parametros//

	
	public Producto(Integer id, String nombre, String descripcion, String imagen, double precio, int cantidad,
			Usuario usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.cantidad = cantidad;
		this.usuario = usuario;
	}
	
	
	
	
	
	//creamos tambièn los gueter y seter//

	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	//tambièn agregamos tostring,este me hace retornar todos los campos //
		//de la clase como un solo  string, muchas veces es importante hacer una imprecion por consola y esto nos va muy bien//
		//ya que nos imprime tod lo que tiene ese objeto actualmente//
	

	public Usuario getUsuario() {
		return usuario;
	}
	
	

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	

}
