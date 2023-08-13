package DateCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'");

        try {
            Date fecha = format.parse(s.next());
            //Date fecha = format.parse("2024-01-21");
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();

            if (fecha.after(fecha2)) {
                System.out.println("Fecha del usuario esta después de la fecha2 (actual)");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha es anterior que la fecha2");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha es igual a fecha2");
            }

            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("Fecha del usuario esta después de la fecha2 (actual)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha es anterior que la fecha2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Fecha es igual a fecha2");
            }
        } catch (ParseException e) {
            //e.printStackTrace();
            System.err.println("La fecha tiene un formato incorrecto: "+ e.getMessage());
            System.err.println("El formato debe ser 'yyyy-MM-dd'");
            //System.exit(1); // Termina el proces
            main(args); // Vuelve a llamar al método
        }
    }
}
