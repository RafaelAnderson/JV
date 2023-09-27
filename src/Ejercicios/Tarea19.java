package Ejercicios;

import java.util.Scanner;

public class Tarea19 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int base = 0;

        do {
            System.out.print("Ingrese el tamaño de la base: ");
            base = s.nextInt();
        } while (base < 0);

        if (base == 0) {
            System.out.println("Error");
        }

        for (int i = 0; i < base; i++) {
            for (int j = 0; j < base; j++) {
                if (j == 0 || i == base / 2 || i > base / 2 && j == base - 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        s.close();
    }
}
