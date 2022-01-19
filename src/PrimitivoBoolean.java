public class PrimitivoBoolean {
    public static void main(String[] args) {

        boolean datoLogico = true; // Primitivo
        // boolean dataLogico = Boolean.TRUE;

        System.out.println("datoLogico = " + datoLogico);
        
        double d = 98765.43E-3; // 98.76543
        System.out.println("d = " + d);
        
        float f = 1.2345E2f; // 123.45
        System.out.println("f = " + f);

        datoLogico = d > f; // false
        System.out.println("datoLogico = " + datoLogico);
        
        boolean esIgual = (3-2 == 1); // == es para comparar una expresion
        System.out.println("esIgual = " + esIgual);
    }
}
