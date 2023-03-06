package Ejercicios;

import javax.swing.*;

public class Tarea6 {
    public static void main(String[] args) {
        String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de la primera persona:");
        String persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de la segunda persona:");
        String persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de la tercera persona:");

        String nombre = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
        nombre = (persona3.split(" ")[0].length() < nombre.split(" ")[0].length()) ? nombre : persona3;

        System.out.println(nombre + " tienen el nombre más largo.");
    }
}
