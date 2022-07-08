
package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Mavenproject1 {

    public static void main(String[] args) {
    
     double radio, PI;
        PI=3.1415927;
        
        Scanner teclado= new Scanner(System.in);
      
        System.out.println("Escribe el radio de la circunferencia: ");
        radio=teclado.nextDouble();
   
        System.out.println("La longitud de una circunferencia de radio " + radio + "es: " + (2*radio*PI));
    
    
    }
    
    
    
}
