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
public class Punto3 {
    //Desarrolle un algoritmo que permita determinar el área y volumen de un cilindro dado su
   //  radio (R) y altura (H). Luego debe realiza la impresión en pantalla del resultado.

    public static void main(String[] args) {
        // se declaro la variable, radio , altura 
        int radio;
        int altura;
        
        // se le pide al usuario que ingrese el radio y altura del cilindro medinate un joptionpane
        radio= (Integer.parseInt(JOptionPane.showInputDialog(null,"por favor ingrese el  radio del cilindro ")));
        altura= (Integer.parseInt(JOptionPane.showInputDialog(null,"por favor ingrese la altura  del cilindro ")));
        
        
        //aperacion  para calcular el area y  el volumen , se uso la libreriia MATH.lang 
        int area = (int) (2*Math.PI*radio*(radio+altura));
        int volumen = (int)(Math.PI*(radio^2)*altura);
         
        // se muestra en pantalla el area y el volumen del datos ingresado 
        
        JOptionPane.showMessageDialog(null, "el area del cilindro es:"+area);
        JOptionPane.showMessageDialog(null, "el volumen  del cilindro es:"+volumen);
            
    }
    

    
}
