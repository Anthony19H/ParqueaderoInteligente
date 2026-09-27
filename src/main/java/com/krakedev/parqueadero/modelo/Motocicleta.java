package com.krakedev.parqueadero.modelo;

public class Motocicleta extends Vehiculo {

	private int cilindraje;

	public Motocicleta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motocicleta(String placa, String propietario, int cilindraje) {
	    super(placa, propietario);
	    this.cilindraje = cilindraje;
	}
	

	@Override
	public String toString() {
		return "Motocicleta [cilindraje=" + cilindraje + ", getPlaca()=" + getPlaca() + ", getPropietario()="
				+ getPropietario() + "]";
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	@Override
	public double calcularTarifa(int horasPermanencia) {
		
	    double total;
	    if (cilindraje > 250) {
	        total = horasPermanencia * 1.00;
	    } else {
	        total = horasPermanencia * 0.75;
	    }
	    return total;
	}

	
}
