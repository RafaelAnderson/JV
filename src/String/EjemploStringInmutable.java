package String;

public class EjemploStringInmutable {

    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Rafael";

        String resultado = curso.concat(" ".concat(profesor));
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado); // Indica si variable resultado cambia su valor

        String resultado2 = curso.transform((c) -> {
            return c + " con " + profesor;
        });

        System.out.println("curso = " + curso); // Curso se mantiene inmutable
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a", "A");

        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }
}
