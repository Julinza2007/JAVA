/*3. Pedir números por pantalla hasta que alguno sea mayor a 100 y además sea un numero primo*/

import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		boolean esPrimo;
		int num;
		Scanner sc = new Scanner(System.in); // Crea el sc, que es el scanner.
		
		do {
			esPrimo = true;
			System.out.print("Ingrese un numero: > ");
			 num = sc.nextInt(); // Le dice al scanner que lea enteros.
			
			for(int i = 2; i <= num / 2; i++){
				if(num % i == 0){
					esPrimo = false;
					break;
				}
			}
			
			if(num <= 1) {
				esPrimo = false;
			}
			
			else if(esPrimo == false && num <= 100) {
				System.out.println("El numero " + num + " no es mayor a 100 y no es primo.");
			}
			else if(esPrimo == false && num > 100) {
				System.out.println("El numero " + num + " es mayor a 100 pero no es primo.");
			}
			else if(esPrimo == true && num <= 100) {
				System.out.println("El numero " + num + " es primo pero no mayor a 100.");
			}
			else if(esPrimo == true && num > 100) {
				System.out.println("\n\nFelicidades, el numero " + num + " es mayor a 100 y es primo!!");
			}
			
		}while(num <= 100 || !esPrimo); // Si alguna de estas condiciones (que son falsas) se dan, se vuelve a pedir un numero.
	}
}