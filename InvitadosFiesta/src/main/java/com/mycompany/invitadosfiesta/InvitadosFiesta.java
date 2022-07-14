

package com.mycompany.invitadosfiesta;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class InvitadosFiesta {

    public static void main(String[] args) {
        String entrada, nombre, buscar;
        int posicion,contador=0;
        boolean control=true, encontrado=true;
        Scanner dato = new Scanner(System.in); 
        ArrayList <String> invitados = new ArrayList<>();
        invitados.add("LUIS");
        invitados.add("JOSE");
        invitados.add("ROSA");
        invitados.add("MARIA");
        invitados.add("CARLOS");
        invitados.add("TERESA");
        invitados.add("MONTSE");
        invitados.add("ISABEL");
        invitados.add("ALEX");
        invitados.add("MARTA");      
        System.out.println("Los invitados son: "+invitados);       
        invitados.remove(8);
        invitados.remove(8);        
        System.out.println("Los invitados son: "+invitados); 
        invitados.add("EDU");
        invitados.add("MONICA");
        invitados.add("JUANI");
        
        System.out.println("Los invitados son: "+invitados);
        
  //--------------  EJERCCIO 2 --------------------------------      
        
        while(control==true){
            System.out.println("1-PARA AÑADIR; 2-PARA BORRAR; 3-BUSCAR; S-PARA SALIR");
            entrada=dato.next();
            switch (entrada){
                case "1":
                   System.out.println("NOMBRE DEL INVITAD@"); 
                   nombre=(dato.next()); 
                   System.out.println("INDICAR LA POSICIÓN DE ENTRADA ");
                   posicion=dato.nextInt();
                   invitados.add(posicion,nombre.toUpperCase());
                   System.out.println("Los invitados son: "+invitados);
                break; 
                case "2":
                    System.out.println("ESCRIBIR EL NOMBRE A BORRAR");
                    nombre=dato.next().toUpperCase(); 
                    invitados.remove(nombre);
//                     System.out.println("INDICAR LA POSICIÓN DE BORRADO");
//                    posicion=dato.nextInt();                  
//                    invitados.remove(posicion);
                    System.out.println("Los invitados son: "+invitados);
                break;
                case "3":
                    encontrado=false; // solucion RICARD eliminando parte del codigo.
                    System.out.println("BUSCAR ELEMENTO");
                    nombre=dato.next().toUpperCase();
                    for(int x=0; x<invitados.size();x++){
                        if(nombre.equals(invitados.get(x))){
                            encontrado=true;
                           // x=invitados.size();
                        }//else{
                         //   encontrado=false;
                        //}
                    }// fin for
                        if(encontrado==true){
                            System.out.println("El Array es: "+ invitados+ "");
                            System.out.println("Y el elemento: "+ nombre+ " SI esta incluido en el Array \n  ");
                        }else{
                            System.out.println("El Array es: "+ invitados+ " ");
                            System.out.println("El elemento: "+ nombre+ " NO esta incluido en el Array \n");
                        }      
                break;
                case "s":
                    control=false;
                break;
                case "S":
                    control=false;
                break;
            }//FIN SWITCH
        }// FIN WHILE
        
    }// fin main
}
