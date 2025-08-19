package EJERCICIO1;

public class Empleado extends Persona{

	
	private static int legajo = 1000;
	private String puesto;
	
	public Empleado() {
		legajo++;
		this.puesto="a definir";
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " Empleado legajo=" + legajo + ", puesto=" + puesto;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	
}
