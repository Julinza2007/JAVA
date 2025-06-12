/*19. Crea un programa que simule el lanzamiento de dos dados. Genera dos números aleatorios
entre 1 y 6 (inclusive) para representar el resultado de cada dado. Muestra el valor de cada
dado y la suma total.
*/
import java.util.Random;
import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		do {
			lanzarDados(random); //Llamo a la funcion de lanzar los dados y paso la funcion random como argumento para utilizarla.			
		}while(deseaSeguir(sc)); // Condicion de si se desea seguir ejecutando el programa.
		
		System.out.println("\nPrograma terminado...");
	}
	
	public static void lanzarDados(Random random) {
		int dado1 = random.nextInt(6) + 1; // Valor aleatorio para dado 1  entre 1 y 6 inclusive.
		int dado2 = random.nextInt(6) + 1; // Valor aleatorio para dado 2 entre 1 y 6 inclusive.
		int suma = dado1 + dado2; // Suma de los resultados de los lanzamientos de los dados.
		System.out.println("Lanzando los dados...\n");
		System.out.println("Dado 1: " + dado1 + "\nDado 2: " + dado2);
		
		System.out.println("\nLa suma de los valores de los dos dados es igual a: " + suma);
	}
	
	public static boolean deseaSeguir(Scanner sc) { // Funcion booleana que determina si se continua o no con el programa.
		System.out.print("\nDesea continuar lanzando los dados? 1. Si || 0. No\n> ");
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