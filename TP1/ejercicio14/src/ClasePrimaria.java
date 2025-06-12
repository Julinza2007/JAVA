/*
 14. • Secuencia Fibonacci: Pide al usuario un número N. Genera y muestra los primeros N
términos de la secuencia de Fibonacci. (La secuencia comienza con 0 y 1, y cada término
subsiguiente es la suma de los dos anteriores: 0, 1, 1, 2, 3, 5, 8, ...).
*/

import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Secuencia Fibonacci\n");
		System.out.print("Ingrese la cantidad de terminos que desea mostrar de la secuencia Fibonacci: ");
		int N = sc.nextInt();
		
		sc.close();
		
		while(N < 1) { // Validacion de cantidad de términos que se muestran.
			System.out.println("Error, el termino debe ser mayor o igual a 1.\nIngrese de nuevo: ");
			N = sc.nextInt();
		}
		
		mostrarFibonacci(N); // Se llama a la funcion para calcular e imprimir la secuencia por consola.
			
	}
	
	public static void mostrarFibonacci(int N) {
		int a = 0; // Se inicializa el primer término de la secuencia Fibonacci
		int b = 1; // Se inicializa el segundo término.
		int i = 0;
		int suma = 0;
		
		
		while(i < N) { // Realiza N terminos de la secuencia.
			if(i + 1 != N) {
				System.out.print(a + ", ");
			}
			else {
				System.out.print(a + "...");
			}
			
			if((i + 1) % 10 == 0) { // Para mejor presentacion en consola, cada 10 elementos se hace un salto de linea.
				System.out.print("\n");
			}
			
			suma = a + b; // Se suman los dos anteriores terminos
			a = b; // el primer anterior término se inicializa con nuevo valor.
			b = suma; // el segundo anterior término se inicializa con el resultado de la suma de los dos terminos anteriores.
			
			i++;			
		}
	}

}