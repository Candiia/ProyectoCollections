package ejemploCollections;

public class Alumno implements Comparable <Alumno>{
	
	private String nombre;
	private String apellidos;
	private int idAlumno;
	private int edad;
	private double notaMedia;
	
	

	public Alumno(String nombre, String apellidos, int idAlumno, int edad, double notaMedia) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.idAlumno = idAlumno;
		this.edad = edad;
		this.notaMedia = notaMedia;
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
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", idAlumno=" + idAlumno + ", edad=" + edad
				+ ", notaMedia=" + notaMedia + "]";
	}

	/*Esté método nos hace comparar el apellido que tenemos con los otros.
	 * Para ello debemos implementar la interface Comparable 
	 * <Aquí debe ir lo que queremos comparar>*/
	@Override
	public int compareTo(Alumno a) {
		
		return this.apellidos.toLowerCase().compareTo(a.getApellidos().toLowerCase());
	}

}
