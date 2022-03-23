package String;

public class EjemploStringExtensionArchivo {

    public static void main(String[] args) {

        String archivo = "alguna_imagen.jpeg";

        System.out.println("archivo.length() = " + archivo.length());
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));
    }
}
