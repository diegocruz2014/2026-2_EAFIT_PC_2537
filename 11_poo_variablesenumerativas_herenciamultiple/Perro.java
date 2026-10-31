// Herencia múltiple: herencia simple de CLASE (extends Mamifero) mas 
// herencia múltiple de TIPOS (implements Animal, Domesticable).
public class Perro extends Mamifero implements Animal, Domesticable {
    
    // Constructor
    public Perro(String nombre) {
        // Se asigna a la clase el método constructor heredado
        super(nombre);
    }
    
    // Polimorfismo mediante sobreescritura de métodos
    @Override
    public void expresarse() {
        System.out.println("Guau");
    }
    
    @Override
    public double velocidadEnMetrosPorSegundo() {
        return 2.0;
    }
    
    @Override
    public void responderAlLlamado(String llamado) {
        System.out.println("Escucho \"" + llamado + "\" y acudo de inmediato.");
    }

}