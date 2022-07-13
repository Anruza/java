

package com.mycompany.arraylist1;

import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> listaCompra2 = new ArrayList <>(4);// si dentro de los () ponemos un numero seran 
        ArrayList<Integer> preciosCompra2 = new ArrayList <>();//los elementos pero se pueden modificar
        
        listaCompra2.add("tomate"); // añade elementos al Array con Add
        listaCompra2.add("pepino");
        listaCompra2.add("pimiento");
        listaCompra2.add("limon");
        
        System.out.println(listaCompra2);// aun estando definido con 4 elementos se amplia sin problemas
        listaCompra2.add("naranja");
        listaCompra2.add("aceite");
        
        System.out.println(listaCompra2);// ha añadido 2 y los muestra incluso con la definicion de 4 elementos.
        
        // visualizar un elemento del array get()
        System.out.println("El indice 3 es: "+listaCompra2.get(3));// get con () que es una funcion
        // insertar elemento en Array existente con numero de indice y elemento.
        listaCompra2.add(3,"brocoli");
        System.out.println("El indice 3 es: "+listaCompra2.get(3));// get con () que es una funcion
        // cambiar un elemento con SET()
        listaCompra2.set(3, "coles de bruselas");
        System.out.println("El indice 3 es: "+listaCompra2.get(3));
        // eleminar elemento REMOVE()  CLEAR() borra todo el Array
        listaCompra2.remove(3);
        System.out.println(listaCompra2);
        System.out.println("Lista de la Compra tiene: "+listaCompra2.size()+" elementos.");
        //dimension del ArrayList es con SIZE() susutituye al .length
        // mostrat todo con un for each
        for(String x :listaCompra2){
            System.out.println("Ingrediente: "+ x);
        }
        // mostrar todo con bucle for se define el tipo de variable que usaremos
        for(int i=0;i<listaCompra2.size();i++){
            System.out.println(listaCompra2.get(i));
        }
        
        
        
        
    }// fin main
}
