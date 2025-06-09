/*2. Escribir por consola los números del 50 al 100 de la siguiente manera si es un numero primo
escribir primo, sino escribir sus divisores*/

public class ClasePrimaria {

	public static void main(String[] args) {		
		for(int num = 50; num <= 100; num++){
			boolean esPrimo = true; // Declaro valor booleano esPrimo, valor inicial verdadero.

			for(int i = 2; i <= num / 2; i++){
				if(num % i == 0){
					esPrimo = false; // esPrimo, valor como falso si detecta que el numero es compuesto.
					break;
				}
			}
			
			System.out.print(num + ": ");
			if(esPrimo){ // Si esPrimo es verdadero entonces imprime el aviso.
				System.out.println("Primo");
			} else { // Sino, imprime los divisores.
				System.out.print("Divisores: ");
				for(int i = 2; i <= num / 2; i++){
					if(num % i == 0){
						System.out.print(i + " "); // Siendo la variable i esos divisores.
					}
				}
				System.out.println();
			}
		}
	}
}
