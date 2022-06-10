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
public class Punto17 {
    //    A un trabajador le descuentan de su sueldo el 10% si su sueldo es menor o igual a 1000.Por
   //    encima de1000 y hasta 2000 el 5% del adicional y por encima de 2000 el 3 % del adicional.
    //    Calcular el descuento y sueldo neto que recibe el trabajador dado su sueldo.
    
    public static void main(String[]args){
        
        //se inicializan la variables 
        
        int descuento,sueldo,sueldoneto ;
        // se pide que ingrese el sueldo para  determinar el decuento y el valor que le queda de sueldo 
        
        sueldo = (Integer.parseInt(JOptionPane.showInputDialog(null, "por favor ingrese su sueldo")));
        
        if (sueldo <= 1000){
            // se operacion del descuento y el sueldo que le quedaria al  usuario 
            
            descuento = sueldo*10/100;
            sueldoneto = sueldo-descuento;
            
            
            JOptionPane.showMessageDialog(null, "el descuento de su sueldo es: "+descuento);
            JOptionPane.showMessageDialog(null, "su sueldo seria de : "+sueldoneto);
                 
        }
        // se hace el mismo procedimiento aterior pero con otro porcentaje diferente 
        
        if(sueldo > 1000  && sueldo == 2000){
            
            descuento = sueldo*5/100;
             sueldoneto = sueldo-descuento;
            JOptionPane.showMessageDialog(null, "el descuento de su sueldo es: "+descuento);
            JOptionPane.showMessageDialog(null, "su sueldo seria de : "+sueldoneto);
        }
        
        if(sueldo > 2000){
            
            descuento = sueldo*3/100;
               sueldoneto = sueldo-descuento;
            
            JOptionPane.showMessageDialog(null, "el descuento de su sueldo es: "+descuento);
            JOptionPane.showMessageDialog(null, "su sueldo seria de : "+sueldoneto);
        }
            
        
        
        
        
    }
}
