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
public class Punto4 {
    
  //   Desarrolle un algoritmo que permita leer un valor cualquiera N y escriba si dicho número es
  //  par o impar.Luego debe realiza la impresión en pantalla del resultado

 
    public static  void  main(String[]args){
        
        //  se incializa la variable num1 en 0
        int num1=0;
       
        // se le pide el numero al usuario que seria num1
        num1=(Integer.parseInt(JOptionPane.showInputDialog(null," por favor ingrese un numero ")));
        
        // se usa condicion  con un if else , para saber si el numero es par o impar 
        if((num1 % 2)== 0){
            JOptionPane.showInternalMessageDialog(null,   num1+ " es par");
            
            
        }
        else{
            JOptionPane.showInternalMessageDialog(null,   num1+ " es impar");
        }
        
        
    }
    
}
