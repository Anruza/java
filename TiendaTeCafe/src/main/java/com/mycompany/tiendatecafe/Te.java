
package com.mycompany.tiendatecafe;

/**
 *
 * @author Usuario
 */
public class Te {
    private String nombre="";
    private int peso=0;
    private double precio=0;
    //private String procede="";
    //private String descripcion="";
    //private int  intensidad=0;
        
    public Te(String nombre,int peso,double precio) {
        this.nombre=nombre;
        this.peso=peso;
        this.precio=precio;
        //this.descripcion=descripcion;
        //this.intensidad=intensidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }



    @Override
    public String toString() {
        return "\n" + "nombre= " + nombre + " peso en gr. "+ peso + ", precio= " + precio;
    }
    
    
}
