/*20. Pide al usuario la longitud deseada para una contraseña. Genera una contraseña aleatoria que
contenga una mezcla de letras minúsculas, mayúsculas y números, de la longitud
especificada. Por ejemplo, si el usuario pide una longitud de 8, la contraseña podría ser "aB7cD2eF".
*/

import java.util.Scanner;
import java.util.Random;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int N = 0;
		
		System.out.println("Generador de contrasenias aleatorio\n\n");
		
		N =	ingresarLongitud(N, sc); // funcion que ingresa la longitud de la contrasenia.
		
		generarContrasenia(N, random); // funcion que genera la contrasenia.
		
		sc.close();
	
	}
	
	public static int ingresarLongitud(int n, Scanner sc) {
		System.out.print("Ingrese la longitud para crear una contrasenia: ");
		n = sc.nextInt();
		while(n < 1) { // Validacion de longitud.
			System.out.print("\nError de longitud.\nIngrese de nuevo la longitud por favor: ");
			n = sc.nextInt();
		}
		
		return n;
	}
	
	public static void generarContrasenia(int n, Random random) {
		String contrasenia = "";
		int metodo = 0;
		char c= ' ';
		String minusculas = "abcdefghijklmnopqrstuvwxyz";
		String mayusculas = minusculas.toUpperCase();
		String numeros = "0123456789";
		
		
		for(int i=0; i < n; i++) { // Se repite tantas veces segun la longitud que el usuario eligió.
				metodo = random.nextInt(3) + 1; // Se define aleatoriamente el método a utilizar en cada ciclo.
		
			switch(metodo) {
				case 1:
					c = minusculas.charAt(random.nextInt(minusculas.length())); // Extrae y guarda un caracter aleatorio de las minusculas.
				break;
			
				case 2:
					c = mayusculas.charAt(random.nextInt(mayusculas.length())); // Extrae y guarda un caracter aleatorio de las mayusculas.
				break;
			
				case 3:
					c = numeros.charAt(random.nextInt(numeros.length())); // Extrae y guarda un caracter aleatorio de los numeros.
				break;
			}
		
			contrasenia += c; // Escribe la contrasenia, agregando caracter por caracter aleatorio hasta la longitud ingresada previamente.
		}
		
		System.out.println("\nLa contrasenia generada es: " + contrasenia);
		
	}
	

}
