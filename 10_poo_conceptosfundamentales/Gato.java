public class Gato extends Mamifero {
    
    // Constructor
    public Gato(String nombre) {
        // Se asigna a la clase el método constructor heredado
        super(nombre);
    }
    
    // Constructor para el gato por sobrecarga de métodos (polimorfismo)
    public Gato() {
        System.out.println("Ha creado un gato sin nombre");
    }
    
    // Polimorfismo mediante sobreescritura de métodos
    @Override
    public void expresarse() {
        System.out.println("Miau");
    }
    
    @Override
    public String alimentarse(String tipo) {
        if(tipo.equals("hogareño")) {
            return "Vivo en un hogar, me alimento de concentrado";
        }
        else if(tipo.equals("callejero")) {
            return "Me alimento de lo que encuentro en la calle";
        }
        else {
            return "No han definido de qué me alimento";
        }
    }
    
    @Override
    public String desplazarse() {
        return "Corro tres metros en un segundo";
    }

}