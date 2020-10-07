package vehiculos;

import java.util.*;

public class Fabricante {
	private String nombre;
	private Pais pais;
	
	static private ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	public static ArrayList<Fabricante> getFabricantes() {
		return fabricantes;
	}
	

	static public Fabricante fabricaMayorVentas() {
		Fabricante moda = fabricantes.get(0);
		for(int i = 1; i < fabricantes.size(); i++) {
			if(Collections.frequency(fabricantes, fabricantes.get(i)) > Collections.frequency(fabricantes, moda)) {
				moda = fabricantes.get(i);
			}
		}
		
		return moda;
	}
	
}
