/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto1;

import javax.swing.JOptionPane;

/**
 * Estructura de datos 
 * Autor juan esteban gomez pachon 
 * Reto 1
 *
 * 
 */
public class Punto1 {

    /**
     * Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y
       C respectivamente.El algoritmo debe indicar cuál es el mayor y cuál es el menor. Luego
       debe realiza la impresión en pantalla del resultado
     * @param args
     */
    public static void main(String[] args) {
       
        // se declaran variables 
       int A=0;
       int B=0;
       int C=0;
       // se le pide al usuario que ingrese sus 3 numero , a , b , c 
       
       A= (Integer.parseInt(JOptionPane.showInputDialog(null," ingrese su primer numero "))); 
       B= (Integer.parseInt(JOptionPane.showInputDialog(null," ingrese su segundo numero "))); 
       C= (Integer.parseInt(JOptionPane.showInputDialog(null," ingrese su tercer numero "))); 
     
       // se hace un if , en donde se busca igualar que a se  menor  o mayor que b o b mayor que c asi en cada uno de lo siclos 
        
      
           
           
        if (B > A && A > C){
            JOptionPane.showMessageDialog(null, "el numero mayor es:"+B);
            JOptionPane.showMessageDialog(null, "el numero menor es:"+C);
           
       }
        else if(A>C && C>B){
              JOptionPane.showMessageDialog(null, "el numero mayor es:"+A);
           JOptionPane.showMessageDialog(null, "el numero menor  es:"+C);
           
       }
       
        else if (C> B && B>A){
             JOptionPane.showMessageDialog(null, "el numero mayor es:"+C);
           JOptionPane.showMessageDialog(null, "el numero menor  es:"+B);
       }
        else if (B> C && C> A){
              JOptionPane.showMessageDialog(null, "el numero mayor es:"+B);
           JOptionPane.showMessageDialog(null, "el numero menor  es:"+C);
            
        }
       // al final se muestra que si nigun dato es verdero a los requisitos puestos 
        //  lo enviara a que nigun numero funciona 
        else{
            JOptionPane.showMessageDialog(null, "ningun numero es menor o mayor ");
        }
        
        
    }
}
          

