package com.sofka.Ejercicio14;

import javax.swing.*;

public class Main {

    /*Crear un programa que pida un numero por teclado y que imprima por pantalla
    los números desde el numero introducido hasta 1000 con saldos de 2 en 2.*/

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int lim = 1000;

        for (int i = num; i <= lim;) {
            System.out.println(i);
            i = i + 2;
        }
    }
}
