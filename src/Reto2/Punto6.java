/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2;

import javax.swing.JOptionPane;

/**
 *
 *  Estructura de datos 
 * Autor juan esteban gomez pachon 
 * Reto 2
 */
public class Punto6 {
//    Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres. Puedes
//    hacer con o sin métodos de String.
    
    
    public static void main(String[]args){
        // incializacion de la varible frace  con un String
        
    String frase;
    //  se usa un JOptionPane para ingresar la frase ,en este caso la variable frase
    frase= JOptionPane.showInputDialog(null,"Ingrese  la frase ");
    
    // se usa un  siclo for para determinar los caracteres  y mostrarlos en pantalla
    char caracteres[]=frase.toCharArray();
    
    for(int j =0; j<frase.length();j++){
        JOptionPane.showMessageDialog(null,caracteres[j]);
    }
    }
}
