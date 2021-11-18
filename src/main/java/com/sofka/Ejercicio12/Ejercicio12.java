package com.sofka.Ejercicio12;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio12 {

    /*Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.*/

    public static void diferencias(String palabra1, String palabra2) {
        StringBuilder s = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for(char c : palabra2.toCharArray())
            set.add(c);
        for(char c : palabra1.toCharArray())
        {
            if(!set.contains(c))
                s.append(c);
        }
        System.out.println("Las diferencias son: "+s);
    }

    public static void main(String[] args) {
        String pal1 = JOptionPane.showInputDialog("Ingrese una palabra").toLowerCase();
        String pal2 = JOptionPane.showInputDialog("Ingrese otra palabra").toLowerCase();
        char[] p1 = pal1.toCharArray();
        char[] p2 = pal2.toCharArray();

        if(p1.length >= p2.length) {
            diferencias(pal1, pal2);
        } else if (p1.length < p2.length) {
            diferencias(pal2, pal1);
        }
    }
}
