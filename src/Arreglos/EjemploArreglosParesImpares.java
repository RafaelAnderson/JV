package Arreglos;

import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;

        a = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" Numero " + (i + 1) + ": ");
            a[i] = s.nextInt();
        }

        for (int value : a) {
            if (value % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }
        pares = new int[totalPares];
        impares = new int[totalImpares];

        int j = 0;
        int k = 0;

        for (int value : a) {
            if (value % 2 == 0) {
                pares[j++] = value;
            } else {
                impares[k++] = value;
            }
        }

        System.out.print("Pares: ");
        for (int par : pares) {
            System.out.print(par + " ");
        }

        System.out.print("\nImpares: ");
        for (int impar : impares) {
            System.out.print(impar + " ");
        }
    }
}
