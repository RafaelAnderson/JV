public class ConversionDeTipos {

    public static void main(String[] args) {
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "98765.43e-3"; // Notación científica
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "true";
        boolean logicBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicBoolean = " + logicBoolean);
        
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroIntStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 10); // valueOf realiza la conversión
        //otroNumeroStr = String.valueOf(otroNumeroStr + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        /*** Conversiones entre tipos primitivos ***/
        int i = 10000;
        short s = (short) i; // Forzar conversión
        System.out.println("s = " + s);
        
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE); // Máximo valor soportado por una variable short
        
        char b = (char) i;
        System.out.println("b = " + b);
        
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
