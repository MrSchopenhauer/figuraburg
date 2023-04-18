package mx.uaemex.fi.paradigmas_i.figuras.modelo;

import mx.uaemex.fi.paradigmas_i.figuras.error.ValorNoValidoException;

public class PoligonoRegular extends FiguraDeLadosIguales {
	private double apotema;
	
	public PoligonoRegular() throws ValorNoValidoException {
		super(5);
	}
	
	public PoligonoRegular(double l, int nL) throws ValorNoValidoException {
		super(nL);
		this.setLado(l);
	}
	
	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	@Override
	public double area() {
		return this.perimetro()*this.apotema/2;
	}
}
