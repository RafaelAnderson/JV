import java.util.Arrays;

public class Variables {
    public static void main(String[] args) {
        String saludar = "Hola";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        
        int numero = 10;
        System.out.println("numero = " + numero);

        boolean valor = true;
        if(valor) {
            int numero2 = 15;
            System.out.println("numero2 = " + numero2);
        }
        var numero3 = "20";
        System.out.println("numero3 = " + numero3);

        //

        String nombre;
        nombre = "Rafael";

        if(numero > 5){
            nombre = "Anderson";
        }
        System.out.println(nombre);

        int edadPersona = 25;
    }
}
