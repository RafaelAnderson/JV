package Ejercicios;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {
        /*
        La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
        Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
        Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le
        concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
        Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa nombre 1: ");
        String primero = scanner.next();
        String nombre1 = primero.toUpperCase().charAt(1) + "." + primero.substring(primero.length()-2);
        System.out.print("Ingresa nombre 2: ");
        String segundo = scanner.next();
        String nombre2 = segundo.toUpperCase().charAt(1) + "." + segundo.substring(segundo.length()-2);
        System.out.print("Ingresa nombre 3: ");
        String tercero = scanner.next();
        String nombre3 = tercero.toUpperCase().charAt(1) + "." + tercero.substring(tercero.length()-2);

        String sep = "_";

        System.out.println((nombre1+sep+nombre2+sep+nombre3).trim());
    }
}
