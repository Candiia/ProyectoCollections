package ejemploCollections;

import java.util.List;

public class CrudAlumno {
	
	private List <Alumno> listaAlum;

	public CrudAlumno(List<Alumno> listaAlum) {
		super();
		this.listaAlum = listaAlum;
	}

	public List<Alumno> getListaAlum() {
		return listaAlum;
	}

	public void setListaAlum(List<Alumno> listaAlum) {
		this.listaAlum = listaAlum;
	}

	@Override
	public String toString() {
		return "CrudAlumno [listaAlum=" + listaAlum + "]";
	}
	
	public void agregarAlum(Alumno a) {
		listaAlum.add(a);
	}
	
	/*Aquí mostramos la lista*/
	public void mostrarLista() {
		int posicion=0;
		for (Alumno alumnos : listaAlum) {
			posicion++;
			System.out.println(posicion + "-" + alumnos);
		}
	}
	
	/*Buscar alumno */
	
	public Alumno buscarAlumno(int codAlumno) {
		boolean encontrado = false;
		int i =0;
		while(i < listaAlum.size() && !encontrado) {
			Alumno deLista = listaAlum.get(i);
			if(deLista.getIdAlumno()==codAlumno) {
				encontrado=true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return listaAlum.get(i);
		}else {
			return null;
		}
		
	}
	
	/*Modificar una nota*/
	public void modificarNota(int codAlumno, double notaNueva) {
		buscarAlumno(codAlumno).setNotaMedia(notaNueva);
	}
	
	
	/*Eliminar un alumno*/
	
	public void borrarUnAlumno(int codAlumno) {
		listaAlum.remove(buscarAlumno(codAlumno));
	}
	
	
	
	
}
