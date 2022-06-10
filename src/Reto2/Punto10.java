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
public class Punto10 {
//    10. Crea un array de números y otro de String de 10 posiciones donde insertaremos notas entre
//    0 y 10 (debemos controlar que inserte una nota valida), pudiendo ser decimal la nota en el
//    array de números, en el de Strings se insertaran los nombres de los alumnos. Después,
//    crearemos un array de String donde insertaremos el resultado de la nota con palabras.
//    -> Si la nota esta entre 0 y 4,99 , sera un suspenso
//    -> Si esta entre 5 y 6,99 , sera un bien.
//    -> Si esta entre 7 y 8,99 sera un notable.
//    -> Si esta entre 9 y 10 sera un sobresaliente
    
    public static void main(String[]args){
        // se inicializan las variables 
        int tamaño1 =10;
        
        String nombres []= new String [tamaño1];
        double notas[]= new double[tamaño1];
        // se crea dos metoso un para completar operar
        // y el otro metodo para mostrar el reusltado 
        completarArray(notas,nombres);
        String resultado1[]=resultado2(notas);
       mostrarArray(nombres,notas,resultado1);
       
     
    }
    // primer metodo completar en donde se usa un do while para  validar las notas ingresada por el usuario
    // se  repetira 10 posiciones el array
    
    public static void completarArray(double notas[],String nombres[]){
        for(int j = 0;j<notas.length;j++){
            nombres[j]=JOptionPane.showInputDialog(null, "Ingrese el nombre del alumno "+(j+1));
            double nota1;
            do{
                String texto1;
                
                texto1=JOptionPane.showInputDialog(null,"Ingrese  la nota del alumno"+(j+1));
                nota1 = Double.parseDouble(texto1);
                
                JOptionPane.showMessageDialog(null,nota1<=0 || nota1>=10);
                
            }while(nota1<=0 || nota1 >=10);
            notas[j]=nota1;
        }
    }
    // mostramos en pantalla con este metodo el resultado de las notas ,
    public static void mostrarArray(String nombres[],double notas[],String resultado1[]){
         for (int j =0;j <nombres.length;j++){
             JOptionPane.showMessageDialog(null, "El alumno "+nombres[j]+" Tiene una nota de "+notas[j]+",  Su resultado es "+resultado1[j]);
         }
    }
    // se muestra un segundo reusltado con siclo for y switch case en donde
    // en cada caso sera suspencion. bien,  notable , sobresaliente 
    public static String[] resultado2(double notas[]){
        String resultado1 []= new String[notas.length];
        
        for (int j = 0;j<notas.length;j++){
            
            switch ((int)notas [j]){
                 case 1:
                   case 2:
                case 3:
                   case 4:
                    resultado1 [j]="suspencion";
                    break;
                   case 5:
                    case 6:
                       resultado1[j]="Bien excelente ";
                case 7:
                   case 8:
                    resultado1 [j]="notable";
                    break;
                case 9:
                   case 10:
                    resultado1[j]="sobresaliente";
                    break;
                    
                    
            }
        }
        return resultado1;
    }
    
}
