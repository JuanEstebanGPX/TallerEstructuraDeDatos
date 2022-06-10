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
public class Punto9 {
//  El promedio de prácticas de un curso se calcula en base a cuatro prácticas calificadas de las
//cuales se elimina la nota menor y se promedian las tres notas más altas. Diseñe un algoritmo
//que determine la nota eliminada y el promedio de prácticas de un estudiante.
    
    public static void main (String[]args){
        
        // se inicializan las variables de tipo double , y se le agregan  el valor 20.000 para determinar la anulacion de una nota
        // y la suma  se inicia en 0
        
        double  anulacion , numero,promedio,suma;
        
        anulacion = 20000;
        suma = 0;
       
        //  se usa la varibale i para determinar las 4 notas del alumno 
        
        int i;
         
       // se crea una condicion para determinar  la igualdad entre la nota y la anulacion y se inicializa con un numero  
        
        for (i=1;i<=4;i++){
            
            numero= (Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese sus notas")));
            if (numero< anulacion){
                anulacion= numero;
            }
            
            //  se realiza la suma con el numero ingresdo 
            suma = suma + numero;   
            
        }
        // se valida el promedio  con la suma y la anulacion  dividio en en 3 notas
        promedio =(suma +anulacion)/3;
        
        //  se imprime por pantalla el promedio y la anulacion 
        JOptionPane.showInternalMessageDialog(null, "la nota que se elimina es :"+ anulacion);
        JOptionPane.showInternalMessageDialog(null, "el promedio  del estudiante es  :"+ promedio);
        
        
    }

    
}
