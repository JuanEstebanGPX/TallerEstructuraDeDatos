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
public class Punto16 {
    
//    Dado un monto calcular el descuento. De esta forma el descuento:
//    25% si m>=300
//    20% si 150<=m<300
//    no hay descuento si m<150
    
    public static void main (String[]args){
        
        // se inicializan las variables 
        
        int monto ,resultado;
        
        // se pide por pantalla el monto de la compra para determinar el decuento 
        monto=(Integer.parseInt(JOptionPane.showInputDialog(null,"por favor ingrese el monto de su compra ")));
        
        // se crea un condicion por cada descuneto dado 
        
        if(monto >= 300){
            
            resultado = monto*25/100;
           
            // y se imprime el resultado del decuento por la compra 
            
            JOptionPane.showMessageDialog(null, "el descuento es de :"+resultado);
              
            
        }
        
        if (  monto < 300){
            
             resultado = monto*20/100;
            
            JOptionPane.showMessageDialog(null, "el descuento es de :"+resultado);
            
        }
        
         if  (monto <= 150){
            JOptionPane.showMessageDialog(null, "no hay descuneto para su compra ");
        } 
    }
    
}
