package patronDecorador;

public abstract class Soldado {
	private int ataque;
	private int defensa;
	
	public Soldado(int ataque, int defensa) {
		this.ataque = ataque;
		this.defensa = defensa;
	}
	
	public int getAtaque() {
		return ataque;
	}
	
	public int getDefensa() {
		return defensa;
	}
	
	public abstract String descripcion();
}
