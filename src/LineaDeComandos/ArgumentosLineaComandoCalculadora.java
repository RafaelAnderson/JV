package LineaDeComandos;

public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Ingresar operación (suma, resta, multi, div) y 2 enteros");
            System.exit(-1);
        }

        String operacion = args[0];

        int a = 0, b = 0;
        double resultado = 0.00;

        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e){
            System.out.println("a y b deben ser enteros");
            System.exit(-1);
        }

        switch (operacion) {
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multi":
                resultado = a * b;
                break;
            case "div":
                if (b == 0) {
                    System.out.println("No se puede dividir por 0");
                    System.exit(-1);
                }
                resultado = (double) a / b;
                break;
            default:
                resultado = a + b;
        }

        System.out.println("Resultado de la operación '" + operacion + "' es: " + resultado);

        //javac ArgumentosLineaComandoCalculadora.java -encoding utf8
        //javac ArgumentosLineaComandoCalculadora.java -encoding utf8
    }
}
