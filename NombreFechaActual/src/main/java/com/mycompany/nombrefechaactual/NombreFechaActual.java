/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nombrefechaactual;

/**
 *
 * @author Marvin_Rivas
 */
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.DateFormat;

public class NombreFechaActual {
    public static void main(String[] args) {
       
        String Nombre;
        String Apellido;
       
        Nombre = JOptionPane.showInputDialog("Ingresa su nombre: ");
        Apellido = JOptionPane.showInputDialog("Ingresa su apellido: ");
        
        Date fechaActual = new Date();
        DateFormat formateadorFechaLarga = DateFormat.getDateInstance(DateFormat.LONG);

  
        JOptionPane.showMessageDialog(null, "Nombre completo: " + Nombre + " " + Apellido + " " + formateadorFechaLarga.format(fechaActual));

        System.exit(0);
    }
}