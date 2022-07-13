
package com.mycompany.array1_1;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Array1_1 {

    public static void main(String[] args) {
        int elemento,x=0;
        String producto;
        Scanner entrada = new Scanner(System.in);
        
        String [] listaCompra = new String [4];
        elemento= listaCompra.length;
        
        while(x<elemento){
            System.out.println("Introduce el siguiente elemento");
            producto=entrada.next();
            listaCompra[x]=producto;
            x++;
        }
        for(String y: listaCompra){
            System.out.println("elemento " +y);
        }
        System.out.println("--------------------------------------------------");
        System.out.println("");
        for(int j=0; j<listaCompra.length; j++){
            System.out.println("Elemento "+ j + " es "+ listaCompra[j]);
        }
        
    }// ------------ fin MAIN-------------------
}
