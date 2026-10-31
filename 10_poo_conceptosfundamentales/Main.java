import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner consola = new Scanner(System.in);
		
		// Herencia: Desde una clase hacia un objeto. Crear una 
		// instancia, copia u objeto de la clase Gato.
		Gato copito = new Gato("Copito");
		Gato gato1 = new Gato();
		
		// Acciones con el objeto creado
		System.out.println("\nNombre del gato: " + copito.getNombre());
		copito.expresarse();
		System.out.println(copito.alimentarse("hogareño"));
		System.out.println(copito.desplazarse());
		copito.amamantar();
		
		/*
		System.out.println(5 + 7);
		System.out.println('5' + 7);
	    System.out.println("5" + 7);
	    System.out.println(5 + '7');
	    System.out.println(5 + "7");
	    System.out.println('5' + '7');
	    System.out.println("5" + "7");
	    */
	    
	    
	}
}
