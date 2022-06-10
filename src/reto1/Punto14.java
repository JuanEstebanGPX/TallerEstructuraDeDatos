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
public class Punto14 {
    
    
// Se necesita un sistema que tenga tres opciones, si se selecciona la primera se calcula el
//perímetro de un cuadrado, si la opción es la dos se calcula el perímetro de un triángulo
//equilátero, y cuando se elija la tres se calcula el perímetro de un círculo. Además de que
//mandara un mensaje de “error” en caso de presionar cualquier otro número.
//    
    
    public static void main(String[]args){
        
        // se inicilizan las variables de tipo double y  entero 
        
        double  lado1,lado2,lado3,lado4,resultado;
        int opcion;
      // se muestra un menu de opciones  en donde el usuario elige la operacion para calcular el perimetro 
      
        JOptionPane.showMessageDialog(null, "bievendio ");
       opcion= (Integer.parseInt(JOptionPane.showInputDialog(null, " elija una opcion \n1: perimetro de un cuadrado \n 2: perimetro de un triangulo \n 3: perimetro de un circulo"))); 
       
       //  con el switch case , el usuario al ingresal la 1 opcion se  realiza la operacion que el usuario elijio 
        switch(opcion){
            
            case 1:
               lado1= (Double.parseDouble(JOptionPane.showInputDialog(null, " ingrese los lados del cuadrado \n lado1  "))); 
               lado2= (Double.parseDouble(JOptionPane.showInputDialog(null, "  lado2  "))); 
               lado3= (Double.parseDouble(JOptionPane.showInputDialog(null, "  lado3  "))); 
               lado4= (Double.parseDouble(JOptionPane.showInputDialog(null, "  lado4  "))); 
               
               resultado= lado1+lado2+lado3+lado4;
               
               JOptionPane.showMessageDialog(null, "el perimetro del cuadrado es :"+resultado);
               
               
               
                
           break;
           
            case 2:
                
                lado1= (Double.parseDouble(JOptionPane.showInputDialog(null, " ingrese los lados del triangulo \n lado1  "))); 
               lado2= (Double.parseDouble(JOptionPane.showInputDialog(null, "  lado2  "))); 
               lado3= (Double.parseDouble(JOptionPane.showInputDialog(null, "  lado3  "))); 
               
               resultado = lado1+lado2+lado3;
               
               JOptionPane.showMessageDialog(null, "el perimetro del triangulo es :"+resultado);
                
                
                break;
                
                
            case 3:
                lado1= (Double.parseDouble(JOptionPane.showInputDialog(null, " ingrese  el diametro del circulo  "))); 
                
                resultado = lado1*3.14;
                JOptionPane.showMessageDialog(null, "el perimetro del ciruculo es :"+resultado);
                break;
            default :
                
                //si ingresa un opcion   incorrecta se le mostrar al usuario el error 
                
                 JOptionPane.showMessageDialog(null, "error");
          
        }
        
     
        
        
    }
}
