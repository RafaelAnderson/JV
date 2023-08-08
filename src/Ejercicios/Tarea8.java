package Ejercicios;

import java.util.Scanner;

public class Tarea8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cantidadNotas = 20;
        double sumaNotasMayoresA5 = 0;
        int cantidadNotasMayoresA5 = 0;
        double sumaNotasMenoresA4 = 0;
        int cantidadNotasMenoresA4 = 0;
        int cantidadNotas1 = 0;
        double sumaTotal = 0;
        boolean error = false;

        bucle:
        for (int i = 0; i < cantidadNotas; i++) {
            double nota;
            do {
                System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
                nota = scanner.nextDouble();

                if (nota == 0) {
                    error = true;
                    break bucle;
                }

            } while (nota < 1 || nota > 7);

            sumaTotal += nota;

            if (nota > 5) {
                sumaNotasMayoresA5 += nota;
                cantidadNotasMayoresA5++;
            } else if (nota < 4) {
                sumaNotasMenoresA4 += nota;
                cantidadNotasMenoresA4++;
            }

            if (nota == 1) {
                cantidadNotas1++;
            }
        }

        scanner.close();

        if(error) {
            System.out.println("Error");
        } else {
            double promedioMayoresA5 = 0;
            double promedioMenoresA4 = 0;

            if(cantidadNotasMayoresA5 != 0){
                promedioMayoresA5 = sumaNotasMayoresA5 / cantidadNotasMayoresA5;
            }

            if(cantidadNotasMenoresA4 != 0) {
                promedioMenoresA4 = sumaNotasMenoresA4 / cantidadNotasMenoresA4;
            }

            double promedioTotal = sumaTotal / cantidadNotas;

            System.out.println("Promedio de notas mayores a 5: " + promedioMayoresA5);
            System.out.println("Promedio de notas menores a 4: " + promedioMenoresA4);
            System.out.println("Cantidad de notas igual a 1: " + cantidadNotas1);
            System.out.println("Promedio total de las 20 notas: " + promedioTotal);
        }
    }
}
