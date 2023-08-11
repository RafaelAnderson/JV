package Wrapper;

public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1; // Forma Implícita
        num2 = 2;
        
        boolean primBoolean = num1 > num2;
        Boolean objBoolean1 = false; // Forma Implícita
        Boolean objBoolean2 = Boolean.valueOf("false"); // Forma Explícita
        Boolean objBoolean3 = Boolean.valueOf(primBoolean);

        System.out.println("objBoolean1 = " + objBoolean1);
        System.out.println("objBoolean2 = " + objBoolean2);
        System.out.println("objBoolean3 = " + objBoolean3);

        System.out.println("Comparando 2 objetos boolean: " + (objBoolean2 == objBoolean3));
        System.out.println("Comparando 2 objetos boolean: " + (objBoolean2.equals(objBoolean3)));
        System.out.println("Comparando 2 objetos boolean: " + (objBoolean1 == objBoolean2));
        System.out.println("Comparando 2 objetos boolean: " + (objBoolean1 == objBoolean3));

        boolean primBoolean2 = objBoolean2.booleanValue(); // Se obtiene el valor primitivo
        System.out.println("primBoolean2 = " + primBoolean2);
    }
}
