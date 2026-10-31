import java.util.ArrayList; // Información concreta de la lista
import java.util.List;      // Interfaz: el tipo con el que declaramos la variable
import java.util.Locale;    // Regla regional para separadores, decimales, etc.

public class Main
{
	public static void main(String[] args) {
		
		List<Animal> fauna = new ArrayList<Animal>();
		
		fauna.add(new Gato("Ceniza"));
		fauna.add(new Perro("Chester"));
		fauna.add(new Lobo("Ulises"));
		
		for (Animal a : fauna) {
		    
		    // Obtener el nombre de cada animal
		    String nombre = "(sin nombre)";
		    
		    // Verificar si cada objeto es parte de una clase
		    if (a instanceof Mamifero) {
		        Mamifero m = (Mamifero) a;
		        nombre = m.getNombre();
		    }
		    System.out.println("\nNombre del animal: " + nombre);
		    
		    // Métodos de Animal 
		    a.expresarse();
		    a.alimentarse(TipoAlimentacion.SILVESTRE);
		    System.out.println(String.format(Locale.US,
		        "Recorro %.1f metros en un segundo", a.velocidadEnMetrosPorSegundo()));
		    
		    // Método o comportamiento heredado de la clase abstracta
		    if (a instanceof Mamifero) {
		        Mamifero m = (Mamifero) a;
		        m.amamantar();
		    }
		    
		    // Consulta por capacidad, no por clase
		    if (a instanceof Domesticable) {
		        Domesticable d = (Domesticable) a;
		        d.responderAlLlamado("ven aca");
		    }
		    else {
		        System.out.println("No responde a llamados humanos");
		    }
		}
	}
}
