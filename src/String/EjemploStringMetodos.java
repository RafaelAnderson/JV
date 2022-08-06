package String;

public class EjemploStringMetodos {

    public static void main(String[] args) {

        String nombre = "Rafael";

        System.out.println("nombre.lenght() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Rafael\") = " + nombre.equals("Rafael"));
        System.out.println("nombre.equals(\"rafael\") = " + nombre.equals("rafael"));
        System.out.println("nombre.equalsIgnoreCase(\"rafael\") = " + nombre.equalsIgnoreCase("rafael"));
        System.out.println("nombre.compareTo(\"Rafael\") = " + nombre.compareTo("Rafael"));
        System.out.println("nombre.compareTo(\"Anderson\") = " + nombre.compareTo("Anderson"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));;
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(4, 6) = " + nombre.substring(4, 6));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));

        /* Segunda parte */
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas.indexOf(\"f\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.indexOf(\"z\") = " + trabalenguas.indexOf("z"));
        System.out.println("trabalenguas.contains(\"a\") = " + trabalenguas.contains("a"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());
    }
}
