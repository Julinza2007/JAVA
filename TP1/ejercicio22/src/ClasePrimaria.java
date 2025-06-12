/*22. Declara un arreglo de tipo double para almacenar 5 calificaciones. Pide al usuario que ingrese
estas calificaciones. Utiliza un bucle for-each para calcular el promedio de las calificaciones
y luego muestra el resultado.
*/

import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 5; // longitud de la lista de calificaciones.
		double []calificaciones = cargarCalificaciones(N, sc); // cargo calificaciones en la lista. 
		sc.close();
		
		double promedio = calcularPromedio(calificaciones); // cargo el promedio para luego mostrarlo por consola.
		
		System.out.println("\nEl promedio de la nota de todas las calificaciones es: " + promedio);
	}
	
	public static double[] cargarCalificaciones(int N, Scanner sc) {
		double []array = new double[N]; // Declaro un array de tipo double de longitud N o sea 5.
		
		for(int i = 0; i < N; i++) { // For que carga cada nota en los indices del array.
			if(i!= 0) {
				System.out.println("");
			}
			System.out.print("Ingrese la calificacion " + (i + 1) + ": ");
			array[i] = sc.nextDouble(); // Se carga una nota en un indice del array o lista de calificaciones.
			
			while(array[i] < 0 || array[i] > 10) { // Validacion de la nota.
				System.out.print("\nError de rango de calificaciones. Por favor ingrese de nuevo:\nCalificacion " + (i + 1) + ": ");
				array[i] = sc.nextDouble();
			}
		}
		
		return array; // Devuelve el array ya cargado con las notas.
	}
	
	public static double calcularPromedio(double []array) {
		double suma = 0;
		for(double calific: array) { // ForEach que recorre el array de las notas, correspondiendo a cada elemento individual calif.
			suma += calific; // Se suman todas las calificaciones, o sea todos los valores de los indices de la lista.
		}
		double promedio = suma / array.length; // Se calcula el promedio, dividiendo la suma por la cantidad de elementos de la lista de calificaciones.
	
		return promedio;
	}

}