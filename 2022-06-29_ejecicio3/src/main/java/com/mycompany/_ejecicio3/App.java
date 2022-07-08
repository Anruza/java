
package com.mycompany._ejecicio3;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class App {
    
    public static void main(String[] args) {
        double precio, iva;
        
        Scanner teclado= new Scanner(System.in);
      
        System.out.println("Escribe el precio del producto: ");
        precio=teclado.nextDouble();
        System.out.println("Escribe el iva del producto: ");
        iva=teclado.nextDouble();
        iva=iva/100;
       
        System.out.println("El precio total de su producto es: "+ (precio+(precio*iva)));
    }
}
