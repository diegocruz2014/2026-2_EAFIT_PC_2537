import java.util.Scanner;

public class Main
{
	static Scanner consola = new Scanner(System.in);
	    
	// Crear función para llenar un arreglo
	public static void llenarVector(int[] nums) {
	    for (int i = 0; i < nums.length; i++) {
		    System.out.print("Ingrese el valor " + (i + 1) + ": ");
		    nums[i] = consola.nextInt();
		}
		System.out.print("\n");
	}
	
	public static void cambiarValor(int num) {
	    num = 29;
	    System.out.println("Valor del número dentro de la función: " + num);
	}
	
	// Crear función para crear un vector
	public static void mostrarVector(int[] nums) {
	    System.out.println("Valores ingresados:");
		for (int i = 0; i < nums.length; i++) {
		    System.out.print(nums[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
	    
	    // Declaraciones
	    int n = 0, num = 2026, aux = 0;
	    
	    // Inicialización de valores
	    System.out.print("Ingrese la cantidad de edades: ");
	    n = consola.nextInt();
	    int[] edades = new int[n]; // Crea un vector de n posiciones
	    
	    llenarVector(edades); // Ejecutar la función creada
	    mostrarVector(edades);
	    
	    System.out.println("Valor del número antes de la función: " + num);
	    cambiarValor(num);
	    System.out.println("Valor del número después de la función: " + num);
	    
	    // Utilización del vector: ordenar los valores dentro del vector
		// Método de ordenamiento burbuja
		for (int i = 0; i < edades.length - 1; i++) {
		    for (int j = i + 1; j < edades.length; j++) {
		        if(edades[i] > edades[j]) {
		            aux = edades[i];
		            edades[i] = edades[j];
		            edades[j] = aux;
		        }
		    }
		}
		
		System.out.println("\nVector ordenado: ");
	    mostrarVector(edades);
		
		
	}
}
