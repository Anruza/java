

package com.mycompany.testarrayclass;

import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class TestArrayClass {

    public static void main(String[] args) {
        // los Arrays necesitan la clase de datos con Wrapper class 
        // Bit, Short, Integer, Long, Float, Double, String, Double, Boolean, Character.-
        
        ArrayList<Tienda> productos = new ArrayList<>(); //clase creada en tienda
        Tienda p1= new Tienda("Robot","Juguete",15);
        Tienda p2= new Tienda("Jarron","Decoracion",18);
        Tienda p3= new Tienda("Tijeras","Papeliera",20);
        Tienda p4= new Tienda("Coche","Juguete",35);
        Tienda p5= new Tienda("Pincel","Papeleria",15);
        Tienda p6= new Tienda("Coca-Cola","refresco",1);
        Tienda p7= new Tienda("Kicos","Snak",5);
        
        System.out.println("Producto 3: "+ p3);
        System.out.println("productos"+productos);// vacio
        
        // rellenamos el Array productos con las estancias creadas 
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p6);
        productos.add(p7);
        // como hacerlo todo de un golpe
        productos.add(new Tienda("pipas","Snak",5));
        
        System.out.println("productos; "+productos);// lleno
        
        System.out.println(productos.get(4));
        
        

    }// fin main
}
