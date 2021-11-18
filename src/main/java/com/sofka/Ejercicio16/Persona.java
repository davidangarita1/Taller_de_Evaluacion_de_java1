package com.sofka.Ejercicio16;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String dni = "";
    private char sexo = 'H';
    private double peso = 0;
    private double altura = 0;
    char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public Persona() {
        this.dni = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double IMC = this.peso / (Math.pow(this.altura, 2));

        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public Boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    private char comprobarSexo(char sexo) {
        if (sexo == 'M') {
            return 'M';
        } else {
            return 'H';
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad + '(' + imprimirMensajeEdad(esMayorDeEdad())+ ')' +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso + '(' + imprimirIMC(calcularIMC()) + ')' +
                ", altura=" + altura +
                '}';
    }

    public String generaDNI() {
        int numeroDNI = (int) (Math.random() * (99999999 - 10000000) + 10000000);
        int indice = numeroDNI % 23;
        char letraDNI = letra[indice];
        String DNI = String.valueOf(numeroDNI) + letraDNI;
        return DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String imprimirIMC(int num) {
        if(num == -1) {
            return "Esta por debajo del peso";
        } else if (num == 0) {
            return "Esta en el peso ideal";
        } else {
            return "Esta por encima del peso. Sobrepeso";
        }
    }

    public String imprimirMensajeEdad(Boolean mayorMenor){
        if(mayorMenor == true) {
            return "Es mayor de edad";
        } else {
            return "Es menor de edad";
        }
    }
}
