package es.uned.poo.vehiculos;

public class Motocicleta extends Vehiculo {
	protected float longitudCadenaDistribucion;

	public Motocicleta(int numeroMatricula, String color, String marca, String modelo, int numeroMaxOcupantes,
			float cargaMaxima, float longitudCadenaDistribucion) {
		super(numeroMatricula, color, marca, modelo, numeroMaxOcupantes, cargaMaxima);
		this.longitudCadenaDistribucion = longitudCadenaDistribucion;
	}

}
