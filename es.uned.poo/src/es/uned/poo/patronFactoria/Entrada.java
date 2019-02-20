package es.uned.poo.patronFactoria;

public abstract class Entrada {
	private int id;
	private double coste;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the coste
	 */
	public double getCoste() {
		return coste;
	}
	/**
	 * @param coste the coste to set
	 */
	public void setCoste(double coste) {
		this.coste = coste;
	}
	
	public abstract double getCosteEntrada();

}
