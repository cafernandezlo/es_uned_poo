package patronDecorador;

public class FuerzasEspeciales extends Soldado {
	public FuerzasEspeciales(int ataque, int defensa) {
		super(ataque, defensa);
	}
	
	@Override
	public String descripcion() {
		return "Fuerzas especiales";
	}
}
