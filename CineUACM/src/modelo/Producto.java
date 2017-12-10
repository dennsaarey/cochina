package modelo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Producto implements Serializable{
			
	private static final long serialVersionUID = 1L;
		// Attributes
	 	private int idProducto;
	    private String nombrePelicula;
	    private String director;
	    private String protagonista;
	    private String genero;
	    private double precioventa;
	    private double preciorenta;
	    private double precioSd;
		private double precioHd;
		private double IVA;
		private assert quitaIva;
		private double Subtotal;
	     
	public Producto(int idProducto, String nombrepelicula, String director, String protagonista, String genero, 
					double precioventa, double preciorenta, double precioSd, double precioHd, double IVA, double Subtotal) {
		this.idProducto = idProducto;
        this.nombrePelicula = nombrepelicula;
        this.director=director;
        this.protagonista=protagonista;
        this.genero=genero;
        this.precioventa=precioventa;
        this.preciorenta=preciorenta;
        
		this.damePrecioSd(precioSd);
		this.damePrecioHd(precioHd);
		this.dameIVA(IVA);
		this.dameSubtotal(Subtotal);
		precioventa=0;
	    preciorenta=0;
		
	}
		public String Productos() {
			return "Nombre:\n " + this.darNombrePelicula() + "Precio SD\n: "+ this.darPrecioSd() + "Precio HD\n" + this.darPrecioHd() 
				+"IVA: \n"+this.darIVA()+"Subtotal"+ this.darSubtotal();
		}
	 	public int getId_pelicula() {
	       return idProducto;
	    }
	 	public String darNombrePelicula() {
			return nombrePelicula;
		}
	 	public String darDirector() {
	        return director;
	    }
	 	 public String darProtagonista() {
	         return protagonista;
	     }
	     
	 	 
	 	public double darPrecioSd() {
		return precioSd;
	 	}
	 	public double darPrecioHd() {
		return precioHd;
	 	}
	 	public double darIVA() {
	 		return IVA;
		}
	 	public double darSubtotal() {
	 		return Subtotal;
		}
	 	public void dameNombre(String nombrePelicula) {
	 		this.nombrePelicula = nombrePelicula;
	 	}
	 	

	     public void setProtagonista(String protagonista) {
	         this.protagonista = protagonista;
	     }
	 	
	 	public void damePrecioSd(double precioSd) {
	 		this.precioSd = precioSd;
		}
	 	public void dameDirector(String director) {
	        this.director = director;
	    }

	 	public void damePrecioHd(double precioHd) {
	 		this.precioHd = precioHd;
	 	}
	 	public static BigDecimal quitaIva(BigDecimal p, BigDecimal IVA) {
	 		
	 		return p / (1+(IVA/100));
	 	}
	 	assert quitaIva(121, 21) == 100
	 	
	 	public void dameIVA(double IVA){
	 	  IVA = 0.21;
	 		this.IVA = IVA;
		}
	 	public void dameSubtotal(double subtotal) {
			Subtotal = subtotal;
		}
	 	
	 	printi("")
	 	
	 	
}
