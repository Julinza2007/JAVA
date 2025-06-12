/*
 8. Adivina el Número: Genera un número aleatorio entre 1 y 100 (inclusive). Pide al usuario
que adivine el número. Dale pistas como "El número es mayor" o "El número es menor"
hasta que adivine correctamente. Cuenta cuántos intentos le tomó.
*/

import java.util.Random; // Se importa desde las herramientas de java el Random para generar numeros aleatorios.
import java.util.Scanner;

public class ClasePrimaria {
	
	
	public static void main(String[] args) {
		Random random = new Random(); // Crea el random, que es el Random importado.
		int numRandom = random.nextInt(100) + 1;
		int numero = 0;
		int intentos = 0;
		Scanner sc = new Scanner(System.in);
				
		do{
			numero = ingresarNum(numero, sc); // Funcion para ingresar numeros.
			intentos++; // Se gasta un intento y se imprime en pantalla.
			System.out.println("Cantidad de intentos: " + intentos);
		}while(compararRandom(numero, numRandom)); // Hasta que el usuario no adivine el numero no termina.
		
		sc.close();
		
	}

	
	public static int ingresarNum(int n, Scanner sc) {
		System.out.print("\nIngrese un numero entre el 1 y 100 para intentar adivinar\nun numero aleatorio (inclusive): ");

		n = sc.nextInt();
		while(n < 1 || n > 100) { // Validacion de numero.
			System.out.println("\n\nError, recuerde valores entre 1 y 100 inclusive.");
			System.out.print("Ingrese nuevamente: ");
			n = sc.nextInt();
		}
		
		return n;
	}
	
	public static boolean compararRandom(int n, int r) {
		if(n > r) {
			System.out.println("\nEl numero ingresado es mayor que el numero random.");
			return true;
		}
		else if(n < r) {
			System.out.println("\nEl numero ingresado es menor que el numero random.");
			return true;
		}
		else if(n == r) {
			System.out.println("\nFelcidades, adivinaste. El numero random es: " + r);
			return false;
		}
		
		return true;
	}
}
