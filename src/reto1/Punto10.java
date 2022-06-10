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
public class Punto10 {
// Diseñe un algoritmo que lea tres longitudes y determine si forman o no un triángulo. Si es
//un triángulo determine de qué tipo de triángulo se trata entre: equilátero, isósceles o
//escaleno. Considere que para formar un triángulo se requiere que: "el lado mayor sea
//menor que la suma de los otros dos lados".
    
    
    public static void main(String[]args){
        
        // se inicializan las variables a,b,c 
     int  a,b,c; 
        
        a = (Integer.parseInt(JOptionPane.showInputDialog(null," por favor ingrese el lado a del triangulo")));
        b = (Integer.parseInt(JOptionPane.showInputDialog(null," por favor ingrese el lado b del triangulo")));
        c = (Integer.parseInt(JOptionPane.showInputDialog(null," por favor ingrese el lado c del triangulo")));
        
        
        // se evalua con una condicion los lados ingresados para determinar  que sea un triangulo
        if (a < (b+c)){
            
            JOptionPane.showMessageDialog(null,"es un triangulo");
                
        }
        
        else{
            if(b < (a+c)){
                JOptionPane.showInternalMessageDialog(null,"es un triangulo");
                
            }
            
            else{
                if (c< (a+b)){
                    
                    JOptionPane.showMessageDialog(null, "es un triangulo");
            }
            else{
                    JOptionPane.showMessageDialog(null, "no es un triangulo");
             }
                
        }
            
            // se determina si es un triagulo  equilatero , escaleno , isosceles 
            
            if (a==b && b ==c){
                JOptionPane.showMessageDialog(null, "es un triangulo equilatero");
            }
            else{
                if (a!=b && b!= c && a!= c){
                    
                    JOptionPane.showMessageDialog(null, "es un triangulo escaleno");
                    
                }
                
                else{
                    JOptionPane.showMessageDialog(null, "es un isosceles");
                }
            }
        
    }
    }   
}
