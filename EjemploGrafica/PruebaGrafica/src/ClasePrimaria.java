import GUI.Ventana;

public class ClasePrimaria {

	public static void main(String[] args) {
		presentarVentana();
	}
	
	public static void presentarVentana() {
		Ventana miVentana = new Ventana();
		miVentana.setVisible(true);
	}

}
