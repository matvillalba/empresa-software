package empresaDeSoftware;

import java.util.HashSet;

public class Administrativo extends Empleado {
	private HashSet<Empleado> empleadosContratados = new HashSet<Empleado>();

	public Administrativo(Integer dni, Integer idEmpleado, String nombre, Double sueldo, Integer anioDeIngreso,
			String area) {
		super(dni, idEmpleado, nombre, sueldo, anioDeIngreso, area);
		toleranciaDeAusencias = 1;
	}

}
