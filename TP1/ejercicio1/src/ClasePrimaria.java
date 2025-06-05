public class ClasePrimaria {

	public static void main(String[] args) {
		for(int i=1; i <= 100; i++) {
			if(i % 2 == 0){ // Condicion de que el resto dividido
				System.out.println("Es par");
			}
			else{
				System.out.println(i);
			}
		}
	}

}