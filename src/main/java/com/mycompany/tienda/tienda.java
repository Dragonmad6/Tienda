/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ccalv
 */
public class tienda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub1
	//Scanner
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
	
	//Variables
		int opcion = -1;
		
	//ArrayList
		ArrayList<Articulo> catalogo = new ArrayList<Articulo>();
		inicializaCatalogo(catalogo);
		
		Carrito carro = new Carrito();
	
		
	//Menu
		System.out.println("Bienvenido a nuestra tienda por favor siga las instrucciones y selecccione nuestra gran varieda de productos.\n");
		do {
			System.out.println("1. Dar de alta un articulo");
			System.out.println("2. Comprar un articulo");
			System.out.println("3. Confirma compra");
			System.out.println("0. Salir");
				opcion = sc2.nextInt();
			
			switch (opcion) {
			case 1:
				addArticuloCatalogo(catalogo, sc, sc2);
				mostrarCatalogo (catalogo);
				break;
			case 2:
				comprar(catalogo, carro, sc, sc2);				
				break;
			case 3:
				
				break;
			case 0:
				System.out.println("Gracias por su compra.");
				break;
			default:
				System.out.println("Opcion incorrecta, lea atentamente.");
				break;
			}
		}while(opcion != 0);
	}
	private static void inicializaCatalogo(ArrayList<Articulo> c) {
		c.add(new Articulo ("0001", "Monitor",  200.00F,10));
		c.add(new Articulo ("0002", "Teclado",  10.00F,100));
		c.add(new Articulo ("0003", "RJ45 2M",  4.50F,50));
		c.add(new Articulo ("0004", "Raton",  200.00F,15));	
	}
	
	private static void addArticuloCatalogo(ArrayList<Articulo> c, Scanner sc, Scanner sc2) {
		//Problemas con los Scanners
		Articulo a = new Articulo();
		System.out.println("Introduce el codigo del nuevo articulo.");
		String codigo = sc.nextLine();
		System.out.println("Introduce el nombre del nuevo articulo.");
		String nombre = sc.nextLine();
		System.out.println("Introduce el precio del nuevo articulo.");
		float precio = sc2.nextFloat();
		System.out.println("Introduce el stock del nuevo articulo.");
		int stock = sc2.nextInt();
		c.add(new Articulo(codigo, nombre,precio, stock));
	}
	
	private static void mostrarCatalogo(ArrayList<Articulo> c) {
		
		for (Articulo a: c)
			System.out.println(a);
		System.out.println("------------------------------------------------------------------------");
	}
	private static int buscarPosicionArticuloPorCodigo(ArrayList<Articulo> c, String codigo) {
		int talla_catalogo = c.size();
		int i=0;
		boolean found = false;
		
		while(i<talla_catalogo && !(found)) {
			if (c.get(i).getCodigo().equals(codigo)) {
				found = true;
			}else {
				i++;
			}
		}	
		
		if (found)
			return i;
		else
			return -1;
	}
	private static Articulo buscarArticuloPorCodigo(ArrayList<Articulo> c, String codigo) {
		int talla_catalogo = c.size();
		int i = 0;
		Articulo a = null;
		boolean found= false;
		
		while(i<talla_catalogo && !(found)) {
			if (c.get(i).getCodigo().equals(codigo))
			{
				a = c.get(i);
				found=true;
			}
			else
				i++;
		}
		
		return a;
		
	}
	private static void comprar(ArrayList<Articulo> c, Carrito carro, Scanner sc, Scanner sc2) {
		
		int opcion;
		int salircomprar = -1;
		//
		do {
		//Mostramos catalogo
		System.out.println("Este es nuestro catalogo:");
		mostrarCatalogo(c);		
		//Pedimos articulo 	por codigo y su búsqueda 
		System.out.println("Introduce el codigo del articulo");
			String codigo = sc.nextLine();
			Articulo a = buscarArticuloPorCodigo(c, codigo);
			if (a != null) {
				System.out.println("Indica la cantidad que quieres: ");
				int cantidad = sc2.nextInt();
				//Si no tengo suficiente hare lo mismo que si no hubiera encontrado el articulo
				if (a.disponible(cantidad))
					carro.addArticulo(a, cantidad);
				else 
					System.out.println("Articulo no disponible elija otro y revise la cantidad elegida.");					
			}
			else 
				System.out.println("Articulo no disponible, elija otro o revise la cantidad elegida.");
			
			System.out.println(carro.mostrarCarrito());
			System.out.println("Pulsa 0 si quieres salir de comprar e ir a confirmar.");
			System.out.println("Cualquier otra cosa ");
			}while(salircomprar != 0);
		
			
		//	si existe Pedimos cantidad
		//		si hay disponibilidad
		//			Añadimos al carrito
		// repetir mientras
	}
	private static void modificarStockCatalogo(ArrayList<Articulo> c, Carrito carro) {
		int pos;
		for (ArticuloCarrito ac: carro.pedido) {
			pos = buscarPosicionArticuloPorCodigo(c, ac.elemento.getCodigo());
			if (pos > -1)
				c.get(pos).ajustarStock(-1*ac.cantidad);
		}
	}
	private static void confirmarCarrito(ArrayList<Articulo> c, Carrito carro, Scanner sc, Scanner sc2) {
		
		//Mostrar carrito articulos + cantidades + total
		System.out.println(carro.mostrarCarrito());
		//Preguntamos confirmacion
		System.out.println("1. Para confirmar, otra tecla para seguir comprando.");
		
		int confirmar = sc2.nextInt();
		if (confirmar == 1) {
			modificarStockCatalogo(c, carro);
			carro.confirmado = Carrito.CONFIRMADO;
			System.out.println(carro.mostrarCarrito());
			mostrarCatalogo(c);
			System.out.println("Gracias por su compra. Puede continuar comprando.");
			carro = new Carrito();
		}else{
			System.out.println("Puede continuar comprando.");
		}
		// Si se confirma 
		//		MOdificar en el catalogo el stock de los articulos del carrito, retando las cantidades al stock
		//		Cambiar el estado del carrito a confirmado 
		//Mostramos mensaje 
		
	}
	
	
}
