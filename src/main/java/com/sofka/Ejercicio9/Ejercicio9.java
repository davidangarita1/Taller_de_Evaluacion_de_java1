package com.sofka.Ejercicio9;

import javax.swing.*;

public class Ejercicio9 {

    /*Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza
    todas las a del String anterior por una e, adicionalmente concatenar a esta
    frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.*/

    public static void main(String[] args) {
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        String propia = JOptionPane.showInputDialog("Ingrese una frase cualquiera");

        texto = texto.replace('a', 'e');

        System.out.println(texto + " - " + propia);
    }
}
