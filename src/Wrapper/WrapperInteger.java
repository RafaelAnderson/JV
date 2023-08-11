package Wrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intObjeto1 = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto1 = " + intObjeto1);
        
        int num1 = intObjeto1; // Forma implicita
        System.out.println("num1 = " + num1);
        int num2 = intObjeto2.intValue(); // Forma explicita
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        // Pérdida de información
        Short shortObject = intObjeto1.shortValue();
        System.out.println("shortObject = " + shortObject);

        // Pérdida de información
        Byte byteObjeto = intObjeto1.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);
        
        Long longObject = intObjeto1.longValue();
        System.out.println("longObject = " + longObject);
    }
}
