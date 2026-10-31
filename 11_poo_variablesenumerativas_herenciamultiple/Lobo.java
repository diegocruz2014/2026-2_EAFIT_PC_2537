// Herencia múltiple: herencia simple de CLASE (extends Mamifero) mas 
// herencia múltiple de TIPOS (implements Animal, Domesticable).
public class Lobo extends Mamifero implements Animal {
    
    // Constructor
    public Lobo(String nombre) {
        // Se asigna a la clase el método constructor heredado
        super(nombre);
    }
    
    // Polimorfismo mediante sobreescritura de métodos
    @Override
    public void expresarse() {
        System.out.println("Auuuu");
    }
    
    @Override
    public double velocidadEnMetrosPorSegundo() {
        return 5.0;
    }
}