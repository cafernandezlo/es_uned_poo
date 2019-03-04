package patronDecorador;

public class ConChalecoAntibalas extends IncrementarHabilidades {
	public ConChalecoAntibalas (Soldado soldado, int incrementarDefensa) {
		super(soldado,0,incrementarDefensa);
	}
	
	@Override
	public String descripcion() {
		return descripcionSoldado() + ", con chaleco antibalas";
	}
}
