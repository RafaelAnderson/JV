package DateCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();
        calendario.set(2023, 0, 21, 3, 22, 25);
        System.out.println("calendario = " + calendario);

        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);

        System.out.println("\n//----------------\n");

        Calendar calendario2 = Calendar.getInstance();
        calendario2.set(Calendar.YEAR, 2024);
        calendario2.set(Calendar.MONTH, Calendar.JANUARY);
        calendario2.set(Calendar.DAY_OF_MONTH, 21);

        //calendario2.set(Calendar.HOUR_OF_DAY, 17);
        calendario2.set(Calendar.HOUR, 5);
        calendario2.set(Calendar.AM_PM, Calendar.PM);
        calendario2.set(Calendar.MINUTE, 23);
        calendario2.set(Calendar.SECOND, 18);
        calendario2.set(Calendar.MILLISECOND, 125);

        System.out.println("calendario2 = " + calendario2);

        Date fecha2 = calendario2.getTime();
        System.out.println("fecha sin formato: " + fecha2);

        // Formato 24 horas HH, "a" para a.m. y p.m.
        //SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");

        // Formato 12 horas hh, "a" para a.m. y p.m.
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha2);
        System.out.println("fecha con formato: " + fechaConFormato);

        Calendar calActual = Calendar.getInstance();
        Date fecha3 = calActual.getTime();
        System.out.println("fecha3 = " + fecha3);
    }
}
