package FlujosDeControl;

public class SentenciaBucleEtiquetaBuscar {
    public static void main(String[] args) {

        String frase = "Tres tristes tigres tragan trigo de un trigal trigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        int cantidad = 0;

        buscar:
        for (int i = 0; i <= maxFrase;) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }

        System.out.println("Encontrado " + cantidad + " veces la palabra '" + palabra + "' en la frase");
    }
}
