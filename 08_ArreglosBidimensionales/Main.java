import java.util.Scanner;

public class Main
{
    // Objeto global
    static Scanner consola = new Scanner(System.in);
    
    // Función para ingresar datos en una matriz
    public static void llenarMatriz(int nums[][]) {
        for(int i = 0; i < nums.length; i++) { // Ciclo para controlar filas
            for(int j = 0; j < nums[i].length; j++) { // Ciclo para controlar columnas
                nums[i][j] = consola.nextInt();                
            }
        }
    }   
    
    // Función para mostrar datos de una matriz
    public static void mostrarMatriz(int nums[][]) {
        for(int i = 0; i < nums.length; i++) { // Ciclo para controlar filas
            for(int j = 0; j < nums[i].length; j++) { // Ciclo para controlar columnas
                System.out.print(nums[i][j] + " ");                
            }
            System.out.println();
        }
    }   
    
    // Función principal
	public static void main(String[] args) {
	    
	    // Declaraciones
	    int filas, columnas;
	    
	    // Solicitar los valores para filas y columnas
	    filas = consola.nextInt();
	    columnas = consola.nextInt();
	    
	    // Declarar una matriz
	    int[][] matriz = new int[filas][columnas];
	    
	    // Ingresar contenido a la matriz
	    llenarMatriz(matriz);
	    
	    // Mostrar el contenido de la matriz creada
	    mostrarMatriz(matriz);
	    
		System.out.println("");
	}
}
