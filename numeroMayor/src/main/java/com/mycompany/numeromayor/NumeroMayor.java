/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeromayor;

/**
 *
 * @author Marvin_Rivas
 */
import javax.swing.JOptionPane;
public class NumeroMayor {

    public static void main(String[] args) {
     
        int numero1;
        int numero2;
        int numero3;
        
        numero1 = (Integer.parseInt (JOptionPane.showInputDialog("Ingrese el primer numero: ")));
        numero2 = (Integer.parseInt (JOptionPane.showInputDialog("Ingrese el segundo numero: ")));
        numero3 = (Integer.parseInt (JOptionPane.showInputDialog("Ingrese el tercer numero: ")));
        

        int mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }

        if (numero3 > mayor) {
            mayor = numero3;
        }

       JOptionPane.showMessageDialog(null, "El numero mayor es: " + " " + mayor);

       
    
    }
}
