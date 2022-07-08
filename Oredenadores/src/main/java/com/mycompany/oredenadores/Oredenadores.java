
package com.mycompany.oredenadores;

/**
 *
 * @author Angel
 */
public class Oredenadores {

    public static void main(String[] args) {
        
     Ordenador ordenador1 =new Ordenador("HP", 250, 64,2,true);   
     System.out.println(ordenador1);
     ordenador1.setMarca("IBM");
        System.out.println(ordenador1.getMarca());
        System.out.println(ordenador1);
     Ordenador ordenador2 = new Ordenador("ASUS", 450,32,1,false); 
     System.out.println(ordenador2); 
     Ordenador ordenador3 = new Ordenador("CLONICO", 550,16,2,true); 
     System.out.println(ordenador3);         
    }      
}
