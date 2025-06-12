/*15. • Cajero Automático Básico: Simula un cajero automático muy simple. El usuario inicia con
un saldo inicial (por ejemplo, $1000). Permítele realizar operaciones de depósito, retiro y
consulta de saldo. Valida que no se pueda retirar más dinero del que hay disponible.
*/

import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		double saldo = 1000; // Saldo base de $1000
		System.out.println("Cajero automatico\n");
		do {
			opc = ingresarOpc(opc, sc); // Se ingresa opcion para elegir la operacion a realizar en el cajero.
			saldo = menuOpc(opc, saldo, sc); // Se ejecuta la opcion elegida por el usuario.
		}while(deseaSeguir(sc)); // Condicion de si desea seguir ejecutando el programa.
		sc.close();
		System.out.println("\n\nPrograma terminado...");
	}
	
	public static int ingresarOpc(int opc, Scanner sc) {
		System.out.println("Ingrese opcion 1. Si desea depositar dinero.");
		System.out.println("Ingrese opcion 2. Si desea consultar su saldo.");
		System.out.println("Ingrese opcion 3. Si desea retirar dinero.");
		System.out.print("\nIngrese opcion por favor:\n> ");
		
		opc = sc.nextInt();
		while(opc < 1 || opc > 3) { // Validar opcion
			System.out.print("Error, opcion invalida. Ingrese de nuevo: \n> ");
			opc = sc.nextInt();
		}
		
		return opc;
	}
	
	public static double menuOpc(int opc, double saldo, Scanner sc) {
		
		switch(opc) {
		
			case 1:
				saldo = depositar(saldo, sc); // Opcion de depositar dinero.
			break;
			
			case 2:
				System.out.println("Su saldo es de: $" + saldo); // Opcion de consulta de saldo.
			break;
			
			case 3:
				saldo = retirar(saldo, sc); // Opcion de retirar dinero.
			break;
		}
		
		return saldo;
	}
	
	public static double depositar(double saldo, Scanner sc) {
		double depositado = 0.00;
		
		System.out.print("\nIngrese la cantidad de dinero a depositar: $");
		depositado = sc.nextDouble();
		
		saldo += depositado; // Se almacena y se suma en el saldo la cantidad depositada.
		System.out.println("\nDinero depositado exitosamente!");
		
		return saldo;		
	}
	
	public static double retirar(double saldo, Scanner sc) {
		double retirado = 0.00;
		
		System.out.print("\nIngrese la cantidad de dinero a retirar: $");
		retirado = sc.nextDouble();
		while(retirado > saldo) { // Validacion de retiración de saldo.
			System.out.print("Podes retirar hasta $" + saldo + "\nIngrese de nuevo el valor  a retirar: $");
			retirado = sc.nextDouble();
		}
		
		saldo -= retirado; // Se almacena y se resta en el saldo la cantidad retirada. 
		System.out.println("\nDinero retirado exitosamente!.");
		
		return saldo;
	}
	
	public static boolean deseaSeguir(Scanner sc) { // Funcion booleana que determina si se continua o no con el programa.
		System.out.print("\nDesea continuar realizando operaciones con el cajero automatico? 1. Si || 0. No\n> ");
		int seguir = sc.nextInt();
		
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