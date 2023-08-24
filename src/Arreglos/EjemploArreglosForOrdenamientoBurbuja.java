package Arreglos;

import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {
    public static void arregloInverso(String[] arreglo) {
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void sortBurbuja(Object[] arreglo) {
        int total = arreglo.length;
        int contador = 0;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
            contador++;
        }
        System.out.println("contador = " + contador);
    }

    public static void main(String[] args) {

        String[] productos = {
                "Kingston Pendrive 64Gb",
                "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook",
                "MackBook Air",
                "Chromecast 4ta Generacion",
                "Bicicleta Oxfor"
        };

        int total = productos.length;

        // Metodo 1
        sortBurbuja(productos);

        // Metodo 2 - Optimizado

        int contador = 0;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

        System.out.println(" === Usando for === ");
        for (int i = 0; i < total; i++) {
            System.out.println("Para índice " + i + ": " + productos[i]);
        }

        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("i = " + i + " : " + numeros[i]);
        }
    }
}
