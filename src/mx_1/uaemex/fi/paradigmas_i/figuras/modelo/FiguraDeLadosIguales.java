package mx.uaemex.fi.paradigmas_i.figuras.modelo;

import mx.uaemex.fi.paradigmas_i.figuras.error.ValorNoValidoException;

public abstract class FiguraDeLadosIguales implements Figura {
	protected double lado;
	protected int numeroDeLados;
	
	public FiguraDeLadosIguales(int nL) throws ValorNoValidoException {
		this.setNumeroDeLados(nL);
	}
	
	@Override
	public double perimetro() {
		return this.lado*this.numeroDeLados;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) throws ValorNoValidoException {
		if(lado < 0) {
			throw new ValorNoValidoException("no se pueden definir lados negativos");
		}
		this.lado = lado;
	}

	public int getNumeroDeLados() {
		return numeroDeLados;
	}

	public void setNumeroDeLados(int numeroDeLados) throws ValorNoValidoException{
		if(numeroDeLados < 3) {
			throw new ValorNoValidoException("No podemos tener figuras con menos de 3 lados iguales");
		}
		this.numeroDeLados = numeroDeLados;
	}
	
}
