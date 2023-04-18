package mx.uaemex.fi.paradigmas_i.figuras.vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;

public class VCuadradito extends JFrame {
	private JLabel etq1;
	private JSpinner campo;
	private JButton btn1;
	private JButton btn2;
	
	public VCuadradito() {
		super("Datos");
		etq1 = new JLabel("Lado: ");
		campo = new JSpinner();
		btn1 = new JButton("Enviar");
		btn2 = new JButton("Limpiar");
		
		JPanel panel = new JPanel(new GridLayout(2,2));
		
		panel.add(etq1);
		panel.add(campo);
		panel.add(btn1);
		panel.add(btn2);
		panel.setBorder(new EmptyBorder(10,10,10,10));
		
		this.add(panel);
	}
	
	public static void main(String arg[]) {
		VCuadradito v = new VCuadradito();
		v.setVisible(true);
	}
}
