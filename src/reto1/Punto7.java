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
public class Punto7 {
//    Diseñe un algoritmo que lea 3 números y me muestre el menor de los 3.
    
    public static void  main(String[]args){
        
        // se inicilizan las variables de tipo entero 
        int numero1,numero2,numero3;
        // se le pide al usuario 3 numeros 
         numero1=(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su primer numero")));
         numero2=(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su segundo numero")));
         numero3=(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su tercer numero")));
         
         // se hace  una condicion para determinar cual de los 3 numero es el menor , en cada condicion se evalua cada uno de los numero digitados
          if (numero1 <  numero2) {
            if (numero1 < numero3) {
                JOptionPane.showMessageDialog(null, "el menor es:"  + numero1);                                           
            } else {
                   JOptionPane.showMessageDialog(null, "el menor es:"  + numero3);     
            }
        } else if (numero2 < numero3) {
           JOptionPane.showMessageDialog(null, "el menor es:"  + numero2);
        } else {
           JOptionPane.showMessageDialog(null, "el menor es:"  + numero3);
        }
        
   }
}
 