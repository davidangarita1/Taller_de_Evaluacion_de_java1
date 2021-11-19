package com.sofka.Ejercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));

        if (num1 > num2) {
            System.out.println("El numero "+num1+" es mayor que "+num2);
        } else if (num1 < num2) {
            System.out.println("El numero "+num1+" es menor que "+num2);
        } else if (num1 == num2) {
            System.out.println("Los numeros son iguales");
        }
    }
}
