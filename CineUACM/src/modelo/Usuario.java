package modelo;

import java.io.Serializable;

public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * primero asignamos los aatributos que se utilizaran 
	 * para guardar los usuarios
	 */
	
	private String nombre;
	private String FechaNacimiento;
	private String Usuario;
	private String Contrasena;	
	/**
	 * Se realizan los metodos GET y SET con sus parametros correspondientes	 * @return
	 */
	public String darNombre() {
		return nombre;
	}
	
	public String darFechaNacimiento() {
		return FechaNacimiento;
	}
	
	public String darUsuario() {
		return Usuario;
	}
	
	public String darContrasena() {
		return Contrasena;
	}
	
	public void dameNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void dameFechaNacimiento(String fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public void dameUsuario(String usuario) {
		Usuario = usuario;
	}

	public void dameContrasena(String contrasena) {
		Contrasena = contrasena;
	}
	
}
