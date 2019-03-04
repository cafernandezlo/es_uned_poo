package patronDecorador;

public abstract class IncrementarHabilidades extends Soldado {
	private Soldado soldado;
	
	public IncrementarHabilidades (Soldado soldado, int incrementaAtaque, int incrementaDefensa) {
		super(incrementaAtaque, incrementaDefensa);
		this.soldado = soldado;
	}
	@Override
	public int getAtaque() {
		return soldado.getAtaque() + super.getAtaque();
	}
	
	@Override
	public int getDefensa() {
		return soldado.getDefensa() + super.getDefensa();
	}
	
	public String descripcionSoldado() {
		return soldado.descripcion();
	}
}
