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
public class Punto13 {
//  Elabore un programa que permita ingresar 4 números enteros positivo y que los muestre
//en orden ascendente.
    
    
    public static void main(String[]args){
        // se inicilizan las variables 
        
        int n1,n2,n3,n4,primero = 0,segundo = 0,tercero = 0,cuarto = 0;
        
        // se pide por pantalla que ingre los 4 numero solicitados 
        
         n1= (Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su primer numero ")));
         n2= (Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su segundo numero ")));
         n3= (Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su tercero numero ")));
         n4= (Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su cuarto numero ")));
         
         
         // se realiza la condicion para determinar  cual es el orden de menor a mayor de los 4 numero ingresados 
         if ((n1<n2) && (n1<n3)&&(n1<n4)) {
            primero = n1;
         }
            else{
                    segundo =n2;
                    tercero=n3;
                    cuarto= n4;
                    
            }
         
          if ((n2<n1) && (n2<n3)&&(n2<n4)) {
            segundo = n2;
         }
            else{
                    primero = n1;
                    tercero=n3;
                    cuarto= n4;
                    
            }
            if ((n3<n1) && (n3<n2)&&(n3<n4)) {
            tercero = n3;
         }
            else{
                    primero =n1;
                    segundo=n2;
                    cuarto= n4;
                    
            }
              if ((n4<n1) && (n4<n2)&&(n4<n3)) {
            cuarto = n4;
         }
            else{
                    primero =n1;
                    segundo=n2;
                    tercero= n3;
                    
            }
        // se imprime por pantalla el resultado con el orden correcto de los 4 numeros 
        
          JOptionPane.showMessageDialog(null,"ascendente: "+primero+" -> "+segundo+" -> "+tercero+"->"+cuarto);
    
         
    }
  
}
