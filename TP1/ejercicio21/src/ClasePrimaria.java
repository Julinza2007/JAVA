/*21. Crea un arreglo (array) de 10 números enteros. Pide al usuario que ingrese un número X.
Utiliza un bucle for-each para recorrer el arreglo y contar cuántos elementos son mayores que
X. Muestra el resultado por consola.
*/

import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []numeros = {-900, 1500, 91, 4, -1, -200, -5, 8, 9, 10}; // Declaro array con la lista de numeros enteros.
		int contMayor = 0;
		
		System.out.print("Ingrese un numero entero: ");
		int x = sc.nextInt();
		
		for (int numero: numeros) { // ForEach; se crea la variable numero que corresponde al elemento individual del array numeros.
			if(numero > x) { 
				contMayor++; // Si un numero es mayor que el numero ingresado por el usuario se suma 1 al contador de mayor.
			}
		}
		
		System.out.println("De " + numeros.length + " numeros enteros, " + contMayor + " son mayor/es que " + x);
		
	}

}
