package vehiculos;

import estandar.Fabricante;

public class Automovil extends Vehiculo {
	private int puestos;
	
	
	public Automovil(String placa, String nombre, int precio, 
	int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
	}


	public int getPuestos() {
		return puestos;
	}


	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
}
	