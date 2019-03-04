package patronDecorador;

public class ConAmetralladoraPesada extends IncrementarHabilidades {
	public ConAmetralladoraPesada (Soldado soldado, int incrementarAtaque) {
		super(soldado,0,incrementarAtaque);
	}
	
	@Override
	public String descripcion() {
		return descripcionSoldado() + ", con ametralladora pesada";
	}
}
