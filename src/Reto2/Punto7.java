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
 * */
public class Punto7 {
//    . Crea dos arrays de números con una posición pasado por teclado. Uno de ellos estará
//    rellenado con números aleatorios y el otro apuntara al array anterior, después crea un
//     nuevo array con el primer array (usa de nuevo new con el primer array) con el mismo
//     tamaño que se ha pasado por teclado, rellenalo de nuevo con números aleatorios. Después, 
//     crea un método que tenga como parámetros, los dos arrays y devuelva uno nuevo con la
//     multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente. Por último,
//     muestra el contenido de cada array.
    
    
    public static void main(String[]args){
        // se inicializan las variables 
       String texto1 ;
       // se le pide al usuario un tamaño 
      texto1 =  JOptionPane.showInputDialog(null,"Ingrese el tamaño");
      int tamaño = Integer.parseInt(texto1);
      int tamañoArray1[]= new int [tamaño];
      int tamañoArray2[];
      //merodo 1 para completar el array desde el 10  al 100
      completarArray(tamañoArray1,10,100);
      
      tamañoArray2=tamañoArray1;
      
      tamañoArray1= new int [tamaño];
      // metodo para 
      completarArray(tamañoArray1,10,100);
      
      // multiplicador  de  la posicion 
       
       int tamañoArray3[]=multiplicador(tamañoArray1,tamañoArray2);
       
       JOptionPane.showMessageDialog(null,tamañoArray1);
       verArray(tamañoArray1);
       JOptionPane.showMessageDialog(null,tamañoArray2);
        verArray(tamañoArray2);
       JOptionPane.showMessageDialog(null,tamañoArray3);
        verArray(tamañoArray3);
       
       
        
     
    }
    // el metodo completar array lleva un siclo for
    // con en donde se ejecuta la operacion numero 1-numero2 +numero 2
    public static void completarArray(int lista[],int numero1,int numero2){
      
     for (int j = 0; j <lista.length;j++){
     lista [j]=((int)Math.floor(Math.random()*(numero1-numero2)+numero2));
         
     }   
    }
    // mostrar en pantalla el resultado del indice y el valor
    // con un siclo for 
    public static void verArray(int lista[]){
        for (int j = 0;j<lista.length;j++){
            JOptionPane.showMessageDialog(null,"El indice es : "+j+" \n El valor es :  "+lista[j]);
        }
    }
    
    // se opera  la posicion  
    public static  int[]multiplicador(int tamañoArray1[],int tamañoArray2[]){
        int tamañoArray3[]= new int[tamañoArray1.length];
        for(int j= 0;j<tamañoArray1.length;j++){
            tamañoArray3[j]=tamañoArray1[j]*tamañoArray2[j];
        }
        return tamañoArray3;
    }
}
