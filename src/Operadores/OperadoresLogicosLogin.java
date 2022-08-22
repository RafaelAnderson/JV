package Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {

    public static void main(String[] args) {

        /* String[] usernames = new String[2];
        String[] passwords = new String[2];

        usernames[0] = "Rafael";
        passwords[0] = "123456";

        usernames[1] = "admin";
        passwords[1] = "123456";*/

        String[] usernames = {"Rafael", "admin", "Anderson"};
        String[] passwords = {"123456", "123456", "123456"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.nextLine();

        System.out.println("Ingrese el password");
        String p = scanner.nextLine();

        boolean isAuthenticate = false;

        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(u) && passwords[i].equals(p)) {
                isAuthenticate = true;
                break;
            }
        }

        if (isAuthenticate) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Username o contraseña incorrecta");
            System.out.println("Necesita autenticación");
        }
    }
}
