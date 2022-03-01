package Factura;

import java.util.Scanner;

public class DetalleFactura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombreFactura;
        System.out.print("Ingresa el nombre de la factura: ");
        nombreFactura = sc.nextLine();

        double Producto1;
        System.out.print("Ingresa el precio del Producto 1: ");
        Producto1 = sc.nextDouble();

        double Producto2;
        System.out.print("Ingresa el precio del Producto 2: ");
        Producto2 = sc.nextDouble();

        double Precio = Producto1 + Producto2;
        double Impuesto = (Precio * 19)/100;
        double PrecioTotal = Precio + Impuesto;

        System.out.print("La factura " + nombreFactura + " tiene un total bruto de " + Precio + " con un impuesto de " + Impuesto + " y el monto después de impuesto es de " + PrecioTotal);
    }
}
