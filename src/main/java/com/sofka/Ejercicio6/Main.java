package com.sofka.Ejercicio6;

public class Main {
    /*Realiza el ejercicio anterior usando un ciclo for.*/
    public static void main(String[] args) {
        int limit = 100;

        for(int i = 1;i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Es par");
            } else if (i %2 != 0) {
                System.out.println(i + " Es impar");
            }
        }
    }
}
