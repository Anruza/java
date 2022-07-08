
package com.mycompany.animales;

/**
 *
 * @author Angel
 */
 public class Animal{
    public String nombre;
    public boolean mamifero;
    public String habitat;
    public String sonido;
    
    
    public Animal(String nombre,boolean mamifero,String habitat,String sonido){
        this.nombre=nombre;
        this.mamifero=mamifero;
        this.habitat=habitat;
        this.sonido=sonido;  
    }
    @Override
    public String toString(){
        String mami = "mamifero";
        if(mamifero){
            mami=mami;
        }else {
            mami="no "+ mami;
        }
        return "Es un animal: "+mami+", de nombre: " +nombre+", su habitat son: " + habitat+ " y su sonido es: "+sonido;
        }
 
     public String ladrido(String a){ 
        String perro2="";
        //perro2= perro1.sonido;
        return a; 
        }
  }
