package Ejercicios;

import java.util.Scanner;

public class Tarea16 {
    // Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
    // Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y
    // también imprimir la cantidad de veces que aparece en el arreglo.

    public static void main(String[] args) {

        int[] arreglo = new int[10];
        int numero;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingresa un número entero arreglo[" + i + "]: ");
            arreglo[i] = s.nextInt();
        }

        int ocurrencia = 0, ocurrenciaAux = 0;
        int elementoRepetido = 0, elementoRepetidoAux = 0;

        for (int i = 0; i < arreglo.length; i++) {
            ocurrenciaAux = 1;
            elementoRepetidoAux = arreglo[i];
            for (int j = 0; j < arreglo.length; j++) {
                if(i != j) {
                    if(arreglo[i] == arreglo[j]) {
                        ocurrenciaAux++;
                    }
                }
            }
            if(ocurrenciaAux > ocurrencia) {
                ocurrencia = ocurrenciaAux;
                elementoRepetido = elementoRepetidoAux;
            }
        }

        System.out.println("La mayor ocurrencia es: " + ocurrencia);
        System.out.println("El elemento que más se repite es: " + elementoRepetido);
        s.close();
    }
}
