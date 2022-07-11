

package com.mycompany.concesionario;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Concesionario {

    public static void main(String[] args) {
       String cmarca, mmarca,cmodelo, mmodelo, cptencia, mpotencia, ccolor, mcolor;
       
       Coches coche1 = new Coches("SEAT", "1430", "1200", "amarillo");
       Coches coche2 = new Coches();
       Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir la marca del coche ");
        cmarca=entrada.next();
        System.out.println("Introducir el modelo del coche ");
        cmodelo=entrada.next();
        System.out.println("Introducir la potencia del coche ");
        cptencia=entrada.next();
        System.out.println("Introducir el color del coche ");
        ccolor=entrada.next();
        
 
        coche2.setCmarca(cmarca);
        coche2.setCmodelo(cmodelo);
        coche2.setCpotencia(cptencia);
        coche2.setCcolor(ccolor);
        //System.out.println(coche2);
     
        //System.out.println(coche3.toCoche2());
        
       Motos moto1= new Motos("YAMAHA","250","250","negra");
       Motos moto2 = new Motos();
        System.out.println("Introducir la marca de la moto ");
        mmarca=entrada.next();
        System.out.println("Introducir el modelo de la moto ");
        mmodelo=entrada.next();
        System.out.println("Introducir la potencia de la moto ");
        mpotencia=entrada.next();
        System.out.println("Introducir el color de la moto ");
        mcolor=entrada.next();
        
        
        moto2.setMmarca(mmarca);
        moto2.setMmodelo(mmodelo);
        moto2.setMpotencia(mpotencia);
        moto2.setMcolor(mcolor);
       
       
        System.out.println(coche1);
        System.out.println(moto1);
        System.out.println(coche2.toCoche2());
        System.out.println(moto2.toMoto2());
    
    }// fin main   funciones
    
}//fin class
