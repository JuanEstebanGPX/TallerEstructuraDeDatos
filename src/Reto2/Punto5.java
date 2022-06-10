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
public class Punto5 {
// Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas). Después,
// ve pidiendo posiciones del array por teclado y si la posición es correcta, se añadirá a una
// cadena que se mostrara al final, se dejará de insertar cuando se introduzca un -1.
//‘A’ = 0 
// ‘F’= 5
// ‘Z’= 25
// 1 resultado final

    public static void main(String[]args){

        // se da un parametro del arreglo en donde seran 26 caracteres 
        // en este caso mayusculas
        char mayusculas []= new  char[26];
        
        // siclo for para determinar las mayusculas 
        // sabiendo A,F,Z, con el  valor de 65 ,90 
        for(int j = 65,o=0;j<=90;j++,o++){
            mayusculas[o]=(char)j;
        }
        
        String cadena = "";
        int eleccion = 1;
        // se declara una variable en este caso eleccion 
        // si precionamos el 1  es aceptar y que muestre el resultado 
        
        do{
            eleccion= (Integer.parseInt(JOptionPane.showInputDialog(null,"Elija un indice entre o y"+ (mayusculas.length - 1))));
            
            if (!(eleccion >= 0 && eleccion <= mayusculas.length -1)){
       
                JOptionPane.showInternalMessageDialog(null, "Ingrese otro numero por favor");
                
            }
            else{
               if(eleccion != 1){
                   cadena += mayusculas[eleccion];
                   
               }
            }
            
        }while(eleccion != 1);
        JOptionPane.showInternalMessageDialog(null, cadena);
        
    }
}
