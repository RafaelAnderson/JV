package ValorReferencia;

class Persona {
    private String nombre; // Principio de Ocultacion (private)

    public void modificarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String leerNombre() {
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Rafael");

        System.out.println("Iniciamos el método main");
        System.out.println("persona. = " + persona.leerNombre());
        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Después de llamar al método test");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println("Finaliza el método main");
    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el método test");
        System.out.println("Cambiando");
        persona.modificarNombre("Anderson");
        System.out.println("Finaliza el método test");
    }
}
