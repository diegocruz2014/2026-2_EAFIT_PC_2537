// Importamos la biblioteca con la que trabajaremos arreglos dinámicos
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	
	public static void main(String[] args) {
	    
	    Scanner consola = new Scanner(System.in);
	    ArrayList<String> fichas = new ArrayList<>();
	    
	    // Ingresar valores en la lista dinámica (ArrayList)
	    // add(elemento): Método para adicionar un elemento en un ArrayList
	    fichas.add("Rey blanco");
	    fichas.add("Reina blanca");
	    fichas.add("Alfil blanco");
	    fichas.add("Peón blanco");
	    fichas.add("Rey negro");
	    fichas.add("Reina negra");
	    fichas.add("Caballo negro");
	    
	    // Mostrar valores de la lista dinámica
	    System.out.println("\nContenido de fichas:");
	    System.out.println(fichas);
		// size(): Método para obtener la cantidad de elementos en un ArrayList
	    System.out.println("Cantidad de fichas: " + fichas.size());
	    
	    // indexOf(): Método para encontrar la posición de un elemento en un ArrayList
	    String ficha = "Alfil blanco";
	    System.out.println("\nPosición de la ficha \"" + ficha + 
	        "\" en la lista: " + fichas.indexOf(ficha));
	    
	    // set(posicion, nuevoElemento): Método para modificar un elemento en la lista
	    fichas.set(fichas.indexOf("Peón blanco"), "Reina blanca");
	    
	    System.out.println("\nCoronó el peón blanco:");
	    System.out.println(fichas);
		// size(): Método para obtener la cantidad de elementos en un ArrayList
	    System.out.println("Cantidad de fichas: " + fichas.size());
	    
	    // remove(posición): Método para retirar un elemento de un ArrayList
	    fichas.remove(fichas.indexOf("Alfil blanco"));
	    
	    System.out.println("\nDesaparece el alfil blanco:");
	    System.out.println(fichas);
		// size(): Método para obtener la cantidad de elementos en un ArrayList
	    System.out.println("Cantidad de fichas: " + fichas.size());
	    
	    // get(posición): Método para obtener el elemento que se
	    // encuentra en una posición determinadda
	    System.out.println("\nQué ficha se encuentra en la posición 3?: " 
	        + fichas.get(3));
	        
	    // clear(): Método para retirar todos los elementos de un ArrayList
	    fichas.clear();
	    
	    System.out.println("\nRetiramos todos los elementos de fichas:");
	    System.out.println(fichas);
		// size(): Método para obtener la cantidad de elementos en un ArrayList
	    System.out.println("Cantidad de fichas: " + fichas.size());
	    
	}
}
