package com.sofka.Ejercicio15;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Boolean preguntar;
        int opcion;
        preguntar = true;

        while (preguntar == true) {
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                            "Elige opcion:" +
                                    "\n****** GESTION CINEMATOGRAFICA ********" +
                                    "\n1- NUEVO ACTOR" +
                                    "\n2- BUSCAR ACTOR" +
                                    "\n3- ELIMINAR ACTOR" +
                                    "\n4- MODIFICAR ACTOR" +
                                    "\n5- VER TODOS LOS ACTORES" +
                                    "\n6- VER PELICULAS DE LOS ACTORES" +
                                    "\n7- VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES" +
                                    "\n8- Salir"
                    ));

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    preguntar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                    break;
            }
        }
    }

}
