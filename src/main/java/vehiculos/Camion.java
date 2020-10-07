package vehiculos;

import estandar.Fabricante;

public class Camion extends Vehiculo {
	private int ejes;
	static int totalCamiones = 0;

	
	public Camion(String placa, String nombre, int precio, 
			int peso, Fabricante fabricante, int ejes) {
				super(placa, 2, 80, nombre, precio, peso, "4x2", fabricante);
				this.ejes = ejes;
				totalCamiones += 1;
			}

	public int getEjes() {
		return ejes;
	}

	public static int getTotalCamiones() {
		return totalCamiones;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}
