package empresaDeSoftware;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;

public class Empresa {
	private String nombre;
	private HashSet<Empleado> empleados = new HashSet<Empleado>();
	HashMap<Empleado, Double> sueldos = new HashMap<Empleado, Double>();

	public Empresa(String nombre) {
		this.nombre = nombre;
	}

	public void calcularDiasDeVacaciones(Empleado empleado) {
		empleado.calcularSueldo();
	}

	public void contratarEmpleado(Empleado empleado) {
		empleados.add(empleado);

	}

	public Boolean darDeBajaAEmpleado(Integer dni) {
		for (Empleado empleado : this.empleados) {
			if (empleado.getDni().equals(dni)) {
				empleados.remove(empleado);
				return true;
			}
		}
		return false;
	}

	public HashSet<Empleado> getEmpleados() {
		return empleados;
	}

	public HashMap<Empleado, Double> liquidarSueldos() {
		for (Empleado empleado : empleados) {
			sueldos.put(empleado, empleado.calcularSueldo());
		}
		return sueldos;
	}

}
