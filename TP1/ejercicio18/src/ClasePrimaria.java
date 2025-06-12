/*18. • Patrón de Asteriscos: Pide al usuario un número N. Genera y muestra un patrón de
asteriscos en forma de triángulo (o pirámide) de N filas. Por ejemplo, si N es 4:
*
**
***
****
*/
import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		System.out.println("Triangulo de asteriscos.\n");
		
		Scanner sc = new Scanner(System.in);		
		
		int N = 0;
		System.out.print("Ingrese la cantidad de filas que va a tener el triangulo de asteriscos: ");
		N = sc.nextInt();
		
		diagramarTriangulo(N); // Funcion que diagrama el triangulo.
	}
	
	public static void diagramarTriangulo(int N) {
		int i = 1; // i es la cantidad de filas en el triangulo.
		int j = 0; // j es la cantidad de columnas que tiene una fila.
		
		while(i <= N) { // Impresión termina cuando i sea mayor a N.
			while(j < i) { // termina de imprimir las columnas cuando la cantidad de columnas sea igual a la cantidad de filas.
				System.out.print('*');
				j++;
			}
			j=0; // Se resetea el valor de las columnas a 0.
			System.out.println(); // Salto de linea para que se note el triangulo y el cambio de fila.
			i++;
		}
	}

}
