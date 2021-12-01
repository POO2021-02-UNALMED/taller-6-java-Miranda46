package vehiculos;

import java.util.ArrayList;

public class Fabricante {

	String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> fabricas = new ArrayList<>();
	private int cantidadFabricas;

	
public Fabricante(String nombre, Pais pais) {
	this.nombre=nombre;
	this.pais=pais;
	fabricas.add(this);
	this.cantidadFabricas++;
	
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
public static Fabricante fabricaMayorVentas() {
	 Fabricante inicial=fabricas.get(0);
	 
		for (int i = 0; i < fabricas.size(); i++) {
			if (fabricas.get(i).cantidadFabricas>inicial.cantidadFabricas) {
				inicial=fabricas.get(i);}
			  
		}
		
		return inicial;
		}
}
