package Ejercicios;

import java.util.Scanner;

public class Tarea9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        int resultado = 0;

        if (numero2 >= 0) {
            for (int i = 0; i < numero2; i++) {
                resultado += numero1;
            }
        } else {
            for (int i = 0; i > numero2; i--) {
                resultado -= numero1;
            }
        }

        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
