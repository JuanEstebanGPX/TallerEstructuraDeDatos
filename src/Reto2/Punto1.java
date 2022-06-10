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
public class Punto1 {
    
//    Crea un array de 5 posiciones de números con valores pedidos por teclado. Muestra por
//     consola el índice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores
//     y otro para mostrar
//    
    
    
    public static void main(String[]args){
        
        // se inicilizan las variables 
        
        final int tamaño=5;
        int numero []= new int [tamaño];
       // se crean  completarArray que va ser el numero ingresado y el mostrarArray que tambein va ser el numero ingresado
        completarArray(numero);
        mostrarArray(numero);
        
    }
    
    // primer metodo  
    // se usa un siclo for para rellenar el valor 
    public static void completarArray(int lista[]){
        String texto1;
        for(int j=0; j <lista.length;j++){
            texto1= JOptionPane.showInputDialog(null,"Por favor ingrese un numero");
            lista[j]= Integer.parseInt(texto1);
            
        }
    }
    // segundo metodo
    // se usa tambien con un siclo for para ejecutar y mostrar en pantalla el resultado
    
    public static void mostrarArray(int lista[]){
        
     for (int j =0; j <lista.length;j++){
         JOptionPane.showMessageDialog(null,"el indice es ="+j+"\n el valor es = "+lista[j]);
     }   
    }
}
