/*
13. Crea un programa que permita al usuario convertir temperaturas de Celsius a Fahrenheit o de
Fahrenheit a Celsius. Pide al usuario que elija la dirección de la conversión y luego el valor a
convertir.
Fahrenheit a Celsius: C=(F−32)×5/9
Celsius a Fahrenheit: F=C×9/5+32
*/

import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora de conversión de temperaturas\n");
		System.out.println("Menu de opciones:");

		do { // Implemento funciones para mayor legibilidad y facilidad de depuración de errores del código.
			System.out.println("Ingrese la opcion 1. si desea convertir de grados Celsius a Fahrenheit");
			System.out.println("Ingrese la opcion 2. si desea convertir de grados Fahrenheit a Celsius.");
			System.out.print("\nIngrese opcion:\n> ");
			int opc = ingresarOpc(sc); // Usuario ingresa opcion.
			menuOpc(opc, sc); // Se ejecuta la opcion elegida por el usuario.
						
		}while(deseaSeguir(sc)); // Condicion para saber si se termina el programa o no.
		
		System.out.println("\n\nTerminando...");
		sc.close();
	}
	
	public static void menuOpc(int opc, Scanner sc) {
		int tempC = 0; // Temperatura en Celsius.
		int tempF = 0; // Temperatura en Fahrenheit.
		
		switch(opc) {
		
			case 1: // Caso Celsius a Fahrenheit.
				System.out.print("Ingrese los grados Celsius para convertir a Fahrenheit: ");
				tempC = sc.nextInt();
				tempF = tempC * 9 / 5 + 32; // Conversion de Celsius a Fahrenheit.
				
				System.out.println(tempC + "°C son " + tempF + "°F");
				
			break;
			
			case 2: // Caso Fahrenheit a Celsius
				System.out.print("Ingrese los grados Fahrenheit para convertir a Celsius: ");
				tempF = sc.nextInt();
				tempC = (tempF - 32) * 5 / 9; // Conversion de Fahrenheit a Celsius.
				System.out.println(tempF + "°F son " + tempC + "°C");

			break;
		}
	}
	
	public static int ingresarOpc(Scanner sc) {
		int opc = sc.nextInt();
		while(opc != 1 && opc != 2) { // Validacion de opcion.
			System.out.print("Error, opcion invalida. Ingrese de nuevo:\n> ");
			opc = sc.nextInt();
		}
		return opc;
	}
	
	public static boolean deseaSeguir(Scanner sc) { // Funcion booleana que determina si se continua o no con el programa.
		System.out.print("\nDesea continuar cargando temperaturas? 1. Si || 0. No\n> ");
		int seguir = sc.nextInt();
		
		while(seguir != 0 && seguir != 1) { // Validacion de opcion.
			System.out.print("Error, opcion invalida. Ingrese de nuevo:\n> ");
			seguir = sc.nextInt();
		}
		
		if(seguir == 0) {
			return false;
		}
		else {
			return true;
		}
		
	}

}