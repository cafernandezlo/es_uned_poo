package es.uned.poo.patronFactoria;

public class FactoriaEntradas {
	public static Entrada getEntrada(String tipoEntrada) {
		if(tipoEntrada.equals("senior")) {
			return new EntradaSenior();
		}else {
			return new EntradaReducida();
		}
	}

}
