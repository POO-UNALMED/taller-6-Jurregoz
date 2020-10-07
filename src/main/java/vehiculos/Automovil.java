package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	static int totalAutoMovil = 0;

	
	public Automovil(String placa, String nombre, int precio, 
	int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		totalAutoMovil = 0;
	}


	public int getPuestos() {
		return puestos;
	}


	public static int getTotalAutoMovil() {
		return totalAutoMovil;
	}


	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
}
	