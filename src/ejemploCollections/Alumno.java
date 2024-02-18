package ejemploCollections;

import java.util.List;

public class Alumno implements Comparable <Alumno>{
	
	private String nombre;
	private String apellidos;
	private int idAlumno;
	
	public Alumno(String nombre, String apellidos, int idAlumno) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	@Override
	public String toString() {
		return "Alumnos [nombre=" + nombre + ", apellidos=" + apellidos + ", idAlumno=" + idAlumno + "]";
	}

	
	/*Esté método nos hace comparar el apellido que tenemos con los otros.
	 * Para ello debemos implementar la interface Comparable 
	 * <Aquí debe ir lo que queremos comparar>*/
	@Override
	public int compareTo(Alumno a) {
		
		return this.apellidos.toLowerCase().compareTo(a.getApellidos().toLowerCase());
	}

}
