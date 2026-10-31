import java.io.File;            // Creación de archivos
import java.io.FileWriter;      // Extraer información de archivos para escritura
import java.io.PrintWriter;     // Escritura en archivos
import java.io.FileReader;      // Extraer información de archivos para lectura
import java.io.BufferedReader;  // Lectura de archivos
import java.io.IOException;     // Manejo de errores

public class Main
{
    // Función para crear un archivo
    public static void crearArchivo(String nombreArchivo) {
        // El método try-catch pertenece a la clase IOException
        try {
            // Se crea un objeto File que representa el archivo
            File archivo = new File(nombreArchivo);
            
            // Intentar crear el archivo físicamente en el sistema
            if(archivo.createNewFile()) {
                System.out.println("El archivo " + nombreArchivo 
                    + " se creó exitosamente");
            } 
            else {
                System.out.println("No se puede crear el archivo, ya existe "
                    + "uno con el mismo nombre");
            }
        }
        catch (IOException e) {
            System.out.println("Error al crear el archivo.");
        }
    }
    
    // Función encargada de escribir información en el archivo
    public static void escribirArchivo(String nombreArchivo) {
        try {
            // Abrir el archivo en modo escritura (sobrescribe el contenido existente)
            FileWriter fw = new FileWriter(nombreArchivo);
            
            // Crear un elemento que escribe en el archivo línea por línea 
            PrintWriter pw = new PrintWriter(fw);
            
            // Escribir líneas en el archivo 
            pw.println("Ana");
            pw.println("Roberto");
            
            // Cerrar los elementos creados o abiertos
            pw.close();
            fw.close();
            
            System.out.println("La información se escribió correctamente.");
        }
        catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
        }
    }
    
    // Función para leer el contenido de un archivo 
    public static void leerArchivo(String nombreArchivo) {
        try {
            // Abrir el archivo para lectura 
            FileReader fr = new FileReader(nombreArchivo);
            
            // Obtener el contenido para descargarlo línea por línea
            BufferedReader br = new BufferedReader(fr);
            
            // Crear una variable para almacenar cada línea leída
            String linea;
            
            // Mostrar el contenido del archivo
            System.out.println("Contenido del archivo:");
            while((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            
            // Cerrar los elementos creados o abiertos
            br.close();
            fr.close();
        }
        catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
    
	public static void main(String[] args) {
	    String nombreArchivo = "estudiantes.txt";
	    crearArchivo(nombreArchivo);
	    escribirArchivo(nombreArchivo);
	    leerArchivo(nombreArchivo);
	}
}
