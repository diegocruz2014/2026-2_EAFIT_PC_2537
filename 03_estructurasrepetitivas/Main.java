import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    // Declaración de variables
	    // Creación de una instancia (copia u objeto) de la clase Scanner
	    Scanner consola = new Scanner(System.in);
	    
	    int i = 0; // Paso 1: Creación de variable de control (vc) y asignación de valor inicial 
	    int limite = 10; // Creo y defino la cantidad de repeticiones del ciclo
	    
	    System.out.println("Estructura repetitiva while");
	    while (i < limite) {    // Paso 2: Establecer el límite de la vc 
	        System.out.print(i + " ");
	        i = i + 1;  // Paso 3: Establecer el incremento de la vc
	    }
	    
	    System.out.println("\n");
	    System.out.println("Estructura repetitiva do while");
	    i = 0; // Paso 1: Asignación de valor inicial a la vc.
	    do {
	        System.out.print(i + " ");
	        i++; // Es lo mismo que i = i + 1;  -> Paso 2: Establecer el incremento de la vc.
	    } while (i < 10); // Paso 3: Establecer el límite de la vc.
	    
	    System.out.println("\n");
	    System.out.println("Estructura repetitiva for");
	    for (i = 10; i >= 1; i--) {
	        System.out.print(i + " ");
	    }
	    
	    System.out.println("\n");
	    System.out.println("Estructura repetitiva while con centinela");
	    boolean b = true; // Paso 1: Creación de centinela y asignación de valor inicial 
	    int cont = 0;
	    System.out.println("¡Adivina un número!");
	    while (b) {
	        cont++;
	        System.out.print("Escribe un número entre 1 y 20: ");
	        i = consola.nextInt();
	        if (i == 5) b = false;
	    }
	    System.out.println("¡Adivinaste el número en " + cont + " intentos!");
	    
	    // Otra forma de trabajar con centinela, utilizando break
	    cont = 0;
	    System.out.println("\n¡Adivina otro número!");
	    while (true) {
	        cont++;
	        System.out.print("Escribe un número entre 1 y 20: ");
	        i = consola.nextInt();
	        if (i == 7) break;
	    }
	    System.out.println("¡Adivinaste el número en " + cont + " intentos!");
	}
}
