/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2;

import javax.swing.JOptionPane;

/**
 *Estructura de datos 
 *Autor juan esteban gomez pachon 
 * Reto 2
 */
public class Punto8 {
//    Crea un array de números de un tamaño pasado por teclado, el array contendrá números
//    aleatorios entre 1 y 150 y mostrar aquellos números que acaben en un dígito que nosotros
//    le indiquemos por teclado (debes controlar que se introduce un numero correcto), estos
//    deben guardarse en un nuevo array. Por ejemplo, en un array de 10 posiciones e indicamos
//    mostrar los números acabados en 5, podría salir 155, 25, etc.
    
    public static void main(String[]args){
        // se incializan las variables 
        String texto1;
        texto1= JOptionPane.showInputDialog(null,"Ingrese el tamaño ");
        int numero[]= new int[Integer.parseInt(texto1)];
        // digito es un entero 
        int digito;
        // se usa un sico do while 
        // se pide que ingrese un numero entre el 0 y el 9 para validar el array de 10 posiciones 
        do{
            texto1= JOptionPane.showInputDialog(null,"Ingrese un numero entre 0 y 9");
            digito= Integer.parseInt(texto1);
            
        }while (!(digito >=0 && digito <=9));
        
        completarnumeroArray(numero,1,150);
        
        int finalizadosen[]= numeroterminado(numero,digito);
        verArrayterminados(finalizadosen);
        
    }
    // se  operan las posiciones con  un for 
    // y se agrega la lista 
    public static void completarnumeroArray(int lista[],int numero1,int numero2){
        for (int j =0; j <lista.length; j++ ){
        lista[j]=((int)Math.floor(Math.random()*(numero1-numero2)+numero2));
    }
    
    
  }
    // mostramos el resultado por pantalla con un siclo for el numero es + lista
    // que se  halla elegido 
    public static void verArrayterminados(int lista[]){
        for(int j =0;j<lista.length;j++){
            if(lista[j]!=0){
                JOptionPane.showMessageDialog(null, "EL numero es  : "+lista[j]);
            }
        }
    }
    // se hace un metodo para determinar el numero es termino  
    // y se muestra la finalizacion del numero en que esta terminado 
    public static int[] numeroterminado(int numero[],int numerofinal){
        int finalizadosen[]= new int [numero.length];
        int numerofinalizado = 0;
        for (int j =0;j < finalizadosen.length;j++){
            numerofinalizado = numero[j]-(numero[j]/10*10);
            
            if(numerofinalizado == numerofinal){
                finalizadosen[j]=numero[j];
            }
        }
        
        return finalizadosen;
    }
}
