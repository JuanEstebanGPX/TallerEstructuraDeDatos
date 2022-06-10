/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2;

import javax.swing.JOptionPane;

/**
 *
 *Estructura de datos 
 *Autor juan esteban gomez pachon 
 * Reto 2
 */
public class Punto9 {
    
//    Calcula la letra de un DNI, pediremos el DNI por teclado y nos devolverá el DNI completo.
//   Para calcular la letra, cogeremos el resto de dividir nuestro dni entre 23, el resultado debe
//   estar entre 0 y 22. Haz un método donde según el resultado de la anterior formula busque
//   en un array de caracteres la posición que corresponda a la letra. Esta es la tabla de
//   caracteres

    public static void main(String[]args){
        // se  inicializa el divisor en 30 
        int divisor= 23;
        String texto1;
        // se pide por pantalla el dni o docuemnto 
        texto1= JOptionPane.showInputDialog(null,"Ingrese los numeros de su documento");
        
        int doc= Integer.parseInt(texto1);
        // se  opera el reciduo con el divisor 
        int residuo=doc%divisor;
        char letras =letrasdoc(residuo);
        // se muestra en pantalla el documento + las lestras  texto1 es = a doc 
        JOptionPane.showMessageDialog(null,"El documento ingresado es :"+doc+letras);
        
        
    }
    public static  char letrasdoc(int residuo){
      
          char letrasdoc[]={'T', 'R', 'W', 'A', 'G', 'M', 'Y',
              
              
                          'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
      
                          
                        'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
     return letrasdoc[residuo];
    }
}
