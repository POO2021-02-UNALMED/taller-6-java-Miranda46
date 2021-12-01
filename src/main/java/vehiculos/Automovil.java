package vehiculos;

public class Automovil extends Vehiculo {
int puestos;
static int cantidadAutomovil;

public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
	super( placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
	velocidadMaxima=100;
	traccion="FWD";
	puertas=4;
	this.puestos=puestos;
	cantidadAutomovil++;

}

public int getPuestos() {
	return puestos;
}

public void setPuestos(int puestos) {
	this.puestos = puestos;
}

public int getCantidadAutomovil() {
	return cantidadAutomovil;
}

public static void setCantidadAutomovil(int cantidadAutomovil) {
	Automovil.cantidadAutomovil = cantidadAutomovil;
}

}
