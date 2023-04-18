/**
 * 
 */
package mx.uaemex.fi.paradigmas_i.figuras.vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mx.uaemex.fi.paradigmas_i.figuras.control.ControlFiguras;

/**
 * @author Francisco Ignacio Ch&aacute;vez Casta&ntilde;eda
 *
 */
public class VentanaCalculos extends JFrame implements ActionListener{
	private JComboBox combo;
	public static final String AREA = "Area";
	public static final String PERI = "Perimetro";
	private ControlFiguras ctrl;
	
	
	public void setCtrl(ControlFiguras ctrl) {
		this.ctrl = ctrl;
	}
	
	public VentanaCalculos() {
		super("Ventana Axel Calculos");
		JPanel panelBotones, panelCentral;
		JButton boton;
		
		panelCentral = new JPanel(new GridLayout(1,2));
		panelCentral.setBorder(new EmptyBorder(10,10,10,10));
		JLabel etq = new JLabel("Figuras: ");
		panelCentral.add(etq);
		
		this.combo = new JComboBox();
		this.combo.addItem("Cuadrado");
		this.combo.addItem("Rectangulo");
		this.combo.addItem("Pentagono");
		this.combo.addItem("Hexagono");
		this.combo.addItem("Heptagono");
		this.combo.addItem("Circulo");
		this.combo.addItem("Triangulo");
		panelCentral.add(combo);
		
		panelBotones = new JPanel(new GridLayout(1,2));
		panelBotones.setBorder(new EmptyBorder(10,10,10,10));
		
		boton = new JButton(VentanaCalculos.PERI);
		boton.setActionCommand(VentanaCalculos.PERI);
		boton.addActionListener(this);
		panelBotones.add(boton);
		
		boton = new JButton(VentanaCalculos.AREA);
		boton.setActionCommand(VentanaCalculos.AREA);
		boton.addActionListener(this);
		panelBotones.add(boton);
		
		//Al panel de la ventana
		this.getContentPane().add(BorderLayout.SOUTH,panelBotones);
		this.getContentPane().add(BorderLayout.CENTER,panelCentral);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double salida;
		String comando = e.getActionCommand();
		
		switch(comando) {
			case VentanaCalculos.PERI:
				salida = this.ctrl.calculaPerimetro();
				JOptionPane.showMessageDialog(this, "Perimetro: "+salida);
				break;
			case VentanaCalculos.AREA:
				salida = this.ctrl.calculaArea();
				JOptionPane.showMessageDialog(this, "Area: "+salida);
				break;
			default:
				JOptionPane.showMessageDialog(this,"Comando no reconocido");
				break;
		}
	}
}
