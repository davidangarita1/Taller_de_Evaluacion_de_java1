package com.sofka.Ejercicio16;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Persona " + i);
                String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu edad"));
                char sexo = JOptionPane.showInputDialog("Escribe tu sexo ('H' para hombre y 'M' para mujer:)").toUpperCase().charAt(0);
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Escribe tu peso en kg:"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Escribe tu altura en metros:"));

                if(i == 1){
                    Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
                    System.out.println(p1.imprimirMensajeEdad(p1.esMayorDeEdad()));
                    System.out.println(p1.imprimirIMC(p1.calcularIMC()));
                    System.out.println(p1.toString());
                } else if (i == 2) {
                    Persona p2 = new Persona(nombre, edad, sexo);
                    p2.setAltura(altura);
                    p2.setPeso(peso);
                    System.out.println(p2.imprimirMensajeEdad(p2.esMayorDeEdad()));
                    System.out.println(p2.imprimirIMC(p2.calcularIMC()));
                    System.out.println(p2.toString());
                } else {
                    Persona p3 = new Persona();
                    p3.setNombre(nombre);
                    p3.setEdad(edad);
                    p3.setSexo(sexo);
                    p3.setPeso(peso);
                    p3.setAltura(altura);
                    System.out.println(p3.imprimirMensajeEdad(p3.esMayorDeEdad()));
                    System.out.println(p3.imprimirIMC(p3.calcularIMC()));
                    System.out.println(p3.toString());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
