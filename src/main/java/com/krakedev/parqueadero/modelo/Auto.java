package com.krakedev.parqueadero.modelo;

public class Auto extends Vehiculo {

	private int numeroPuertas;

	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auto(String placa, String propietario, int numeroPuertas) {
	    super(placa, propietario);
	    this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return "Auto [numeroPuertas=" + numeroPuertas + ", getPlaca()=" + getPlaca() + ", getPropietario()="
				+ getPropietario() + "]";
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public double calcularTarifa(int horasPermanencia) {
		// TODO Auto-generated method stub
		double total = horasPermanencia * 1.50;
		if (horasPermanencia > 4) {
		    total = total + 2.00;
		}
		return total;

	}

	

}
