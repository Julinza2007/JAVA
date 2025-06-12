/* 5. Tabla de Multiplicar: Solicita al usuario un número del 1 al 10. Genera y muestra por consola
la tabla de multiplicar de ese número del 1 al 10. */
import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int opc = 1;
		
		do {
			System.out.print("Ingrese un numero del 1 al 10 para generar su tabla de multiplicar del 1 al 10: > ");
		 	n = sc.nextInt();
		
		 	while(n < 1 || n > 10) { // Valido el numero para que se mantenga entre 1 y 10.
				System.out.print("Error, ingrese de nuevo: "); 
				n = sc.nextInt();
			}
				
			for(int i= 1; i <= 10; i++) { // Se genera la tabla de multiplicar.
				System.out.println(n + "x" + i + "=" + i*n);
			}
			
			System.out.println("\nSi desea seguir generando tablas con otros numeros ingrese 1, sino ingrese 0 para terminar con el programa.");
			System.out.print("> ");
			opc = sc.nextInt();
			while(opc != 0 && opc != 1) { // Validacion de si el usuario quiere continuar o no el programa.
				System.out.println("Error, ingrese de nuevo opcion:");
				System.out.print("> ");
				opc = sc.nextInt();
			}
			
			if(opc == 0) { // Mostrar mensaje de terminación del programa en caso de que el usuario ingrese 0.
				System.out.println("\nPrograma terminado...");
			}
			
			
		}while(opc == 1); // Si opcion es 1 se siguen generando tablas de multiplicar.
		sc.close();
	}

}