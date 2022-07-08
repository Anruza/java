
package com.mycompany.perrosport;

/**
 *
 * @author Angel
 */
public class Perro {
    String nombre="";
    String idioma="";
    boolean salta=true;
    int recorrido=0;
    public Perro(String nombre,String idioma,int recorrido,boolean salta){
        this.nombre=nombre;
        this.idioma=idioma;
        this.salta=salta;
        this.recorrido=recorrido;
    }
  @Override
    public String toString(){
        
        String mami = "";
        if(salta){
           mami="salta vallas";
        }else {
            mami="no salta";
        }
        return "El Perro se llama: "+nombre+", habla: " +idioma+" " +mami + " y ha recorrido: "+recorrido+ " kilometros";
      
    }
}
