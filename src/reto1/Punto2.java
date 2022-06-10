/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto1;

import javax.swing.JOptionPane;

/**
 *Estructura de datos 
  Autor juan esteban gomez pachon 
 *Reto 1
 * 
 */
public class Punto2 {
    
    //Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos
    //entre el 1 y el 10. Luego debe realizar la impresión en pantalla de la suma de los números.

    
    public static void main (String[]args){
        //variables num1,resultado, acumulador,num2
       
         int num1,resultado,acumulador=0,num2 ;
         
           //siclo for  con la variable num1,se inicia en 1, luego se iguala a igual a 10 y se pone un  aumento con el ++
         for (num1=1;num1<=10;num1++){
             num2= num1;
             acumulador=num2+acumulador;
             
             
         }
         {
             // se muestra la suma de los numero  se iguala que el resultado es el acumulado de la suma 
             resultado=acumulador;
             JOptionPane.showMessageDialog(null, "la suma es:\n"+resultado);
         }
         
        
    }
    
}
