package Ejercicios;

import java.util.Scanner;

public class Tarea14 {
    // Escriba un programa que imprima el número más alto de un arreglo de 7 elementos
    // (de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un
    // valor considerar uno solo.
    public static void main(String[] args) {

        int[] arreglo = new int[7];
        int numero, mayor;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {
            do {
                System.out.print("Ingresa un número entero (11 a 99) arreglo[" + i + "]: ");
                numero = s.nextInt();
            } while (numero < 11 || numero > 99);
            arreglo[i] = numero;
        }
        mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if(arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }

        System.out.println("Número mayor: " + mayor);
        s.close();
    }
}
