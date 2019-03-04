package patronDecorador;

public class ConEquipoAccionInmediata extends IncrementarHabilidades {
	public ConEquipoAccionInmediata (Soldado soldado, int incrementarAtaque, int incrementarDefensa) {
		super(soldado,incrementarAtaque,incrementarDefensa);
	}
	
	@Override
	public String descripcion() {
		return descripcionSoldado() + ", con ametralladora de asalto y chaleco antibalas";
	}
}
