package com.sofka.Ejercicio1;
import javax.swing.*;

public class Ejercicio1 {
    /*
    Declara 2 variables numéricas (con el valor que desees),
    he indica cual es mayor de los dos. Si son iguales indicarlo
    también. Ve cambiando los valores para comprobar que funciona.
     */
    public static void main(String[] args) {
       int num1 = 2;
       int num2 = 3;

       if (num1 > num2) {
           System.out.println("El numero "+num1+" es mayor que "+num2);
       } else if (num1 < num2) {
           System.out.println("El numero "+num1+" es menor que "+num2);
       } else if (num1 == num2) {
           System.out.println("Los numeros son iguales");
       }
    }
}
