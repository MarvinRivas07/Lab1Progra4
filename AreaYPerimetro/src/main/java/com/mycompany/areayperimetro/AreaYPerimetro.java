/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areayperimetro;

/**
 *
 * @author Marvin_Rivas
 */
import javax.swing.JOptionPane;
public class AreaYPerimetro {

    public static void main(String[] args) {
          
        double longitud;
        double ancho;
        
         longitud = Double.parseDouble (JOptionPane.showInputDialog("Ingrese el valor de la base: "));
         ancho = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la altura: "));

        double area = longitud * ancho;
        double perimetro = 2 * (longitud + ancho);

      JOptionPane.showMessageDialog(null, "El valor del area es:: " + " " + area + " " + "El valor del perimetro es:" + " " + perimetro);

        // Cerrar el scanner
        System.exit(0);
    }
}
