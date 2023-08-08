package Ejercicios;

import java.util.Scanner;

public class Tarea7 {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            Scanner s = new Scanner(System.in);
            System.out.println("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = s.nextInt();
        }

        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El número menor es: " + menor);

        if(menor < 10) {
            System.out.println("El número es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }
    }
}
