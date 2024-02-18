package ejemploCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		/*
		 * En este ejercicio tendremos una colección List con distintos alumnos,
		 * donde con los métodos de la Clase Collections tendremos que hacer distintas cosas
		 * como por ejemplo: 
		 * Agregar alumnos con addAll.
		 * Mostrar la lista de los alumnos.
		 * Reemplazar un alumno antiguo por uno nuevo.
		 * Buscar el alumno con el apellido más lejano alfabéticamente y
		 * el alumno con el nombre más cercano.
		 * Invertir la lista.
		 * Barajar la lista con Shuffle.
		 * Intercambiar la posición de un alumno por otro
		 */
		
		int opcion, cero=0, idAlumno=0, posicion, posNuevo;
		idAlumno++;
		String nombre, apellido;
		List<Alumno> alumnos = new ArrayList<Alumno>();

		Alumno a1 = new Alumno("Lúcas", "Pérez", idAlumno);
		idAlumno++;
		Alumno a2 = new Alumno("Pablo", "Gónzalez", idAlumno);
		idAlumno++;
		Alumno a3 = new Alumno("Sebastián", "Millán", idAlumno);
		idAlumno++;
		Alumno a4 = new Alumno("Candi", "Alcantarilla", idAlumno);
		idAlumno++;
		Alumno a5 = new Alumno("Lucía", "López", idAlumno);
		idAlumno++;
		Alumno a6 = new Alumno("Marta", "Vázquez", idAlumno);
		idAlumno++;
		
	

		// Los agregamos con addAll para mostrar su funcionamiento, pero hacerlo con
		// add y new Alumno funciona igual.

		Collections.addAll(alumnos, a1, a2, a3, a4, a5, a6);
		GestionAlumnos gA = new GestionAlumnos (alumnos);

		
		System.out.println("-----------------------");
		System.out.println("Bienvenidos al programa");
		System.out.println("-----------------------");
		do {
			System.out.println("");
			System.out.println("¿Qué quieres hacer?");
			System.out.println("0 - Salir");
			System.out.println("1 - Agregar Alumno");
			System.out.println("2 - Mostrar lista de alumnos");
			System.out.println("3 - Reemplazar un alumno antiguo por uno nuevo.");
			System.out.println("4 - Buscar alumno con el apellido más lejano");
			System.out.println("5 - Buscar el alumno con el apellido mas cernao alfabeticamente");
			System.out.println("6 - Invertir la lista.");
			System.out.println("7 - Intercambiar la posición de un alumno por otro.");
			System.out.println("8 - Barajar la lista de alumnos");
			
			opcion = Leer.datoInt();

			switch (opcion) {
		
			case 1:
				System.out.println("Nombre del alumno");
				nombre = Leer.dato();

				System.out.println("Apellido del alumno");
				apellido = Leer.dato();
				Alumno a = new Alumno(nombre, apellido, idAlumno);
				idAlumno++;

				Collections.addAll(alumnos, a);
				
				break;

			case 2:

				gA.mostrarLista();
				break;

			case 3:
				System.out.println("-----------------------");
				System.out.println("DATOS DEL NUEVO ALUMNO");
				System.out.println("-----------------------");
				System.out.println("Indique el nombre");
				nombre=Leer.dato();
				System.out.println("Indique el apellido");
				apellido=Leer.dato();
				
				System.out.println("En que posición esta el alumno que desea reemplazar");
				posicion=Leer.datoInt();
				
				Alumno alumNuevo = new Alumno (nombre, apellido, idAlumno);
				idAlumno++;
				
				gA.reemplazarAlumno(alumNuevo, posicion);
				gA.mostrarLista();

				break;
				
			case 4:
				System.out.println("Apellido más lejano: " + gA.buscarApellidoMax());
				break;
				
			case 5:
				System.out.println("Apellido más cercano: " + gA.buscarApellidoMin());
				break;

			case 6:
				gA.invertirLista();
				gA.mostrarLista();
				break;
				
			case 7:
				System.out.println("Posición del alumno que desea mover");
				posicion=Leer.datoInt();
				
				System.out.println("Posición nueva por el que lo desea mover");
				posNuevo=Leer.datoInt();
				
				gA.cambiarPosicion(posicion, posNuevo);
				gA.mostrarLista();
				
				break;
			
			case 8:
				gA.desordenarLista();
				gA.mostrarLista();
				break;
				

			case 0:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println();
				System.out.println("Opción no válida");
				System.out.println();
				break;
			}
		} while (opcion != cero);

		System.out.println("---------------------------------");
		System.out.println("Gracias por usar nuestro programa");
		System.out.println("---------------------------------");
	}

}
