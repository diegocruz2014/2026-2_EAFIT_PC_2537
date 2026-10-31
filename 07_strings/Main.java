import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner consola = new Scanner(System.in);
	 
	    char letra = '\u042E';
	
	    // String: Cadena de caracteres
	    
	    String a = "La letra \"a\" es la primera del alfabeto";
	    String b = "juego";
	    String c = new String("juego");
	    int[] nums = new int[5];
	    
	    System.out.println("Valor de letra: \"" + letra + "\" resto del texto");
        System.out.println("Valor de la cadena a: " + a);
        System.out.println("¿la cadena b es igual a la cadena c?: " + b.equals(c));
        System.out.println("Longitud de la cadena a: " + a.length());       // Método length()
        System.out.println("Longitud del vector nums: " + nums.length);     // Parámetro length
        System.out.println("Último caracter de la cadena a: " + a.charAt(a.length() - 1));
        System.out.println("Posición de la porción 'tra' en la cadena a: " + a.indexOf("tra"));
        System.out.println("Subcadena de a: " + a.substring(9, a.length()));
        System.out.println("");
        System.out.println("");
        
	    
		System.out.println("");
        
	}
}
