
package com.mycompany.buclearray;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class BucleArray {
    
    public static void main(String[] args) {
     int control=0, valor,contenido, valorArray ;   
        int [] ArrayNumeros={1,3,4,5,8};
        valor=ArrayNumeros.length;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un mumero de 1 al 9");
        System.out.println("para saber si está en el Array");
        contenido= entrada.nextInt();
        
        while(control<valor){
            valorArray=ArrayNumeros[control];
            if(valorArray==contenido){
                System.out.println("El numero introducido está en el Array en la posición "+(control));
                control=10;
            }else {
                control ++;
            }
        }
        if(control!=10){
            System.out.println("El numero introducido no está en el Array");
        }   
    }// fin main
}
