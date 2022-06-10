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
public class Punto3 {
//    
//    Crea un array de números de un tamaño pasado por teclado, el array contendrá números
//    aleatorios primos entre los números deseados, por último, nos indica cual es el mayor de
//    todos. Haz un método para comprobar que el número aleatorio es primo, puedes hacer
//    todos los métodos que necesites.
    
    public static void main(String[]args){
        // se incilizan las variables en este caso un string 
        String texto1;
        
        //   se ingresa el tamaño del array y hacemos un parseInt para convertirlo en entero 
        texto1= JOptionPane.showInputDialog(null,"Ingrese el tamaño ");
        int numero[]= new int[Integer.parseInt(texto1)];
        
        // metodos que usaremos para  el numero aleatorio entre 1 y 100
        numerosprimosAleatoriosArray(numero,1,100);
         // metodo para mostrar el resultado 
         
        mostrarArray(numero);
        
        int primo= mayor(numero);
        
        JOptionPane.showMessageDialog(null, "El numero primo mas grande es:"+primo);
        
    }
    // 1 metodo
    //  se usa la variable j y un siclo while con if , se ejecuta el while con la variable j 
    // y se da un instruccion  si se cumple  mostramos el incremento del J
    public static void numerosprimosAleatoriosArray(int lista[],int numero1,int numero2){
    int j = 0;
    
    while (j < lista.length){
        int numero= ((int)Math.floor(Math.random()*(numero1-numero2)+numero2));
        if (esprimo(numero)){
            
            lista[j]=numero;
            j++;
        }
    }
}
    //2 metodo
    //  se usa un valor boolean si el numero es primo es true 
    //   con el if se da la instruccion del numero y retorno el falso 
    // si no se cumple el contador queda en 0
   
     
    private static boolean esprimo(int numero){
        
        if (numero <=1){
           return false;
           
        }
        else{
            int prueba1;
            int contador=0;
            
            prueba1= (int)Math.sqrt(numero);
            
            for(; prueba1>1;prueba1--){
                if(numero%prueba1==0){
                    contador+=1;
                    
            }   }
              return contador < 1;      
             
        }
    }
     //  con este metodo mostramos en pantalla el indice y el valor 
    
     public static void mostrarArray(int lista[]){
                  for (int j =0;j<lista.length;j++){
                   JOptionPane.showMessageDialog(null,"El indice es = "+j+"\n El valor es ="+lista[j]);
                  }
      
       
              }
     
     //  mostramos el numero mayor de la lista
      public static int mayor(int lista []){
         int mayor =0;
         for(int j =0;j<lista.length;j++){
             if (lista[j]>mayor){
                 mayor= lista[j];
                 
             }
         }
         return mayor;
      }
}
