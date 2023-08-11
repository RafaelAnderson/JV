package Wrapper;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000); // Forma Implícita
        Integer num2 = num1;

        // Objetos
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        num2 = 1000;

        // Mismo valor, distinta instancia
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));
        System.out.println("Tiene el mismo valor? " + (num1.equals(num2)));
        System.out.println("Tiene el mismo valor? " + (num1.intValue() == num2.intValue())); // Compara la instacia

        // Autoboxing: Se empaqueta un primitivo y se convierte a una clase Wrapper
        // Autounboxing: Desenpaqueta una referencia y la convierte a valor primitivo

        num2 = 500;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() > num2.intValue();
        System.out.println("condicion2 = " + condicion2);

        // > y < en tipos de referencia o Wrapper
    }
}
