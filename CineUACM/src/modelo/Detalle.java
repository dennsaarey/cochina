package modelo;

import leer.Leer;


public class Detalle {

	public Detalle() {
		public static void main(String[] args) {
			/*
			 * 
			 */
		
			//Mostramos los resultados
	        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
	        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
	        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);

			boolean continuar = true;
			int lecturaProducto, lecturaCantidad; // Variables para seleccionar el producto y la cantidad que se quiere comprar

			// Se instancian y cargan los productos
			Producto disco1 = new Musica("Portishead", 18.53, 6, true, "Trip Hop");
			Producto disco2 = new Musica("Radiohead", 21.2, 20, true, "Rock");
			Producto cine1 = new Cine("Hierro 3", 30.2, 5, true, "Kim Ki Duk");
			Producto juego1 = new Videojuego("Mario Bross", 35.11, 0, false,
					"Plataformas");

			// Se crea el array "catálogo" para contener los productos. Su dimensión
			// viene del número de veces que se
			// instancia el contructor de Producto
			Producto catalogo[] = new Producto[Producto.dimesionArray];
			// Se crea el objeto gestion para trabajar (mostrar y vender productos,
			// y mostrar caja)
			Gestion gestion = new Gestion();

			// Se rellena el array catálogo
			catalogo[0] = disco1;
			catalogo[1] = disco2;
			catalogo[2] = cine1;
			catalogo[3] = juego1;

			do {
				System.out.println("\n\nIntroduzca la opción que desea realizar:\n"
						+ "1. Mostrar productos\n" + "2. Vender productos\n"
						+ "3. Mostrar caja\n"
						+ "SALIR --> Pulse cualquier otro número\n");
				switch (Leer.datoInt()) {
				case 1:
					gestion.mostrarProductos(catalogo);
					break;
				case 2:
					System.out.println("¿Que producto desea comprar?");
					gestion.mostrarNombreProductos(catalogo);
					lecturaProducto = Leer.datoInt();
					System.out.println("¿Cuánta cantidad desea comprar?");
					lecturaCantidad = Leer.datoInt();
					// Se carga el producto y la cantidad solicitada por el usuario
					gestion.comprarProducto(catalogo, lecturaProducto,
							lecturaCantidad);
					break;
				case 3:
					System.out.println(gestion.mostrarCaja() + " €");
					break;
				default:
					// Se sale del programa
					continuar = false;
				}

			} while (continuar);

			System.out.println("---- Gracias por usar la aplicación. ----");
	}

}
