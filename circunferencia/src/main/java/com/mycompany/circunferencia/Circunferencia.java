/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circunferencia;

import javax.swing.JOptionPane;

/**
 *
 * @author Marvin_Rivas
 */
public class Circunferencia {

    public static void main(String[] args) {
        
        double radio;
        radio = Double.parseDouble (JOptionPane.showInputDialog("Ingrese el valor del radio: "));
                
        double area = Math.PI * radio * radio;
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio,3);

       JOptionPane.showMessageDialog(null, "El valor del area es:: " + " " + area + " " + "El valor del volumen es:" + " " + volumen);

        // Cerrar el scanner

        System.exit(0);
    }
}
