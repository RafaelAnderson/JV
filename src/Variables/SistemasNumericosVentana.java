package Variables;

import javax.swing.*;

public class SistemasNumericosVentana {

    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Error debe ingresar un número entero");
            main(args);
            System.exit(0); // Salida sin errores
        }

        String mensaje = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\n número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\n numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
