
package com.mycompany.cajeroautomatico;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class CajeroAutomatico {

    public static void main(String[] args) {
        int total, r50, r20, t50,t20,t10,resul;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantos € quieres sacar?");
        System.out.println("Máximo 900€ mínimo 10€");
        total=entrada.nextInt();
        if(total>900 || total<10){
            System.out.println("INTRODUCIR UN VALOR ENTRE 10 Y 900 €");
        }else{

        if(total%50==0){//80
            resul=total/50;
            System.out.println("La peticon de "+total+ "€ sera en "+ resul+ " billetes de 50€");
        }else {
            t50=total/50;//1
            r50=total%50;//30
            if(r50%20==0){
                t20=(r50/20);
                System.out.println("La peticon de "+total+ "€ sera en "+ t50+ " billetes de 50€ y "+ t20 + " de 20€" );  
            }else {
                t50=total/50;//1
                t20=r50/20;//1
                r20=r50%20;//10
                t10=r20/10;//1
                System.out.println("La peticon de "+total+ "€ sera en "+ t50+ " billetes de 50€ "+ t20 + " de 20€ y "+ t10+ " de 10€"); 
            }
          }  
        }
             
    }// fin main
}
