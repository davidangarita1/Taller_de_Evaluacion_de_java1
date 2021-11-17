package com.sofka.Ejercicio5;

public class Ejercicio5 {
    /*Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.*/
    public static void main(String[] args) {
        int cont = 1;
        int limit = 100;

        while (cont <= limit) {
            if (cont % 2 == 0) {
                System.out.println(cont + " Es par");
            } else if (cont %2 != 0) {
                System.out.println(cont + " Es impar");
            }
            cont++;
        }
    }
}
