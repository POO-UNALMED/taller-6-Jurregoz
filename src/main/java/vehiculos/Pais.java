package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Pais {
	private String nombre;
	static private ArrayList<Pais> paises = new ArrayList<Pais>();
	private int totalUnidades; 
	
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addUnidad() {
		totalUnidades ++;
	}
	
	static public Pais paisMasVendedor() {
		Pais moda = null;
		if(paises.size()>0) {
			moda = paises.get(0);
			for(int i = 1; i < paises.size(); i++) {
				if(Collections.frequency(paises, paises.get(i)) > Collections.frequency(paises, moda)) {
					moda = paises.get(i);
				}
			}
		}
		return moda;
	}
	
}
