package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	private static ArrayList<Pais> paises = new ArrayList<>();
	private String nombre;
	private int cantidadpais;
	
	public Pais(String pais) {
		this.nombre=pais;
		paises.add(this);
		this.cantidadpais++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Pais> getPaises() {
		return paises;
	}

	public void setPaises(ArrayList<Pais> paises) {
		this.paises = paises;
	}

	public int getCantidadpais() {
		return cantidadpais;
	}

	public void setCantidadpais(int cantidadpais) {
		this.cantidadpais = cantidadpais;
	}
	 public void nuevoCarro() {
		 cantidadpais++;
	 }
	 public static Pais paisMasVendedor() {
		 Pais inicial=paises.get(0);
		 
			for (int i = 0; i < paises.size(); i++) {
				if (paises.get(i).cantidadpais>inicial.cantidadpais) {
					inicial=paises.get(i);}
				  
			}
			
			return inicial;
			}
	 }
	



