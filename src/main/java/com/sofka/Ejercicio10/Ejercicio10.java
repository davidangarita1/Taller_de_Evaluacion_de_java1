package com.sofka.Ejercicio10;

import javax.swing.*;

public class Ejercicio10 {
    /*Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.*/
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese una frase cualquiera");

        texto = texto.replace(" ", "");

        System.out.println(texto);
    }
}
