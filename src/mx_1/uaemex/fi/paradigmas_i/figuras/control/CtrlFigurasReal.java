package mx.uaemex.fi.paradigmas_i.figuras.control;

import mx.uaemex.fi.paradigmas_i.figuras.modelo.Figura;

public class CtrlFigurasReal implements ControlFiguras {
	private Figura f;
	
	@Override
	public void setFigura(Figura f) {
		this.f = f;
	}

	@Override
	public double calculaPerimetro() {
		return f.perimetro();
	}

	@Override
	public double calculaArea() {
		return f.area();
	}
}
