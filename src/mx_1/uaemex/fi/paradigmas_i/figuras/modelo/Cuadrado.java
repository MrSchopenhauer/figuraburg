package mx.uaemex.fi.paradigmas_i.figuras.modelo;

import mx.uaemex.fi.paradigmas_i.figuras.error.ValorNoValidoException;

public class Cuadrado extends FiguraDeLadosIguales {

	public Cuadrado() throws ValorNoValidoException{
		super(4);
		this.lado = 0;
	}
	
	public Cuadrado(double l) throws ValorNoValidoException{
		this();
		this.lado = l;
	}
	
	@Override
	public double area() {
		return this.lado*this.lado;
	}
}
