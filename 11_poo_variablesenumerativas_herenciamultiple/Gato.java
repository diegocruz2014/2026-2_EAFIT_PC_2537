// Herencia múltiple: herencia simple de CLASE (extends Mamifero) mas 
// herencia múltiple de TIPOS (implements Animal, Domesticable).
public class Gato extends Mamifero implements Animal, Domesticable {
    
    // Constructor
    public Gato(String nombre) {
        // Se asigna a la clase el método constructor heredado
        super(nombre);
    }
    
    // Polimorfismo mediante sobreescritura de métodos
    @Override
    public void expresarse() {
        System.out.println("Miau");
    }
    
    @Override
    public double velocidadEnMetrosPorSegundo() {
        return 3.0;
    }
    
    @Override
    public void responderAlLlamado(String llamado) {
        System.out.println("Escucho \"" + llamado + "\" y decido si voy");
    }

}