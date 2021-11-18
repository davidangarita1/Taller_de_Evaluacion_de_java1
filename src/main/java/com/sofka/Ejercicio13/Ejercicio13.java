package com.sofka.Ejercicio13;

import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio13 {

    /*Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)*/

    public static void obtenerFechaHoraActual() throws ParseException {
        Date fechaActual = Calendar.getInstance().getTime();
        DateFormat formateador = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String fechaString = formateador.format(fechaActual);
        System.out.println(fechaString);
    }

    public static void main(String[] args) throws ParseException {
        int ventanaEmergente = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog (null, "Te gustaria consultar la Fecha y Hora Actual","Alerta",ventanaEmergente);

        if (ventanaEmergente == JOptionPane.YES_OPTION) {
            obtenerFechaHoraActual();
        }

    }
}
