package mx.uaemex.fi.paradigmas_i.figuras.principal;

import javax.swing.JFrame;

import mx.uaemex.fi.paradigmas_i.figuras.control.ControlFiguras;
import mx.uaemex.fi.paradigmas_i.figuras.control.CtrlFigurasReal;
import mx.uaemex.fi.paradigmas_i.figuras.error.ValorNoValidoException;
import mx.uaemex.fi.paradigmas_i.figuras.modelo.Cuadrado;
import mx.uaemex.fi.paradigmas_i.figuras.modelo.Figura;
import mx.uaemex.fi.paradigmas_i.figuras.modelo.PoligonoRegular;
import mx.uaemex.fi.paradigmas_i.figuras.vista.CirculoDataV;
import mx.uaemex.fi.paradigmas_i.figuras.vista.CuadradoDataV;
import mx.uaemex.fi.paradigmas_i.figuras.vista.PoligonoDataV;
import mx.uaemex.fi.paradigmas_i.figuras.vista.RectanguloDataV;
import mx.uaemex.fi.paradigmas_i.figuras.vista.VentanaCalculos;

public class Principal {

	public static void main(String[] args) {
		VentanaCalculos vCalc;
		/*PoligonoDataV v1 = new PoligonoDataV();
		RectanguloDataV v2 = new RectanguloDataV();
		CirculoDataV v3 = new CirculoDataV();*/
		CuadradoDataV v4 = new CuadradoDataV();
		ControlFiguras control = new CtrlFigurasReal();
		v4.setCtrl(control);
		
		vCalc = new VentanaCalculos();
		vCalc.setBounds(10, 10, 200, 100);
		vCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vCalc.setVisible(true);
		vCalc.setCtrl(control);
		/*v1.setVisible(true);
		v2.setVisible(true);
		v3.setVisible(true);*/
		v4.setVisible(true);
	}
}
