package com.sofka.Ejercicio11;

import javax.swing.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese una frase cualquiera");
        int nVocales = 0;
        int a=0,e=0,i=0,o=0,u=0;
        int longitud = texto.length();

        for (int x = 0; x < texto.length(); x++) {
            switch (texto.charAt(x)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("La longitud de la frase es: " + longitud);
        System.out.println("La frase '"+texto+"' contiene a="+a+", e="+e+", i="+i+", o="+o+", u= "+u+".");
    }
}
