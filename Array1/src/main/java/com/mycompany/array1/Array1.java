
package com.mycompany.array1;

/**
 *
 * @author Angel
 */
public class Array1 {

    public static void main(String[] args) {
        String [] listaCompra = new String [4];
        listaCompra[0]="zanahoria";
        listaCompra[1]="platano";
        listaCompra[2]="naranga";
        listaCompra[3]="limon";
        
        for(int x=0; x<listaCompra.length; x++){
            System.out.println("Elemento "+ x + " es "+ listaCompra[x]);
        }
        System.out.println("--------------------------------------------");
        String [] listaCompra2={"palomitas", "naranjas", "colacao","mandarinas", "butifarra","limones"  };
        
         for(String x: listaCompra2){
             
            System.out.println("elemento " +x);
        }
         System.out.println("--------------------------------------------");
        listaCompra2 [2]= "bizcocho";
        listaCompra2 [4]= "jamon";
        
        System.out.println("");
        System.out.println("------------------------------------------------");
        for(String x: listaCompra2){
            System.out.println("elemento " +x);
        }
        
        
        
    }/// fin main
}
