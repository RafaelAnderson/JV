package Ejercicios;

import java.util.Scanner;

public class Tarea12 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double radio;

        do {
            System.out.print("Ingrese el radio del círculo: ");
            radio = s.nextDouble();
        } while (radio <= 0);

        s.close();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es " + area);
    }
}
