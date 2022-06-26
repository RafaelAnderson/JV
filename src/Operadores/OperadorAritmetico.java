package Operadores;

import javax.swing.*;

public class OperadorAritmetico {

    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);
        System.out.println("i + j = " + i + j);
        int resta = i - j;

        System.out.println("resta = " + resta);

        int multi = i * j;
        System.out.println("multi = " + multi);

        int div = i / j;
        float div2 = i / j;
        float div3 = (float) i / j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);
        System.out.println("div3 = " + div3);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        if(numero % 2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}