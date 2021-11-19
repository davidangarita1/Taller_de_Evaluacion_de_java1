package com.sofka.Ejercicio18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Serie> listaSeries = new ArrayList<>();
        List<Videojuego> listaVideojuegos = new ArrayList<>();

        int contadorSeries = 0;
        int contadorVideojuegos = 0;

        listaSeries.add(new Serie()); // Default
        listaSeries.add(new Serie("Game of Thrones","Martin"));
        listaSeries.add(new Serie("Mr. Robot",4,"Cienca Ficción","Sam Esmail"));
        listaSeries.add(new Serie("Dragon Ball Z",3,"Shounen","Akira Toriyama"));
        listaSeries.add(new Serie("Death Note",1,"Seinen","Tsugumi Oba"));

        listaVideojuegos.add(new Videojuego()); // Default
        listaVideojuegos.add(new Videojuego("Resident Evil 4",8));
        listaVideojuegos.add(new Videojuego("Dead or Alive",12,"Lucha","Koei Tecmo"));
        listaVideojuegos.add(new Videojuego("Sonic",9,"Aventura","Sega"));
        listaVideojuegos.add(new Videojuego("Final Fantasy VIII", 18,"RPG","Square Enix"));

        listaSeries.get(3).entregar();
        listaSeries.get(1).entregar();
        listaVideojuegos.get(3).entregar();
        listaVideojuegos.get(4).entregar();


        for (Serie s : listaSeries) {
            if(s.isEntregado()==true){
                contadorSeries+=1;
                s.devolver();
            }
        }

        for (Videojuego vj : listaVideojuegos) {
            if(vj.isEntregado()==true){
                contadorVideojuegos+=1;
                vj.devolver();
            }
        }
        System.out.println("Total de series entregadas: " + contadorSeries);
        System.out.println("Total de videojuegos entregadas: " + contadorVideojuegos);
        System.out.println("La serie con mas temporadas es: "+listaSeries.stream().sorted((x, y) -> y.compareTo(x)).findFirst().toString().replace("Optional[","").replace("]",""));
        System.out.println("El videojuego con mas horas es: "+listaVideojuegos.stream().sorted((x, y) -> y.compareTo(x)).findFirst().toString().replace("Optional[","").replace("]",""));
    }
}
