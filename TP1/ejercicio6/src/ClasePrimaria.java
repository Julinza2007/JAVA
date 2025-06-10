//6. Se le pide al usuario que ingrese una palabra o frase. Luego, muestra por consola la misma
//palabra o frase pero invertida. Por ejemplo, si ingresa "hola", debe mostrar "aloh".
import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string;
		
		System.out.print("Ingrese una palabra o frase para invertir su sentido: ");		
		string = sc.nextLine();
		int N = string.length();
		
		
		for(int i = (N - 1); i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
		
		sc.close();
	}

}
