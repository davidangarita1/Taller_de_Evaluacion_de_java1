package com.sofka.Ejercicio4;

import javax.swing.*;

public class Ejercicio4 {
    /*Lee un número por teclado que pida el precio de un producto (puede tener decimales)
    y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.*/

    public static void main(String[] args) {
        double IVA = 0.21;
        double precioFinal;
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));

        precioFinal = precio + (precio * IVA);

        System.out.println("$" + precioFinal);
    }
}
