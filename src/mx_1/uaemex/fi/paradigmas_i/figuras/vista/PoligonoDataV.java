package mx.uaemex.fi.paradigmas_i.figuras.vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;

public class PoligonoDataV extends JFrame implements ActionListener {
	private JSpinner lado;
	private JSpinner apotema;
	private int numeroLados;
	
	public PoligonoDataV() {
		super("Datos Poligono");
		JButton btn;
		JPanel panel = new JPanel(new GridLayout(3,2));
		panel.setBorder(new EmptyBorder(10,10,10,10));
		
		JLabel etq = new JLabel("Lado: ");
		this.lado = new JSpinner();
		panel.add(etq);
		panel.add(lado);
		
		etq = new JLabel("Apotema: ");
		this.apotema = new JSpinner();
		panel.add(etq);
		panel.add(apotema);
		
		btn = new JButton("Enviar");
		btn.setActionCommand("Enviar");
		btn.addActionListener(this);
		panel.add(btn);
		
		btn = new JButton("Limpiar");
		btn.setActionCommand("Limpiar");
		btn.addActionListener(this);
		panel.add(btn);
		
		this.getContentPane().add(BorderLayout.CENTER,panel);
		this.pack();
		this.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando;
		
		comando = e.getActionCommand();
		
		switch(comando) {
		case "Enviar":
			break;
		case "Limpiar":
			this.lado.setValue(Integer.parseInt("0"));
			this.apotema.setValue(Integer.parseInt("0"));
			break;
		}
		
	}
}
