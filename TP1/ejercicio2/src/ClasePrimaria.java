public class ClasePrimaria {

	public static void main(String[] args) {		
		for(int num=50; num <= 100; num++){
			boolean esPrimo= true;
			
			if(num % 2 == 0) {
				esPrimo = false;
			}
			else {
				for(int i=3; i < Math.sqrt(num); i += 2) {
					if(num % i == 0) {
						esPrimo = false;
						System.out.println("Divisores: " + i);
						break;
					}
				}
			}
			
			
			if(esPrimo){
				System.out.println("Primo");
			}
		}
	}
}
