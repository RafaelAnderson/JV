package Ejercicios;

import java.util.Scanner;

public class Tarea18 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int base;

        do {
            System.out.print("Ingrese el tamaño de la base: ");
            base = s.nextInt();
        } while (base < 0);

        if (base == 0) {
            System.out.println("Error");
        }

        for (int i = 0; i < base; i++) {
            for (int j = 0; j < base; j++) {
                if (i == j || i + j == base - 1) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
        s.close();
    }
}
