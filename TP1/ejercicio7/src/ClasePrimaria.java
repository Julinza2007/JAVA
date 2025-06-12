/* 
7. Contador de Vocales y Consonantes: Solicita al usuario una cadena de texto. Cuenta y
muestra el número de vocales (a, e, i, o, u, ignorando mayúsculas/minúsculas) y el número de
consonantes en la cadena.
*/

import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string;
		
		System.out.print("Ingrese una cadena de texto para calcular la cantidad de vocales y consonantes: ");		
		string = sc.nextLine();
		String cadena = string; // Guardo variable con la entrada original que el usuario ingresó.
		string = string.toLowerCase(); // Cadena de caracteres se forza a ser toda en minuscula para trabajar comodo mas adelante.
		
		int contVocales = 0;
		int contConsonantes = 0;
		int N = string.length();
		
		for(int i=0; i < N; i++) {
			
			if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z') { // Deben ser letras.
			
				if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
					contVocales++; // Se cuentan vocales.
				}
				else{
					contConsonantes++; // Sino son consonantes.
				}
				
			}
		}
		
		System.out.print("\nLa cadena de texto: " + cadena + "\nTiene " + contVocales + " vocal/es, y tiene " + contConsonantes + " consonante/s.");
		sc.close();
	}

}
