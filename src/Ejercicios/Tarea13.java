package Ejercicios;

import java.util.Scanner;

public class Tarea13 {
    // Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
    // Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo,
    // el segundo, el antepenúltimo, el tercero, y así sucesivamente.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números ordenados");
        for (int i = 0; i < numeros.length/2; i++) {
            System.out.println(numeros[numeros.length - i - 1]);
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
