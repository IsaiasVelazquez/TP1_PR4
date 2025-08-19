package EJERCICIO1;

public class Principal {

	public static void main(String[] args) {
	
		Empleado emp1=new Empleado();
		emp1.setPuesto("Pasante");
		System.out.println(emp1.toString());
		
		Empleado emp2=new Empleado();
		emp2.setPuesto("Gerente");
		System.out.println(emp2.toString());
		
		Empleado emp3=new Empleado();
		emp3.setPuesto("Recepcion");
		System.out.println(emp3.toString());
		
		
	}
}
