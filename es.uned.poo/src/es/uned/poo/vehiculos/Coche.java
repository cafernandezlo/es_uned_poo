package es.uned.poo.vehiculos;

public class Coche extends Vehiculo {
	
	protected boolean remolque;
	protected int ultimaITV;
	
	public Coche(int numeroMatricula, String color, String marca, String modelo, int numeroMaxOcupantes,
			float cargaMaxima, boolean remolque, int ultimaITV) {
		super(numeroMatricula, color, marca, modelo, numeroMaxOcupantes, cargaMaxima);
		this.remolque = remolque;
		this.ultimaITV = ultimaITV;
	}
	/**
	 * @return the remolque
	 */
	public boolean isRemolque() {
		return remolque;
	}
	/**
	 * @param remolque the remolque to set
	 */
	public void setRemolque(boolean remolque) {
		this.remolque = remolque;
	}
	/**
	 * @return the ultimaITV
	 */
	public int getUltimaITV() {
		return ultimaITV;
	}
	/**
	 * @param ultimaITV the ultimaITV to set
	 */
	public void setUltimaITV(int ultimaITV) {
		this.ultimaITV = ultimaITV;
	}
}
