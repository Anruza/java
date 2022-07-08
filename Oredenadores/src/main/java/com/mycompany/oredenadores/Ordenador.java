/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oredenadores;

/**
 *
 * @author Angel
 */
public class Ordenador {
        private String marca;
        private double precio;
        private int ram;
        private int Hd;
        private boolean oferta=true;     
        
       public Ordenador(String marca, double precio, int ram,  int Hd, boolean oferta){
            this.marca= marca;
            this.precio=precio;
            this.ram=ram;
            this.Hd=Hd;
            this.oferta=oferta;
        }
       
  public String getMarca(){
      return marca;
  }     
  
  public void setMarca(String marca){
      this.marca=marca;
  }
   public double getPrecio(){
      return precio;
  }     
  
  public void setPrecio(double precio){
      this.precio=precio;
  }
  
  public int getRam(){
      return ram;
  }
  
  public void setRam(int ram){
      this.ram=ram;
  }
  
  public int getHD(){
      return Hd;
  }     
  
  public void setHD(int Hd){
      this.Hd=Hd;
  }
  
  public boolean getOferta(){
      return oferta;
  }
  
  public void setOferta(boolean oferta){
      this.oferta=oferta;
  }
  
       @Override
       public String toString(){
            String SO = "";
            if(oferta){ 
                SO = ", incluye un raton de Gamer";
            } else {
                SO = "";
            }
           return "Ordenador " +marca+",  precio: "+precio+ " €, "+ " RAM de: "+ram+ " Mb, Disco duro de: "+ Hd+ " Gb" +SO;           
       }
}
