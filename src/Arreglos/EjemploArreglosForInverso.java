package Arreglos;

import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        //String[] productos = new String[7];

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
        /*
        productos[0] = "Kingston Pendrive 64Gb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "MackBook Air";
        productos[5] = "Chromecast 4ta Generacion";
        productos[6] = "Bicicleta Oxfor";
        */

        Arrays.sort(productos);
        System.out.println(" === Usando for === ");
        for (int i = 0; i < total; i++) {
            System.out.println("Para índice " + i + ": " + productos[i]);
        }

        System.out.println(" === Usando for inverso === ");
        for (int i = 0; i < total; i++) {
            System.out.println("para i = " + (total - 1 - i) + " valor: " + productos[total - 1 - i]);
        }

        System.out.println(" === Usando for inverso 2 === ");
        for (int i = total - 1; i >= 0; i--) {
            System.out.println("para i = " + i + " valor: " + productos[i]);
        }
    }
}
