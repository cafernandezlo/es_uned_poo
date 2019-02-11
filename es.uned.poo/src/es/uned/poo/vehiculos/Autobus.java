package es.uned.poo.vehiculos;

public class Autobus extends Vehiculo {
	
	protected int numeroEjes;
	protected boolean tieneAseo;
	protected int anhoLicencia;
	
	public Autobus(int numeroMatricula, String color, String marca, String modelo, int numeroMaxOcupantes,
			float cargaMaxima, int numeroEjes, boolean tieneAseo, int anhoLicencia) {
		super(numeroMatricula, color, marca, modelo, numeroMaxOcupantes, cargaMaxima);
		this.numeroEjes = numeroEjes;
		this.tieneAseo = tieneAseo;
		this.anhoLicencia = anhoLicencia;
	}
	/**
	 * @return the numeroEjes
	 */
	public int getNumeroEjes() {
		return numeroEjes;
	}
	/**
	 * @param numeroEjes the numeroEjes to set
	 */
	public void setNumeroEjes(int numeroEjes) {
		this.numeroEjes = numeroEjes;
	}
	/**
	 * @return the tieneAseo
	 */
	public boolean isTieneAseo() {
		return tieneAseo;
	}
	/**
	 * @param tieneAseo the tieneAseo to set
	 */
	public void setTieneAseo(boolean tieneAseo) {
		this.tieneAseo = tieneAseo;
	}
	/**
	 * @return the anhoLicencia
	 */
	public int getAnhoLicencia() {
		return anhoLicencia;
	}
	/**
	 * @param anhoLicencia the anhoLicencia to set
	 */
	public void setAnhoLicencia(int anhoLicencia) {
		this.anhoLicencia = anhoLicencia;
	}
}
