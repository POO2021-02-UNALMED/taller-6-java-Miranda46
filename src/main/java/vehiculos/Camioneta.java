package vehiculos;

public class Camioneta extends Vehiculo {
	static int cantidadCamioneta;
	boolean volco;
	
public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
	super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
	this.velocidadMaxima=90;
	this.traccion="4X4";
	this.volco=volco;
	cantidadCamioneta++;
	
}

public boolean isVolco() {
	return volco;
}

public void setVolco(boolean volco) {
	this.volco = volco;
}

public static int getCantidadCamioneta() {
	return cantidadCamioneta;
}

public static void setCantidadCamioneta(int cantidadCamioneta) {
	Camioneta.cantidadCamioneta = cantidadCamioneta;
}

}
