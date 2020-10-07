package vehiculos;

public class Camioneta extends Vehiculo{
	private boolean volco;
	static int totalCamionetas = 0;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, 
			int peso, Fabricante fabricante, boolean volco) {
				super(placa, puertas, 90, nombre, precio, peso, "4x4", fabricante);
				this.volco = volco;
				totalCamionetas += 1;
			}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static int getTotalCamionetas() {
		return totalCamionetas;
	}

}
