// Herencia: La clase Mamifero hereda de la clase Animal
public class Mamifero extends Animal {
    
    // Propiedades (atributos) de clase se manipulan
    // por encapsulamiento, haciendo uso de métodos
    // denominados setter y getter.
    private String nombre;
    
    // Métodos 
    // Constructor
    public Mamifero(String nombre) {
        this.nombre = nombre;
        System.out.println("Ha creado un mamífero llamado " + nombre);
    }
    
    // Polimorfismo por sobrecarga de métodos
    public Mamifero() {
        System.out.println("Ha creado un mamífero sin nombre");
    }
    
    // Métodos setter y getter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
    // Métodos propios de la clase
    public void amamantar() {
        System.out.println("Consumo leche proveniente de mi madre");
    }
    
}