//10. Solicita al usuario un número entero no negativo. Calcula y muestra el factorial de ese
//número

import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("Calculadora de factorial de numeros enteros no negativos.\n");
		
		num = ingresarNumero(num, sc); // Se implementa funcion para ingresar numero.
		int numOrig = num; // Se almacena el numero original para mostrarse en pantalla al final.
		calcularFactorial(num, numOrig); // Funcion para calcular factorial.
	}
	
	public static int ingresarNumero(int n, Scanner sc) {
		System.out.print("Ingrese un numero positivo: ");
		n = sc.nextInt();
		
		while(n < 0) { // Validacion de numero (Debe ser un numero natural).
			System.out.print("\nError, ingrese un numero positivo por favor: ");
			n = sc.nextInt();
		}
		
		return n;
	}
	
	public static void calcularFactorial(int n, int original) {
		int resultado = 1;
		while(n > 1) {
			resultado *= n;
			n--;
		}
		
		System.out.println("El factorial del numero " + original + "! es: " + resultado);
	}

}
