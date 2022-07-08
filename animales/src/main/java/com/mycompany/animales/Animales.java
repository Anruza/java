
package com.mycompany.animales;

/**
 *
 * @author Angel
 */
public class Animales {

    public static void main(String[] args) {
        
     Animal leon1= new Animal("Leon",true,"la Selva","BRRRRRR");
     System.out.println(leon1);
     Animal pato1= new Animal("Pato",false,"los rios","cuac, cuac, cuac");
     System.out.println(pato1);
     Animal perro1= new Animal("Perro",true,"las pradera","guau, guau");
     System.out.println(perro1);
     Animal gato1= new Animal("Gato",true,"las pradera","miau, miau");
     System.out.println(gato1);
     System.out.println("Ladrido de perro: " + perro1.sonido);
        //System.out.println(ladrido(perro1.sonido));

        
    }////////////*********** funciones*******************
   // todo en la pestaña Animal***********************
}
