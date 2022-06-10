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
public class Punto2 {
    
//    . Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos
//   el array con números aleatorios entre 10 y 20, al final muestra por pantalla el valor de cada
//   posición y la suma de todos los valores. Haz un método para rellenar el array (que tenga
//   como parámetros los números entre los que tenga que generar), para mostrar el contenido
//   y la suma del array y un método privado para generar número aleatorio (lo puedes usar para
//   otros ejercicios).

    
    public  static void main(String[]args){
        // se inicializa una variable tipo string para ingresar el tamaño  del array
       
        
        String dato1;
        dato1= JOptionPane.showInputDialog(null,"Ingrese el tamaño");
        
        //se hace un  parse int para recibir el dato en  numero enteros 
        
        int  numero []= new int [Integer.parseInt(dato1)];
        // se inicializan  los metodos que usaremos para  operar el numero 
        // y mostrar en pantalla el resultado
        numeroAleatorioArray(numero,10,20);
        mostrarArray(numero);
        
    }
    // 1 metodo operar
    //  se dan  instrucciones con siclo for hacia la lista con el numero 1, numero2 
    public static void numeroAleatorioArray(int lista[],int numero1,int numero2){
        
        for (int j =0; j < lista.length;j++){
           lista [j]=((int)Math.floor(Math.random()*(numero1-numero2)+numero2));
           
        }
    }
    
    // 2 metodo mostrar el resultado en pantalla
    // tambien se usa un siclo for   y se muestra en pantalla el indice y el valor del array con la variable lista
    public static void mostrarArray(int lista[]){
      
        for (int j =0; j < lista.length;j++){
                JOptionPane.showMessageDialog(null,"el indice es ="+j+"\n el valor es = "+lista[j]);
        }
    }
    
}
