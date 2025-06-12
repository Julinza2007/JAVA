//6. Se le pide al usuario que ingrese una palabra o frase. Luego, muestra por consola la misma
//palabra o frase pero invertida. Por ejemplo, si ingresa "hola", debe mostrar "aloh".
import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string; // Declar string.
		
		System.out.print("Ingrese una palabra o frase para invertir su sentido: ");		
		string = sc.nextLine(); // Lee la cadena de caracteres introducida por el usuario.
		int N = string.length(); // Extrae la cardinalidad o la cantidad de letras que posee el string.
		
		
		for(int i = (N - 1); i >= 0; i--) { // For que invierte la palabra.
			System.out.print(string.charAt(i)); // Se imprime un valor caracter del string segun el valor de i del ciclo for.
		}
		
		sc.close();
	}

}
