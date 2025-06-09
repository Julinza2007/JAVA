/* 5. Tabla de Multiplicar: Solicita al usuario un número del 1 al 10. Genera y muestra por consola
la tabla de multiplicar de ese número del 1 al 10. */
import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;

		System.out.print("Ingrese un numero del 1 al 10 para generar su tabla de multiplicar del 1 al 10: > ");
		 n = sc.nextInt();
		
		while(n < 1 || n > 10) {
			System.out.print("Error, ingrese de nuevo: ");
			n = sc.nextInt();
		}
		sc.close();
		
		
		for(int i= 1; i <= 10; i++) {
			System.out.println(n + "x" + i + "=" + i*n);
		}
		
	}

}
