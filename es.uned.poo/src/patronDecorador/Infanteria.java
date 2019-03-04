package patronDecorador;

public class Infanteria extends Soldado {
	public Infanteria (int ataque, int defensa) {
		super(ataque,defensa);
	}
	
	@Override
	public String descripcion() {
		return "Soldado de Infanteria";
	}
}
