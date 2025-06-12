// 25. Realizar una calculadora con operaciones aritméticas simples (+,-,*,/)

import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		
		do {
			System.out.println("Calculadora de operaciones aritmeticas simples.\n");
			opc = ingresarOpcion(opc, sc); // Se llama a la funcion que ingresa la opcion de calculo.
			menuOpc(opc, sc); // Se llama a la funcion y se calcula segun la operacion elegida.
		}while(deseaSeguir(sc)); // Se le pregunta al usuario si desea continuar utilizando la calculadora.
		
		System.out.println("\nSaliendo de la calculadora...");	
	}
	
	public static int ingresarOpcion(int opc, Scanner sc) {
		System.out.println("Ingrese 1. Si desea realizar suma.");
		System.out.println("Ingrese 2. Si desea realizar resta.");
		System.out.println("Ingrese 3. Si desea realizar multiplicacion.");
		System.out.println("Ingrese 4. Si desea realizar division.");
		System.out.print("\nIngrese opcion por favor: \n> ");
		opc = sc.nextInt();
		while(opc < 1 || opc > 4) { // Valida la opcion
			System.out.println("Error en ingreso de opcion. Ingrese de nuevo la opcion por favor:\n > ");
			opc = sc.nextInt();
		}
			
		return opc;
	}
	
	public static void menuOpc(int opc, Scanner sc) {
		System.out.print("\nIngrese el primer numero: ");
		double num1 = sc.nextDouble();
		
		System.out.print("\nIngrese el segundo numero: ");
		double num2 = sc.nextDouble();
				
		switch(opc) {
		
			case 1: // Se realiza y muestra la suma.
				System.out.println("\nResultado: " + num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		
			case 2: // Se realiza y muestra la resta.
				System.out.println("\nResultado: " + num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		
			case 3: // Se realiza y muestra la multiplicacion.
				System.out.println("\nResultado: " + num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		
			case 4: // Se realiza y muestra la division.
				if (num2 != 0) { // Condicion por si existe division entre 0.
					System.out.println("\nResultado: " + num1 + " / " + num2 + " = " + (num1 / num2));
				} 
				else {
					System.out.println("\nError: no se puede dividir por cero.");
				}
			break;		
		}
	}
	
	public static boolean deseaSeguir(Scanner sc) { // Funcion booleana que determina si se continua o no con el programa.
		System.out.print("\nDesea continuar realizando operaciones con la caluladora? 1. Si || 0. No\n> ");
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