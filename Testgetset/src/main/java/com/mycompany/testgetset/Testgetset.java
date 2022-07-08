
package com.mycompany.testgetset;

/**
 *
 * @author Angel
 */
public class Testgetset {

    public static void main(String[] args) {
      Persona persona1 = new Persona("Angel", 62, "465216546W");  
      System.out.println(persona1);  
      Persona persona2 = new Persona("Rosa", 32, "446515446J");  
      System.out.println(persona2);
      persona2.setNombre("Alejandro");
      System.out.println(persona2);
      Persona persona3 = new Persona();  
      System.out.println(persona3);
      System.out.println("Ejemplo retorno get nombre "+persona1.getNombre());
      System.out.println("Ejemplo sin retorno "+ persona1);
      persona1.setNombre("Luis");
      System.out.println("cambio con setNombre "+ persona1);
      persona1.setDni("35026256Q");
      System.out.println("cambio con setDni "+ persona1);
      persona2.setDni("35026256Q");
      System.out.println("cambio con setDni "+ persona2.getDni());
    }
}
