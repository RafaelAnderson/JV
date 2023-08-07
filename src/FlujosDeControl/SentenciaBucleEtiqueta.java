package FlujosDeControl;

public class SentenciaBucleEtiqueta {
    public static void main(String[] args) {

        bucle1:
        for (int i = 1; i <= 7; i++) {
            int j = 0;
            while (j < 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Día = " + i + ": descanso de fin de semana!");
                    continue bucle1;
                }
                System.out.println("Dia = " + i + ", trabajando a las" + j + "horas. ");
                j++;
            }
        }

        System.out.println("\n=====================================");
        bucle2:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle2;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

        System.out.println("\n=====================================");
        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }
    }
}
