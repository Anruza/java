

package com.mycompany.supreheroes;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Supreheroes {

    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        String entrada1, entrada2,persona1="",persona2="";
        int ent1, ent2, puntos1=0, puntos2=0;
              
        Heroe heroe1 = new Heroe("Medico","Lugares depremidos","Salvar vidas.",75);
        Heroe heroe2 = new Heroe("Bombero","Todo el mundo","Salvar vidas.",80);
        Heroe heroe3 = new Heroe("Madre","Todo el mundo","Engendrar vida.",100);
        Heroe heroe4 = new Heroe("Profesor","Solo donde puenden","Enseñar a pensar.",85);
        Heroe heroe5 = new Heroe("Familia","Todo el mundo","Ayudan con todo.",90);
            System.out.println("Introdir un numero del 1 al 5");
            entrada1=entrada.next();
            System.out.println("Elegir un numero del 1 al 5");
            entrada2=entrada.next();
        
        //System.out.println((heroe+entrada1).nombre);
        System.out.println(heroe1);
        System.out.println(heroe2);
        System.out.println(heroe3);
        System.out.println(heroe4);
        System.out.println(heroe5);
        System.out.println(heroe1.nombre);
        System.out.println(heroe1.puntos);
        
        switch (entrada1) { 
            case "1":
                puntos1 = heroe1.puntos;
                persona1=heroe1.nombre;
                break;
            case "2":
                puntos1 = heroe2.puntos;
                persona1=heroe2.nombre;
                break;
            case "3":
                puntos1 = heroe3.puntos;
                persona1=heroe3.nombre;
                break;
            case "4":
                puntos1 = heroe4.puntos;
                persona1=heroe4.nombre;
                break;
            case "5":
                puntos1 = heroe5.puntos;
                persona1=heroe5.nombre;
                break;
            default:
                break;
        }
        
//         if(entrada2.equals("1")){ 
//                puntos2 = heroe1.puntos;
//                persona2=heroe1.nombre;
//            } else if(entrada1.equals("2")){
//                puntos2 = heroe2.puntos;
//                persona2=heroe2.nombre;
//            } else if(entrada1.equals("3")){
//                puntos2 = heroe3.puntos;
//                persona2=heroe3.nombre;
//            } else if(entrada1.equals("4")){
//                puntos2 = heroe4.puntos;
//                persona2=heroe4.nombre;
//            } else if(entrada1.equals("5")){
//                puntos2 = heroe5.puntos;
//                persona2=heroe5.nombre;
//            }else {

            switch (entrada2) { 
            case "1":
                puntos2 = heroe1.puntos;
                persona2=heroe1.nombre;
                break;
            case "2":
                puntos2 = heroe2.puntos;
                persona2=heroe2.nombre;
                break;
            case "3":
                puntos2 = heroe3.puntos;
                persona2=heroe3.nombre;
                break;
            case "4":
                puntos2 = heroe4.puntos;
                persona2=heroe4.nombre;
                break;
            case "5":
                puntos2 = heroe5.puntos;
                persona2=heroe5.nombre;
                break;
            default:
                break;
        } 
            
            if(puntos1<puntos2){
                //System.out.println("a<b");
               System.out.println("El heroe: "+persona1+ " con "+puntos1+ " puntos es menor al heroe: "+persona2+ " con "+ puntos2+" puntos");
            }else{
                //System.out.println("a>b");
                System.out.println("El heroe: "+persona2+ " con "+puntos2+ " puntos es superior al heroe: "+persona1+ " con "+ puntos1+" puntos" );       
            }
         
    }//------------- FUNCIONES --------------------


}
