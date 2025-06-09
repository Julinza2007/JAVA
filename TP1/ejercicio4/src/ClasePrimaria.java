/*4. Suma de Números Pares e Impares: Pide al usuario un número entero positivo N. Luego,
calcula y muestra la suma de todos los números pares desde 1 hasta N, y la suma de todos los
números impares desde 1 hasta N.*/

import java.util.Scanner;

public class ClasePrimaria {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un numero mayor a 1 por favor: > ");
		int N = sc.nextInt();
		sc.close();
		
		int par=0;
		int impar=0;
		int i;
		
		System.out.println("\n\nNumeros Pares:");
		
		for(i=2; i < N; i+=2) {
			System.out.println(i);
			par += i;
		}
		
		System.out.println("\n\nLa suma de todos los numeros pares hasta " + N + " es igual a: " + par);
		
		System.out.println("\nNumeros Impares:");

		for(i=1; i < N; i+=2) {
			System.out.println(i);
			impar += i;
		}
		
		System.out.println("\n\nLa suma de todos los numeros impares hasta " + N + " es igual a: " + impar);
		
	}

}