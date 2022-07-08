
package com.mycompany._swich;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class App {

    public static void main(String[] args) {
        
       String linea;
       
       Scanner teclado= new Scanner(System.in);
       System.out.println("Elige una linea de metro (L1....L5) y sabras cuantas estaciones tiene");
        linea=teclado.nextLine();
        
        linea=linea.toUpperCase();
        
        switch (linea){
        case "L1":
            System.out.println("La estaciones de la linea 1 son: 20");
            break;
        case "L2":
            System.out.println("La estaciones de la linea 2 son: 18");
            break;
        case "L3":
            System.out.println("La estaciones de la linea 3 son: 26");
            break; 
        case "L4":
            System.out.println("La estaciones de la linea 4 son: 22");
            break;
        case "L5":
            System.out.println("La estaciones de la linea 5 son: 32");
            break;            
        }
  switch (linea){
        case "L1" -> System.out.println("La estaciones de la linea 1 son: 20");
        case "L2" -> System.out.println("La estaciones de la linea 2 son: 18");
        case "L3" -> System.out.println("La estaciones de la linea 3 son: 26");
        case "L4" -> System.out.println("La estaciones de la linea 4 son: 22");
        case "L5" -> System.out.println("La estaciones de la linea 5 son: 32");            
        }
    }
}
