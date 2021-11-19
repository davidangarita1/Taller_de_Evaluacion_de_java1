package com.sofka.Ejercicio8;

import javax.swing.*;

public class Main {

    /*Crea una aplicación por consola que nos pida un día de la semana
    y que nos diga si es un día laboral o no. Usa un switch para ello.*/

    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog("Ingrese el nombre de un dia de la semana");
        dia = dia.toLowerCase();

        switch (dia) {
            case "lunes":
                System.out.println("Es un dia Laboral");
                break;
            case "martes":
                System.out.println("Es un dia Laboral");
                break;
            case "miercoles":
                System.out.println("Es un dia Laboral");
                break;
            case "jueves":
                System.out.println("Es un dia Laboral");
                break;
            case "viernes":
                System.out.println("Es un dia Laboral");
                break;
            case "sabado":
                System.out.println("No es un dia Laboral");
                break;
            case "domingo":
                System.out.println("No es un dia Laboral");
                break;
            default:
                System.out.println("No es una opción valida");
                break;
        }
    }
}
