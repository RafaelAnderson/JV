package Ejercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tarea11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Ingrese fecha de nacimiento 'dd/MM/yyyy': ");

        try {
            Date fecha = format.parse(s.next());
            Date fechaActual = new Date();

            if(fecha.before(fechaActual)){

                long diasDiferencia = fechaActual.getTime() - fecha.getTime();
                long anios = diasDiferencia / (1000L * 60 * 60 * 24 * 365);

                System.out.println("Su edad actual es: " + anios + " años");
            } else {
                System.out.println("Fecha incorrecta");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
