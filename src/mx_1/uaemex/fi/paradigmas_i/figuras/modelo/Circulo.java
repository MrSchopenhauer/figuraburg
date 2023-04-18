package mx.uaemex.fi.paradigmas_i.figuras.modelo;

import mx.uaemex.fi.paradigmas_i.figuras.error.ValorNoValidoException;

public class Circulo implements Figura {
	private double radio;
	
	public Circulo() {
		this.radio = 0.0;
	}
	
	public Circulo(double r) throws ValorNoValidoException {
		this.setRadio(r);
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double r) throws ValorNoValidoException {
		if(r < 0) {
			throw new ValorNoValidoException();
		}
		this.radio = r;
	}

	@Override
	public double perimetro() {
		return this.radio*2*Math.PI;
	}

	@Override
	public double area() {
		return Math.pow(this.radio, 2)*Math.PI;
	}
}
