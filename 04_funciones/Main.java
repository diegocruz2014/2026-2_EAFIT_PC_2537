import java.util.Scanner;
import java.time.LocalDate;

public class Main
{
	// variable global
	int num = 25;
	
	// Funciones
	
	// Creación de funciones sin parámetros y sin retorno
	void saludar() {
	    // Acciones propias de la función saludar()
	    System.out.println ("Hola grupo 7709!");
	}
	
	// Creación de funciones con parámetros y sin retorno
	void saludarAlguien(String txt) {
	    System.out.println("Hola " + txt + "!");
	}
	
	void nuevoValor(int x) {
	    x = 2345;
	    System.out.println("El valor de num dentro de la función, es: " + x);
	}
	
	void sumarGlobal(int a, int b) {
	    System.out.println(a + " + " + b + " + " + num + " = " + (a + b + num));
	}
	
	// Creación de funciones sin parámetros y con retorno
	String fechaDeHoy() {
	    LocalDate hoy = LocalDate.now();
        System.out.println(hoy); // Muestra la fecha en formato aaaa-mm-dd
 
        // Extraer los componentes en variables individuales
        int anio = hoy.getYear();
        int mes = hoy.getMonthValue();
        int dia = hoy.getDayOfMonth();
        
        // Mostrar los resultados
        System.out.println("Año: " + anio);
        System.out.println("Mes: " + mes);
        System.out.println("Día: " + dia);
	    
	    return dia + " de " + getMonth(mes) + " de " + anio;
	}
	
	
	// Creación de funciones con parámetros y con retorno
	int sumar(int a, int b) {
	    return a + b;
	}
	
	String getMonth(int numMes){
	    String mes;
	    switch (numMes) {
	        case 1:
	            mes = "enero";
	            break;
	        case 2:
	            mes = "febrero";
	            break;
	        case 3:
	            mes = "marzo";
	            break;
	        case 4:
	            mes = "abril";
	            break;
	        case 5:
	            mes = "mayo";
	            break;
	        case 6:
	            mes = "junio";
	            break;
	        case 7:
	            mes = "julio";
	            break;
	        case 8:
	            mes = "agosto";
	            break;
	        case 9:
	            mes = "septiembre";
	            break;
	        case 10:
	            mes = "octubre";
	            break;
	        case 11:
	            mes = "noviembre";
	            break;
	        case 12:
	            mes = "diciembre";
	            break;
	        default:
	            mes = "Mes incorrecto";
	    }
	    return mes;
	}

        
    public void main(String[] args) {
		
		// Declaración de variables
		Scanner consola = new Scanner(System.in);
		
		// Obtener el nombre por consola
		String nombre = consola.nextLine();
		int n1 = 5, n2 = consola.nextInt();
		if (true) {
		    int year = 2026;
		    // Imprimir variable local
		    System.out.println(year);
		
		    // Imprimir variable global
		    System.out.println(num);
		}
		
		// Error! Mostrar una variable local por fuera de su contexto
		//System.out.println(year);
		
		// Ejecución de funciones sin parámetros y sin retorno
	    saludar();
		
		// Ejecución de funciones con parámetros y sin retorno
	    saludarAlguien(nombre);
		sumarGlobal(n1, n2);
		
		// Ejecución de funciones sin parámetros y con retorno
	    String fecha = fechaDeHoy();
		System.out.println(fecha);
		
		// Ejecución de funciones con parámetros y con retorno
	    System.out.println(n1 + " + " + n2 + " = " + sumar(n1, n2));
		
		System.out.println("Valor de num antes de la función: " + num);
		nuevoValor(num);
		System.out.println("Valor de num después de la función: " + num);
	}
}
