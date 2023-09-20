package Ejercicios;

import java.util.Scanner;

public class Tarea17 {
    // Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.
    // El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
    // Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece
    // en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6,
    // incluso si no están presente en el arreglo.

    public static void main(String[] args) {

        int[] arreglo = new int[12];
        int numero;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {
            do {
                System.out.print("Ingresa un número entero (1 a 6) arreglo[" + i + "]: ");
                numero = s.nextInt();
            } while (numero < 1 || numero > 6);
            arreglo[i] = numero;
        }

        for (int i = 1; i <= 6; i++) {
            System.out.print(i+ ": ");
            for (int j = 0; j <arreglo.length; j++) {
                if(arreglo[j] == i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
