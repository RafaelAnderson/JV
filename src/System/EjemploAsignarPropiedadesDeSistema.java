package System;

import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {

    public static void main(String[] args) {
        
        // Crear instancia de una clase de Configuración
        try {
            FileInputStream archivo = new FileInputStream("src/System/config/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Valor guardado");
            System.setProperties(p);

            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));
            ps.list(System.out);
        } catch (Exception ex) {
            System.out.println("no existe el archivo = " + ex);
            System.exit(1);
        }
    }
}