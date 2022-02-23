import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try{
            numeroDecimal = scanner.nextInt();
        } catch(InputMismatchException e) { // Error específico. Para pasar todas las excepciones: Exception e
            System.out.println("Error, debe ingresar un número entero!");
            main(args);
            System.exit(0); // Salida sin errores
        }

        String mensaje = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\n número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\n numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        System.out.println(mensaje);
    }
}
