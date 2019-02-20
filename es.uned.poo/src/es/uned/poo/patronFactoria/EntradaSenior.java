package es.uned.poo.patronFactoria;

public class EntradaSenior extends Entrada {

	@Override
	public double getCosteEntrada() {
		return getCoste()*0.90;
	}

}
