package mx.uaemex.fi.paradigmas_i.figuras.control;

import mx.uaemex.fi.paradigmas_i.figuras.modelo.Figura;

public interface ControlFiguras {
	public void setFigura(Figura f);
	public double calculaPerimetro();
	public double calculaArea();
}
