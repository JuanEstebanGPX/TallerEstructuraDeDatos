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
public class Punto11 {
////    Diseñe un algoritmo que lea tres números y los imprima de mayor a menor y de menor a
////    mayor
    
    
    public static void main(String[]args){
        
        // se incializan las varibales 
        int numero1,numero2,numero3,primero,segundo,tercero;
        
        //  se pide por pantalla que el usuario ingrese  3 numero 
        
        numero1=(Integer.parseInt(JOptionPane.showInputDialog(null,"digite su primer numero ")));
        numero2=(Integer.parseInt(JOptionPane.showInputDialog(null,"digite su segundo numero ")));
        numero3=(Integer.parseInt(JOptionPane.showInputDialog(null,"digite su tercer numero ")));
        
        
        // con la condicion se determina la posicion ascendente o descendente de los numeros ingresados
       if ((numero1>numero2) && (numero1>numero3)) {
			primero = numero1;
			if (numero2>numero3) {
				segundo = numero2;
				tercero = numero3;
			} else {
				segundo = numero3;
				tercero = numero2;
			}
		} else {
			if (numero2>numero3) {
				primero = numero2;
				if (numero1>numero3) {
					segundo = numero1;
					tercero = numero3;
				} else {
					segundo = numero3;
					tercero = numero1;
				}
			} else {
				primero = numero3;
				if (numero1>numero2) {
					segundo = numero1;
					tercero = numero2;
				} else {
					segundo = numero2;
					tercero = numero1;
				}
			}
		}
		// se muestra por pantalla  el resultado de  los numeros 
		JOptionPane.showMessageDialog(null,"Descendente : "+primero+" -> "+segundo+" -> "+tercero);
		JOptionPane.showMessageDialog(null,"Ascendente : "+tercero+" -> "+segundo+" -> "+primero);
     }
        
  }
    

