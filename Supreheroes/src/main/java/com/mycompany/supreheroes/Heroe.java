
package com.mycompany.supreheroes;

/**
 *
 * @author Angel
 */
public class Heroe {
    public String nombre;
    public String lugar;
    public String habilidad;
    public int puntos;
    public Heroe(String nombre,String lugar,String habilidad,int puntos){
        this.nombre=nombre;
        this.lugar=lugar;
        this.habilidad=habilidad;
        this.puntos=puntos;
    }
    
   @Override
     public String toString(){      
        return "El nombre es: "+ nombre+ ", el lugar de acción es: "+ lugar+", su poder: "+habilidad;
      }
    
}
