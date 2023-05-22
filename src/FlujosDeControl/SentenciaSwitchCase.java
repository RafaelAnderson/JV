package FlujosDeControl;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        char num = 'a';
        switch (num){
            case '0':
                System.out.println("El num es cero");
                break;
            case '1':
                System.out.println("El num es uno");
                break;
            case '2':
                System.out.println("El num es dos");
                break;
            case '3':
                System.out.println("El num es tres");
                break;
            case 'a':
                System.out.println("El caracter es a");
                break;
            default:
                System.out.println("Numero o caracter desconocido");
                break;
        }

        String nombre = "Rafael";

        switch (nombre) {
            case "admin":
                System.out.println("Hola admin");
                break;
            case "Rafael":
                System.out.println("Hola Rafael");
                break;
            default:
                System.out.println("Usuario desconocido");
                break;
        }
    }
}
