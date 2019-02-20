package es.uned.poo.patronFactoria;

public class EntradaReducida extends Entrada {

	@Override
	public double getCosteEntrada() {
		return getCoste()*0.50;
	}

}
