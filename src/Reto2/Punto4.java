/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2;

import javax.swing.JOptionPane;

/**
 *
 * Estructura de datos 
 * Autor juan esteban gomez pachon 
 * Reto 2
 */
public class Punto4 {
//   Crea un array de números de 20 posiciones, que contendrá los números del 1 al 100. Obtén
//     la suma de todos ellos y la media.
    
    public static void main(String[]args){
        // se inciliza  el array de 20 posiciones 
        
        int[]numero1= new int [20];
        // suma 
        // media 
        int suma =0;
        double media;
        // siclo for para determinar la suma y la media 
        for(int j=0;j< numero1.length;j++){
           numero1[j]=j+1;
           suma+=numero1[j];
           
        }
        // resultado de la operacion por pantalla 
        // JOptionPane 
        JOptionPane.showMessageDialog(null,"la suma es \n "+suma);
        media=(double)suma/numero1.length;
        JOptionPane.showInternalMessageDialog(null, "la media es \n "+media );
    }
    
}
