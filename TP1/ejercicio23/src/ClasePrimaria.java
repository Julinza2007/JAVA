/*23. Crea un arreglo (array) de 5 cadenas de texto (por ejemplo, nombres de ciudades). Pide al
usuario que ingrese una cadena de texto para buscar. Utiliza un bucle for-each para
determinar si la cadena ingresada se encuentra en el arreglo. Muestra un mensaje indicando si
se encontró o no.
*/

import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String []ciudades = {"Buenos Aires", "Madrid", "Barcelona", "Milan", "New York"}; // Creo la lista de ciudades.
		
		System.out.println("Buscar ciudades\n\n");
		
		do {
			System.out.print("Ingrese una ciudad para buscarla: ");
			String busqueda = sc.nextLine(); // Cargo la consulta.
			
			if(buscarCiudad(busqueda, ciudades)) { // Si buscarCiudad devuelve True significa que encontró la ciudad.
				System.out.println("Se ha encontrado la ciudad " + busqueda + " en la lista!!");
			}
			else {
				System.out.println("No se ha encontrado la ciudad " + busqueda + " en la lista.");
			}
			
		}while(deseaSeguir(sc)); // Condicion de si desea seguir ejecutando el programa.
		
		System.out.println("\nTerminando programa de busqueda de ciudades...");
		
		
		sc.close();
	}
	
	
	public static boolean buscarCiudad(String busq, String []lista) {
		for(String ciudad: lista) { // ForEach que extrae cada ciudad como elementos de tipo string individuales.
			if(ciudad.equalsIgnoreCase(busq)) { // En caso de que la ciudad sea igual (sin importar Mayusculas, minusculas)
				return true; 					// Devuelve verdadero.
			}
		}
		
		return false; // Sino devuelve falso.
	} 
	
	public static boolean deseaSeguir(Scanner sc) { // Funcion booleana que determina si se continua o no con el programa.
		System.out.print("\nDesea continuar realizando busqueda de ciudades? 1. Si || 0. No\n> ");
		int seguir = sc.nextInt();
		sc.nextLine();
		
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