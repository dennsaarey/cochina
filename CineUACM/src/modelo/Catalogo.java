package modelo;

import java.util.ArrayList;

public class Catalogo {
	
	private ArrayList<Usuario> usuarios;

	public void Usuario(){
       usuarios=new ArrayList<Usuario>();
    }
	public void asociar(Usuario nombre){
	        usuarios.add(nombre);
	}
    public Usuario buscarUsuario(String usuario){
	        int i=0;
	        Usuario nombre=null;
	        boolean cierto=false;
	        while(i<usuarios.size()&& !cierto){
	            if(usuarios.get(i).darUsuario().equals(nombre)){
	            	nombre = usuarios.get(i);
	            	cierto=true;
	            }    i++;
	        }    return usuario;
	    }
	 public void buscarSocioImprime(String folioSocio){
	        int i=0;
	        boolean cierto=false;
	        while(i<socios.size()&& !cierto){
	            if(socios.get(i).darFolio().equals(folioSocio)){
	                System.out.println(socios.get(i));
	                cierto=true;
	            }       i++;

}
