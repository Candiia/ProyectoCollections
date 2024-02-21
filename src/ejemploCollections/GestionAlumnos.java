package ejemploCollections;

import java.util.Collections;
import java.util.List;

public class GestionAlumnos {
	
	private List <Alumno> listaAlumnos;

	public GestionAlumnos(List<Alumno> listaAlumnos) {
		super();
		this.listaAlumnos = listaAlumnos;
	}

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	@Override
	public String toString() {
		return "GestionAlumnos [listaAlumnos=" + listaAlumnos + "]";
	}
	
	/* 
	 * Devuelve el elemento máximo de la colección dada,
	 * el orden natural de sus elementos. Todos los elementos de 
	 * la colección deben implementar la interfaz Comparable.
	 */
	
	public Alumno buscarApellidoMax() {
		return Collections.max(listaAlumnos);
	}
	
	
	/*
	 * Esté método es igual que el máximo pero este nos devueleve el mínimo
	 * Tambien debe implementar la interfaz Comparable. 
	 */
	public Alumno buscarApellidoMin() {
		return Collections.min(listaAlumnos);
	}
	
	/*Vamos a invertir la lista*/
	
	public void invertirLista() {
		Collections.reverse(listaAlumnos);
	}
	
	
	/*
	 * Esté método nos desordena la lista aletoriamente, 
	 * las posiciones cambian
	 */
	public void desordenarLista() {
		Collections.shuffle(listaAlumnos);
	}
	
	
	/*
	 * Esté remplaza lo que le hayamos determinado 
	 * por el nuevo que hayamos indicado.
	 * En nuestro caso sería un nuevo alumno.
	 * Debemos poner -1 porque el usuario al meter un número no sabe que empieza por 0.
	 */
	public void reemplazarAlumno(Alumno alumNuevo, int pos) {
		 Collections.replaceAll(listaAlumnos, listaAlumnos.get(pos - 1), alumNuevo);
	}
	
	
	public void cambiarPosicion(int posicion, int posNuevo) {
		Collections.swap(listaAlumnos, posicion -1 , posNuevo - 1);
	}

}
