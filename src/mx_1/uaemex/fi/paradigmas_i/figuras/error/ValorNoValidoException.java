package mx.uaemex.fi.paradigmas_i.figuras.error;

public class ValorNoValidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public ValorNoValidoException() {
		super();
	}

	public ValorNoValidoException(String message) {
		super(message);
	}
}
