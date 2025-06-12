/*16. • Clasificación de un Triángulo: Pide al usuario las longitudes de los tres lados de un
triángulo. Determina y muestra si el triángulo es equilátero (todos los lados iguales), isósceles
(dos lados iguales) o escaleno (todos los lados diferentes).
*/

import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Clasificacion de triángulos: Eequilatero, Isosceles, Escaleno:\n");
		System.out.print("Del triangulo:\n\nIngrese la longitud del primer lado: ");
		double lado1 = sc.nextDouble();
		System.out.print("\nIngrese la longitud del segundo lado: ");
		double lado2 = sc.nextDouble();
		System.out.print("\nIngrese la longitud del tercer lado: ");
		double lado3 = sc.nextDouble();
		sc.close();
		
		clasificarTriangulo(lado1, lado2, lado3); // Implementa funcion para clasificar el triangulo segun la longitud de sus lados.
	}
	
	public static void clasificarTriangulo(double lado1, double lado2, double lado3) {
		if(lado1 == lado2 && lado1 == lado3) {
			System.out.println("\nEs un triangulo equilatero.");
		}
		else if((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2) || (lado2 == lado3) && lado2 != lado1){
			System.out.println("\nEs un triangulo isosceles.");
		}
		else{
			System.out.println("\nEs un triangulo escaleno.");
		}
	}
}