package Operadores;

public class OperadoresIncrementales {

    public static void main(String[] args) {
        
        // Pre incremento
        int i = 1;
        int j = ++i; // i = i + 1

        System.out.println("Pre incremento");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // Post incremento
        System.out.println("Post incremento");
        i = 2;
        System.out.println("i = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // Pre decremento
        System.out.println("Pre decremento");
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post decremento
        System.out.println("Post incremento");
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(j) = " + (++j));
        System.out.println("(j) = " + (j++));
        System.out.println("(j) = " + j);
    }
}
