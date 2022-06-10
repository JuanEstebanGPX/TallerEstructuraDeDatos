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
public class Punto15 {
    
// Hacer un programa que permita calcular la media aritmética de 10 números negativos y que
//muestre la media aritmética en la pantalla.
    
    
    public static void main(String[]args){
        
        // se inicilizan las variables 
        
        int  total = 0, operador, numero,media,suma  ;
        
        operador= 1;
        suma =0;
        // se pide que ingrese los  numero que  que sedea calcular 
        total= (Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese sus numero que desea calcular")));
        
        while (operador  <= total){
            // el usuario ingrese la cantidad que  desea determinar 
            
            numero=(Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero por favor")));
          // se opera los numeros ingresados 
           suma = suma +numero;
           operador = operador + 1;
           
        } 
        // se entrega por pantalla el resultado con la media solicitada por el usuario 
        media = suma /total;
        JOptionPane.showMessageDialog(null, "la media aritmetica es :"+media);
        
        
        
    }
}
