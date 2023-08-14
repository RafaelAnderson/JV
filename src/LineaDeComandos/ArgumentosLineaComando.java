package LineaDeComandos;

public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Debe ingresar argumentos o parámetros");
            System.exit(-1); // Error
        }

        for (int i = 0; i< args.length; i++) {
            System.out.println("Argumentos n° " + i + ": " + args[i]);
        }

        // EN CONSOLA:

        // Crear compilador:
        // javac ArgumentosLineaComando.java -encoding utf8

        // Ejecutar
        // Entrar carpeta src
        // java -cp . LineaDeComandos.ArgumentosLineaComando Rafael Anderson "Hola Mundo"
    }
}
