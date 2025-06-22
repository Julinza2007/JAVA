package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField mensaje;
	
	private int contador = 0;
	
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		mensaje = new JTextField();
		mensaje.setText("La cantidad de clicks es: 0");
		mensaje.setEditable(false);
		mensaje.setBounds(128, 80, 163, 20);
		contentPane.add(mensaje);
		mensaje.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Contador");
		lblNewLabel.setBounds(189, 55, 65, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnContar = new JButton("Dale");
		btnContar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador++;
				mensaje.setText("La cantidad de clicks es: " + contador);
				
			}
		});
		btnContar.setBounds(165, 111, 89, 23);
		contentPane.add(btnContar);

	}
}
