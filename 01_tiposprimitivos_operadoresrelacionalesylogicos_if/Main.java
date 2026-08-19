// 1. Importar la clase Scanner
import java.util.Scanner;

// Este es mi primer ejercicio en OnlineGDB
public class Main
{
	public static void main(String[] args) {
	    
	    // 2. Creo la instancia (copia u objeto) de la clase Scanner
	    Scanner consola = new Scanner(System.in);
	    
	    // Tipos primitivos
	    int num1 = 4; // Enteros
	    float num2 = 3.1416f; // reales
	    boolean a = true, b = false; // booleano (true, false)
	    char caracter = 'c';
	    
	    // Clases
	    String saludo = "Hola!";
	    String saludo2 = new String("Hola EAFIT!");
	    
	    // Operadores lógicos
	    
		System.out.println("AND (&&)");
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		
		System.out.println("\nOR (||)");
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);
		
		System.out.println("\nNOT");
		System.out.println(!false);
		System.out.println(!true);
		
		String nombre = "Maria";
		
		System.out.println("\nPor favor ingrese la edad de " + nombre + ":");
		
		// 3. Leer desde la consola el valor y entregarlo a la variable
		int edad = consola.nextInt();
		
		System.out.println("\n¿Puede " + nombre + " asistir a la disco?" );
		// Estructura condicional si (if)
		if (edad >= 18) {
		    // Acciones por verdadero
		    System.out.println("Sí puede asistir presentando su cédula\n");
		}
		else {
		    // Acciones por falso
		    System.out.println("No puede ingresar, es menor de edad\n");
		}
		
		// Operadores relacionales
	    if (num1 > num2) System.out.println(num1 + " es mayor que " + num2);
	    if (num1 < num2) System.out.println(num1 + " es menor que " + num2);
	    if (num1 >= num2) System.out.println(num1 + " es mayor o igual que " + num2);
	    if (num1 <= num2) System.out.println(num1 + " es menor o igual que " + num2);
	    if (num1 == num2) System.out.println(num1 + " es igual a " + num2);
	    if (num1 != num2) System.out.println(num1 + " es diferente de " + num2);

	}
}
