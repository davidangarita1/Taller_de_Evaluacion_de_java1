package com.sofka.Ejercicio7;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            int num;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero mayor o igual a cero"));
            if (num < 0){
                System.out.println(num+" es menor que 0 vuelve a intentar");
            } else if (num == 0){
                System.out.println("El numero es 0");
            } else if (num > 0) {
                System.out.println(num+" es mayor que 0");
            }
        } while (num < 0);
    }
}
