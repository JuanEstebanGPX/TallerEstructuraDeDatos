/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto1;

import javax.swing.JOptionPane;

/**
 *Estructura de datos 
 * Autor juan esteban gomez pachon 
 * Reto 1
 *
 */
public class Punto12 {
    
// Dado el monto de una compra mostrar y calcular el descuento considerado:
//Descuento es el 10% si el monto es mayor a $100.
//Descuento es el 2% si el monto es mayor a $50 y menor o igual a $100
//No hay descuento si el monto es menor o igual $50

    public static void main (String[]args){
        
        //se inicilizan las variables  tipo double 
        double descuento1,numero;
        // se  ingresa el monto de la compra 
        // con la variable numero 
        numero = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el monto de su compra "));
        
         //  si la condicion es correcta  se realiza la operacion 
        if(numero > 100){
            
            // operacion del descuento del numero ingresado 
            descuento1 = numero*10/100;  
            // se entrega por patalla el valor a pagar por el usuario 
            JOptionPane.showInternalMessageDialog(null, "el valor a pagar es :"+descuento1);
        }
        
        if(numero > 50 && numero <= 100){
            
            descuento1= numero*2/100;
            
             JOptionPane.showInternalMessageDialog(null, "el valor a pagar es :"+descuento1);
        }
        
        // si esta condicion  no se cumple 
        // no hay un descuento para el  usuario 
        else if  (numero <= 50 ) {
         
            JOptionPane.showMessageDialog(null, "no hay decuento ");
        }
        
     
    }
}
