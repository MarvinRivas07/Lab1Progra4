/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author Marvin_Rivas
 */
import javax.swing.JOptionPane;
public class Calculadora {

    public static void main(String[] args) {
        
        String primerNumero;
        String segundoNumero;
       
        
        int num1;
        int num2;
        int suma;
        int resta;
        int multiplicacion;
        int division;
        
        primerNumero = JOptionPane.showInputDialog("Ingrese un numero: ");
        segundoNumero = JOptionPane.showInputDialog("Ingrese el segundo numero: ");
        
        num1 = Integer.parseInt(primerNumero);
        num2 = Integer.parseInt(segundoNumero);
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        
       
        if (num2 !=0) {
        division = num1/num2;
        JOptionPane.showMessageDialog(null, "La suma es: " + " "+ suma + " " + "La resta es:" + " " + resta
        + " " + "La multiplicacion es:" + " " + multiplicacion + " " + "La division es:" + " " + division );
        }else{
            JOptionPane.showMessageDialog(null, "La suma es: " + " "+ suma + " " + "La resta es:" + " " + resta
        + " " + "La multiplicacion es:" + " " + multiplicacion + " " + "La division es:" + " " + "No se puede dividir entre 0" );
        }
    
    
    }
}
