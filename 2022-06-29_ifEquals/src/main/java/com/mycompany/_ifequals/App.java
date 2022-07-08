

package com.mycompany._ifequals;
import java.util.Scanner;
/**
 *
 * @author Angel
 */
public class App {

    public static void main(String[] args) {
        String respuesta;
        
        Scanner teclado= new Scanner(System.in);
        System.out.println("¿Tienes el título de Programador?");
        respuesta=teclado.nextLine();
        respuesta=respuesta.toUpperCase();
        
        if(respuesta.equals("S")){
            System.out.println("FELICIDADES EL PUESTO ES TUYO");
        }else if(respuesta.equals("N")){
            System.out.println("Sentimos no poder admitirte");
        }else
             System.out.println("Hay tienes la puerta"); 
         
        }
}
