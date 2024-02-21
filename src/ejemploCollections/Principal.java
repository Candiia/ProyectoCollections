package ejemploCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		/*
		 * En este ejercicio tendremos una colección List con distintos alumnos,
		 * donde usaremos los métodos de la Clase Collections con ellos tendremos que
		 * hacer distintas cosas como por ejemplo: 
		 * Agregar alumnos con addAll.
		 * Mostrar la lista de los alumnos.
		 * Reemplazar un alumno antiguo por uno nuevo.
		 * Buscar el alumno con el apellido más lejano alfabéticamente y
		 * el alumno con el nombre más cercano.
		 * Invertir la lista.
		 * Barajar la lista con Shuffle.
		 * Intercambiar la posición de un alumno por otro
		 */
		
		int opcion, cero=0, idAlumno=0, posicion, posNuevo, edad, codAlumnoBuscado;
		idAlumno++;
		double nota, notaNueva;
		String nombre, apellido;
		Alumno a ;
		List<Alumno> alumnos = new ArrayList<Alumno>();
		
		
		Alumno a1 = new Alumno("Lúcas", "Pérez", idAlumno, 20, 6.3);
		idAlumno++;
		Alumno a2 = new Alumno("Pablo", "Gónzalez", idAlumno, 18, 5.3);
		idAlumno++;
		Alumno a3 = new Alumno("Sebastián", "Millán", idAlumno, 24, 8.4);
		idAlumno++;
		Alumno a4 = new Alumno("Candi", "Alcantarilla", idAlumno, 22, 6.4);
		idAlumno++;
		Alumno a5 = new Alumno("Lucía", "López", idAlumno, 20, 4.4);
		idAlumno++;
		Alumno a6 = new Alumno("Marta", "Vázquez", idAlumno, 19, 3.5);
		idAlumno++; 
		
	

		// Los agregamos con addAll para mostrar su funcionamiento, pero hacerlo con
		// add y new Alumno funciona igual.

		Collections.addAll(alumnos, a1, a2, a3, a4, a5, a6);
		GestionAlumnos gA = new GestionAlumnos (alumnos);
		CrudAlumno cA = new CrudAlumno(alumnos);
		
		System.out.println("-----------------------");
		System.out.println("Bienvenidos al programa");
		System.out.println("-----------------------");
		do {
			System.out.println("""
					-----------------------------------------------------------------
					0 - Salir
					1 - Agregar Alumno
					2 - Mostrar lista de alumnos
					3 - Reemplazar un alumno antiguo por uno nuevo.
					4 - Buscar alumno con el apellido más lejano.
					5 - Buscar el alumno con el apellido mas cernao alfabeticamente.
					6 - Invertir la lista.
					7 - Intercambiar la posición de un alumno por otro.
					8 - Barajar la lista de alumnos
					9 - Eliminar un alumno.
					10 - Modificar una nota
					-----------------------------------------------------------------
					¿Qué desea hacer?
					""");
			opcion = Leer.datoInt();

			switch (opcion) {
		
				case 1:
					System.out.println("Nombre del alumno");
					nombre = Leer.dato();
					System.out.println("Apellido del alumno");
					apellido = Leer.dato();
					System.out.println("Indique la edad");
					edad=Leer.datoInt();
					System.out.println("Indique la nota del alumno");
					nota=Leer.datoDouble();
					a = new Alumno(nombre, apellido, idAlumno, edad, nota);
					idAlumno++;
	
					cA.agregarAlum(a);
					
					break;
	
				case 2:
					
					cA.mostrarLista();
					
					break;
	
				case 3:
					System.out.println("-----------------------");
					System.out.println("DATOS DEL NUEVO ALUMNO");
					System.out.println("-----------------------");
					System.out.println("Indique el nombre");
					nombre=Leer.dato();
					System.out.println("Indique el apellido");
					apellido=Leer.dato();
					System.out.println("Indique la edad");
					edad=Leer.datoInt();
					System.out.println("Indique la nota del alumno");
					nota=Leer.datoDouble();
					
					System.out.println("En que posición esta el alumno que desea reemplazar");
					posicion=Leer.datoInt();
					
					Alumno alumNuevo = new Alumno (nombre, apellido, idAlumno, edad, nota);
					idAlumno++;
					
					gA.reemplazarAlumno(alumNuevo, posicion);
					cA.mostrarLista();
	
					break;
					
				case 4:
					System.out.println("Apellido más lejano: " + gA.buscarApellidoMax());
					break;
					
				case 5:
					System.out.println("Apellido más cercano: " + gA.buscarApellidoMin());
					break;
	
				case 6:
					gA.invertirLista();
					cA.mostrarLista();
					break;
					
				case 7:
					System.out.println("Posición del alumno que desea mover");
					posicion=Leer.datoInt();
					
					System.out.println("Posición nueva por el que lo desea mover");
					posNuevo=Leer.datoInt();
					
					gA.cambiarPosicion(posicion, posNuevo);
					cA.mostrarLista();
					
					break;
				
				case 8:
					gA.desordenarLista();
					cA.mostrarLista();
					break;
					
				case 9:
					System.out.println("Indique el código del alumno que desea eliminar");
					codAlumnoBuscado=Leer.datoInt();
					cA.borrarUnAlumno(codAlumnoBuscado);
					cA.mostrarLista();
					break;
					
				case 10:
					System.out.println("Indique el código del alumno que desea modificar su nota");
					codAlumnoBuscado=Leer.datoInt();
					System.out.println("Indique la nota nueva");
					notaNueva=Leer.datoDouble();
					
					cA.modificarNota(codAlumnoBuscado, notaNueva);
					cA.mostrarLista();
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
