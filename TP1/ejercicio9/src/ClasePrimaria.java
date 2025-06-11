//9. Pide al usuario que ingrese tres números enteros. Determina y muestra cuál de los tres es el
//mayor.

import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese tres numeros enteros para determinar cual es mayor.\n");
		
		System.out.print("Ingrese el primer numero: ");
		int num1 = sc.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		int num2 = sc.nextInt();
		System.out.print("Ingrese el tercer numero: ");
		int num3 = sc.nextInt();
		int mayor = 0;
		
		sc.close();
		
		if(num1 > num2) {
			mayor = num1;
		}
		else if(num1 == num2) {
			mayor = num1;
		}
		else if(num1 < num2){
			mayor = num2;
		}
		
		if(num3 > mayor) {
			System.out.println("El numero mayor de esos 3 es: " + num3);
		}
		else if(num3 == mayor) {
			System.out.println("Todos los numeros son iguales.");
		}
		else {
			System.out.println("El numero mayor de esos 3 es: " + mayor);
		}		
	}
}
