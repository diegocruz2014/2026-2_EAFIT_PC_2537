import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int op;
		System.out.println("Videojuego EAFIT");
		System.out.println("Seleccione el modo de juego");
		System.out.println("1. Un jugador");
		System.out.println("2. Dos jugadores");
		System.out.println("3. Jugadores en Intranet");
		System.out.println("4. Jugadores en Internet");
		System.out.println("0. Salir del juego");
		
		System.out.print("Ingrese la opción seleccionada: ");
		op = consola.nextInt();
		
		/*
		if (op == 1) {
		    System.out.println("Ha seleccionado el modo un jugador");
		}
		else if (op == 2) {
		    System.out.println("Ha seleccionado el modo dos jugadores");
		}
		else if (op == 3) {
		    System.out.println("Ha seleccionado el modo jugadores en Intranet");
		}
		else if (op == 4) {
		    System.out.println("Ha seleccionado el modo jugadores en Internet");
		}
		else if (op == 0) {
		    System.out.println("Ha salido del juego");
		}
		else {
		    System.out.println("Ha ingresado una opción incorrecta");
		}
		*/
		
		switch (op) {
		    case 1:
		        System.out.println("Ha seleccionado el modo un jugador");
		        break;
		    case 2:
		        System.out.println("Ha seleccionado el modo dos jugadores");
		        break;
		    case 3:
		        System.out.println("Ha seleccionado el modo jugadores en Intranet");
		        break;
		    case 4:
		        System.out.println("Ha seleccionado el modo jugadores en Internet");
		        break;
		    case 0:
		        System.out.println("Ha salido del juego");
		        break;
		    default:
		        System.out.println("Ha ingresado una opción incorrecta");
		}
	}
}
