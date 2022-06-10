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
public class Punto8 {
//    Elaborar un programa que me ingrese 3 números y me muestre el número intermedio.
    
    
    public static void main (String[]args){
        
        // se inicilizan las variables de tipo entero 
        
        int numero1,numero2,numero3;
        // se piden al usuario que ingrese 3 numero 
         numero1=(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su primer numero")));
         numero2=(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su segundo numero")));
         numero3=(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su tercer numero")));
         
         // se evalua con un condicion   los 3 numero para verificar cual de los numeros ingresados es el  intermedio 
         if(numero1 != numero2 && numero1 != numero3 && numero2 != numero3){
             
             JOptionPane.showMessageDialog(null, "el numero intermedio es : "+numero1);
             
         }
          if((numero1 > numero2 && numero1 < numero3) || (numero1 < numero2 && numero1 > numero3)){
             
             JOptionPane.showMessageDialog(null, "el numero intermedio es : "+numero1);
             
             
          if((numero2 > numero1 && numero2 < numero3) || (numero2 < numero1 && numero2 > numero3)){
             
              // se muestra por pantalla en cada caso cual es numero intermedio ingresado
             JOptionPane.showMessageDialog(null, "el numero intermedio es : "+numero2);
             
         } 
             
              }
            if((numero3 > numero1 && numero3 < numero2) || (numero3 < numero1 & numero3 > numero2)){
             
             JOptionPane.showMessageDialog(null, "el numero intermedio es : "+numero3);
             
         } 
    }
}
