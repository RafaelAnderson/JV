package String;

import java.util.Locale;

public class EjemploValidarString {

    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso = "Programación JAVA";
        }
        
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);
        
        // Valida vacíos
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(!esBlanco){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
            System.out.println(curso.concat(" desde cero!"));
        }
    }
}
