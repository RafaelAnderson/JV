package Ejercicios;

import java.util.Scanner;

public class Tarea4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingresar numero 2: ");
        int num2 = scanner.nextInt();

        String resultado = (num1 > num2) ? num1 + ", " + num2 : num2 + ", " + num1;

        System.out.println("El orden es: " + resultado);
    }
}
