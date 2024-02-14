package ejemploList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		/*Vamos a crear una lista de nuestros amigos, la llamaremos "amigos" y agregaremos algunos nombre allí.
		 * Digamos 	que comenzamos el Grado superior e hicimos algunos amigos nuevos a la vez
		 * y desemaos pasalo a la lista principal de amigos.
		 * */
		
		List<String> amigos = new ArrayList <String>();
		
		amigos.add("Carlos");
		amigos.add("Sebas");
		amigos.add("Lucía");
		System.out.println(amigos);
		/*Ahora agregaremos los amigos nuevos que hemos hecho en el grado*/
		Collections.addAll(amigos, "Lucas", "Marta", "Sergio");
		System.out.println("La nueva lista de amigos es:");
		System.out.println(amigos);

	}

}
