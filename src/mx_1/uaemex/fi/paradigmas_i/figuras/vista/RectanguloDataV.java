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

public class RectanguloDataV extends JFrame implements ActionListener {
	private JSpinner altura;
	private JSpinner base;
	
	public RectanguloDataV() {
		super("Datos Rectangulo");
		JButton btn;
		JPanel panel = new JPanel(new GridLayout(3,2));
		panel.setBorder(new EmptyBorder(10,10,10,10));
		
		JLabel etq = new JLabel("Altura: ");
		this.altura = new JSpinner();
		panel.add(etq);
		panel.add(altura);
		
		etq = new JLabel("Base: ");
		this.base = new JSpinner();
		panel.add(etq);
		panel.add(base);
		
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
			this.altura.setValue(Integer.parseInt("0"));
			this.base.setValue(Integer.parseInt("0"));
			break;
		}
		
	}
}
