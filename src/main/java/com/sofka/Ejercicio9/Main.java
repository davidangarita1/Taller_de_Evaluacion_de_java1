package com.sofka.Ejercicio9;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        String propia = JOptionPane.showInputDialog("Ingrese una frase cualquiera");

        texto = texto.replace('a', 'e');

        System.out.println(texto + " - " + propia);
    }
}
