// Herencia: La clase Mamifero hereda de la clase Animal
public abstract class Mamifero {
    
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
    
    public void alimentarse(TipoAlimentacion tipo){ 
        switch (tipo) {
            case HOGAR:
                System.out.println("Vivo en un hogar, me alimento de concentrado.");
                break;
            case CALLE:
                System.out.println("Me alimento de lo que encuentro en la calle.");
                break;
            case SILVESTRE:
                System.out.println("Cazo mi propio alimento.");
                break;
            default:
                System.out.println("No han definido de qué me alimento.");
                break;
        }
    }
}