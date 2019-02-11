package es.uned.poo.vehiculos;

public class Vehiculo {
	
	protected int numeroMatricula;
	protected String color;
	protected String marca;
	protected String modelo;
	protected int numeroMaxOcupantes;
	protected float cargaMaxima;
	
	public Vehiculo(int numeroMatricula, String color, String marca, String modelo, int numeroMaxOcupantes,
			float cargaMaxima) {
		super();
		this.numeroMatricula = numeroMatricula;
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.numeroMaxOcupantes = numeroMaxOcupantes;
		this.cargaMaxima = cargaMaxima;
	}
	
	/**
	 * @return the numeroMatricula
	 */
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	/**
	 * @param numeroMatricula the numeroMatricula to set
	 */
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the numeroMaxOcupantes
	 */
	public int getNumeroMaxOcupantes() {
		return numeroMaxOcupantes;
	}
	/**
	 * @param numeroMaxOcupantes the numeroMaxOcupantes to set
	 */
	public void setNumeroMaxOcupantes(int numeroMaxOcupantes) {
		this.numeroMaxOcupantes = numeroMaxOcupantes;
	}
	/**
	 * @return the cargaMaxima
	 */
	public float getCargaMaxima() {
		return cargaMaxima;
	}
	/**
	 * @param cargaMaxima the cargaMaxima to set
	 */
	public void setCargaMaxima(float cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	

}
