package FlujosDeControl;

import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Rafael", "Maria", "Anderson", "Betsy"};
        int count = nombres.length;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase("Rafael") ||
                    nombres[i].equalsIgnoreCase("Anderson")) {
                continue;
            }
            System.out.println(nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre \"Rafael\" o \"Anderson\"");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }

        if(encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " existe");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe");
        }
    }
}
