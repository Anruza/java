

package com.mycompany.arraylist3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class ArrayList3 {

    public static void main(String[] args) {
        String elemento1,elemento;
        
        Scanner dato = new Scanner(System.in);
        ArrayList<String> colegas = new ArrayList<> (Arrays.asList("ANGEL", "ROSA", "MARTINA","ALEJANDRO","ARNAU","YERBA","MARCELO","RICARD","ALBERT"));
        
        ArrayList<Integer> edades = new ArrayList<> (Arrays.asList(1,5,8,14,56,87,32,16,48,99,12));        
        System.out.println();
        
        while(true){
            System.out.println("1-añadir elemento; 2-añadir en posición; 3-buscar elemento; 4-borrar; S-salir");
            elemento1=dato.next();
          switch (elemento1){

              case "1":
                  
              break;
          }// fin switch
        
        }// fin while
          // ENCONTRAR EL INDICE DE UN ELEMENTO.  idexOf()      
                System.out.println(colegas);
                int indice=colegas.indexOf("ROSA"); // SI EL RESULTADO ES -1 NO ESTA EN LA LISTA
                System.out.println(indice);       
        
        //SI EXISTE ESE ELEMENTO EN LA LISTA (contains) boolean
        boolean encontrado=colegas.contains("ROSA");
        if(encontrado){// es lo mismo que encontrado==true
            System.out.println("encontrado");                
        }else{
            System.out.println("no encontrado");
        }
        // ORDENAR SORT colections.sort(colegas) string
        Collections.sort(colegas);
        System.out.println(colegas);
        // ORDENAR SORT colections.sort(edades) numeros        
        Collections.sort(edades);
        System.out.println(edades);
        // los Arrays necesitan la clase de datos con Wrapper class 
        // Bit, Short, Integer, Long, Float, Double, String, Double, Boolean, Character.-
        
        
    }// fin main
}
