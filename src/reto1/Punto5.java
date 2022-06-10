/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto1;

import javax.swing.JOptionPane;

/**
 *Estructura de datos 
 *Autor juan esteban gomez pachon 
 *Reto 1
 * 
 */
public class Punto5 {
    
 // Desarrolle un algoritmo que permita leer dos números y ordenarlos de menor a mayor, si
//es el caso. Luego debe realiza la impresión en pantalla del resultado.
    
    public static void main (String []args){
        //se incializan la variable numero1,  numero2
        int  numero1 =0;
        int  numero2 =0;
        // se le pide al usuario que ingrese dos numero de tipo entero     
       numero1= (Integer.parseInt(JOptionPane.showInputDialog(null, " por favor digite su primer numero  ")));
       numero2= (Integer.parseInt(JOptionPane.showInputDialog(null, " por favor digite su segundo numero ")));
       
       // se le agrega una condicion para determinar si el  primer numero o el segundo es mayor o menor 
       if (numero1 > numero2){
           
           JOptionPane.showMessageDialog(null, "el mayor es :"+numero1);
           JOptionPane.showMessageDialog(null, "el menor  es :"+numero2); 
           
       }
       // se hace el mismo porceso pero en este caso es al contrario para determinar su el numero dos pude ser el  mayor 
       if(numero1 < numero2){
           
           JOptionPane.showMessageDialog(null, "el mayor es :"+numero2);
           JOptionPane.showMessageDialog(null, "el menor  es :"+numero1); 
           
       }
       
     
       
    }
    
}
