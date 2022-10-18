package Operadores;

public class OperadorInstanceOfTiposGenericos {

    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String!";

        // new es Deprecated
        Number num = Integer.valueOf(7); // 7

        // boolean: primitivo
        // Boolean: referencia
        
        Boolean b1 = texto instanceof String; // Object clase padre de todas las clases y objetos

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);
        
        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);
        
        b1 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);
        
        Number decimal = 45.54f;
        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer = " + b1);
    }
}