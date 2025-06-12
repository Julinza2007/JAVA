//24. Pensar y desarrollar un ejemplo donde se vea el uso del for-each y comentarlo
//pertinentemente

// Los Jugadores de futbol de cuarta division luego de ganar la liga, los titulares (11 jugadores) decidieron 
//hacer una vaquita entre ellos para invitar a 50 socios del club a comer junto a ellos en la rotiseria frente al club.
// La comida vale a todos por igual, $5000 por persona y se desea saber si alcanza la plata juntada por los jugadores para pagar
// a los 50 socios mas ellos la comida. En caso de que falte plata indicar cuanta. 
// Se otorga la lista que de plata que puso cada jugador:
// jugador1: $20000; jugador2: $25000; jugador3: $30000; jugador4: $15000; jugador5: $20000; jugador6: $50750;
// jugador7: $35000; jugador8: $20500; jugador9: $9900; jugador10: $18800; jugador11: $11000;


public class ClasePrimaria {

	public static void main(String[] args) {
		double montoNecesario = 61 * 5000; // se calcula y almacena en montoNecesario el monto necesario, 11 jugadores + 50 socios
										  // por $5000.
 		
		double[] vaquita = { // Se crea la lista de la recaudacion de los jugadores.
				20000,
				25000,
				30000,
				15000,
				20000,
				50750,
				35000,
				20500,
				9900,
				18800,
				11000
			};
		
		double totalRecaudado = 0; // Se inicializa variable en 0 para luego poder ser usada en el ForEach.
		
		for (double aporte: vaquita) { // en el ForEach de la vaquita se recorren los 11 aportes.
			totalRecaudado += aporte;  // y cada aporte se va sumando al totalrecaudado en pesos.
		}
		
		System.out.println("El total recaudado por los jugadores fue de: $" + totalRecaudado); // Se imprime el total recaudado.
		System.out.println("\nEl monto necesitado para invitar a todos es de: $" + montoNecesario); // Se imprime el monto necesario.
		
		if(totalRecaudado >= montoNecesario) { // Condicion caso de que alcanza el dinero.
			System.out.println("\nAlcanza para invitar a todos a la rotiseria."); // Se imprime mensaje de que alcanza el dinero.
		}
		else { // Sino, no alcanza.
			System.out.println("\nNo alcanza. Faltan $" + (montoNecesario - totalRecaudado)); // Se imprime mensaje de que no alcanza el dinero.
		}
	}

}
