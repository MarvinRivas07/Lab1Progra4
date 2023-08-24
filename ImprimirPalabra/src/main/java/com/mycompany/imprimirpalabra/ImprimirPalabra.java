/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imprimirpalabra;

/**
 *
 * @author Marvin_Rivas
 */
import javax.swing.JOptionPane;
public class ImprimirPalabra {
    public static void main(String[] args) {
        
        String Palabra;
        int numero;
        
      
        Palabra = JOptionPane.showInputDialog("Ingresa una palabra: ");
        numero = (Integer.parseInt (JOptionPane.showInputDialog("Ingrese el numero: ")));
        
        for (int i = 0; i < numero; i++) {
           JOptionPane.showMessageDialog(null, "La palabra se repite, solo presione OK " + " " + "Palabra escrita:" + " "  + Palabra);
        }

        System.exit(0);
    }
}
