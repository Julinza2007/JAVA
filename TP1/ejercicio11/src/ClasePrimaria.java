//11. Pide al usuario un año. Determina si es un año bisiesto y muestra un mensaje indicándolo.
//(Un año es bisiesto si es divisible por 4, excepto si es divisible por 100 pero no por 400).

import java.util.Scanner;
public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora de anio bisiesto.\n");
		System.out.print("Ingrese un anio para saber si es bisiesto: ");
		int anio = sc.nextInt();
		sc.close();
		if(anio % 4 == 0) { //Si es divisible por 4 y no por 100 el anio es bisiesto.
			if(anio % 100 == 0) { //Si es divisible por 100 y no por 400 no es bisiesto.
				if(anio % 400 == 0) {
					System.out.println(anio + " Es un anio bisiesto.");
				}
				else {
					System.out.println(anio + " No es un anio bisiesto.");
				}
			}
			else {
				System.out.println(anio + " Es un anio bisiesto.");
			}
		}
		else {
			System.out.println(anio +" No es un anio bisiesto.");
		}
	}

}