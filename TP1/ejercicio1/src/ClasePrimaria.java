/* 1. Escribir por consola los números de del 1 al 100 de la siguiente forma
si el número es par, escribir par sino escribir el mismo número */


public class ClasePrimaria { // Clase primaria.

	public static void main(String[] args) { // Main
		for(int i=1; i <= 100; i++) {
			if(i % 2 == 0){ // Condicion de que el resto dividido por 2 es cero, definicion de numero par.
				System.out.println("Es par"); 
			}
			else{
				System.out.println(i);
			}
		}
	}

}