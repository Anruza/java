

package com.mycompany.entrarsalir;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EntrarSalir {

    public static void main(String[] args) {
       
    String elegir, resultado1, resultado2;
    
    Scanner teclado =new Scanner(System.in);
    
        System.out.println("Elegir entre entrar o salir");
        elegir= teclado.next();
        
        switch (elegir){
            case "entrar" -> {
                resultado1 =entra();
                System.out.println(resultado1);
                break;
            }
            case "salir" -> {
                resultado2 =fuera();
                System.out.println(resultado2);
                break;           
            }
            //default 
        }
        
     //--------------funciones----------------
    }       
       static String entra(){ 
        String resultado1=("hola has elegido entrar");
        //System.out.println("La suma es: " +resultado1);
        return resultado1; 
        }
        
        static String fuera(){ 
        String resultado2=("Adios has elegido salir");
        //System.out.println("La suma es: " +resultado1);
        return resultado2; 
        }       
     

    
    
}
