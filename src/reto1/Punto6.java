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
public class Punto6 {
    
//  Realice un algoritmo que a partir de proporcionarle la velocidad de un automóvil, expresada
//en kilómetros por hora, proporcione la velocidad en metros por segundo. Luego debe realiza
//la impresión en pantalla del resultado.
    
    public static void main (String[]args){
        
        // se inicilizan la variables de tipo double 
        double  velocidad,kilometros;
        // se le pide al usuario que ingrese los km/h reccorridos 
         kilometros = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese los kilometros / hora  " ));
       
        // se hace una operacion de kilometros que equivale a metros por segundo en donde se multiplica por 5 y se divide en 18
         velocidad = kilometros * 5 /18;
         
         // muestra en pantalla  el resultado de la operacion anterior  
         
         JOptionPane.showMessageDialog(null,"la velocidad  en metros / segundos es:"+velocidad);
        
        
    }
    
}
