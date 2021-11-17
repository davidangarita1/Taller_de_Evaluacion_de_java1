package com.sofka.Ejercicio3;

import javax.swing.*;

public class Ejercicio3 {
//    Haz una aplicación que calcule el área de un círculo(pi*R2).
//    El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
//    Usa la constante PI y el método pow de Math.

    public static void main(String[] args) {
        double PI = Math.PI;
        double area;
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));

        area = PI * Math.pow(radio,2);

        System.out.println("El area del circulo es: "+area);
    }
}
