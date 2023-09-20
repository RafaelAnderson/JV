package Ejercicios;

import java.util.Scanner;

public class Tarea15 {
    // Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio
    // de los números positivos, el promedio de los negativos y contar el número de ceros.
    public static void main(String[] args) {

        int[] arreglo = new int[7];
        int numero;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingresa un número entero arreglo[" + i + "]: ");
            arreglo[i] = s.nextInt();
        }

        double sumatoriaPositivos = 0, contadorPositivos = 0;
        double sumatoriaNegativos = 0, contadorNegativos = 0;
        int contadorCeros = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > 0) {
                sumatoriaPositivos += arreglo[i];
                contadorPositivos++;
            } else if (arreglo[i] == 0) {
                contadorCeros++;
            } else if (arreglo[i] < 0) {
                sumatoriaNegativos += arreglo[i];
                contadorNegativos++;
            }
        }

        System.out.println("Promedio números positivos: " + (sumatoriaPositivos / contadorPositivos));
        System.out.println("Promedio números negativos: " + (sumatoriaNegativos / contadorNegativos));
        System.out.println("Contador de ceros: " + contadorCeros);
        s.close();
    }
}
