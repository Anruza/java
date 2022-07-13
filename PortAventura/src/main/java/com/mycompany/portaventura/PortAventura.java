
package com.mycompany.portaventura;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PortAventura {

    public static void main(String[] args) {
        String mundo;
        int edad;
        boolean control=true, m1=true, m2=true, m3=true,m4=true,m5=true,m6=true;
        String [] ArrayMundos={"Sesamo Aventura", "Polynesia","China","Far West","Mediterranea","Mexico"};
        System.out.println("El Array se compone de: "+Arrays.toString(ArrayMundos));
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Que edad tienes?");
        edad=entrada.nextInt();

        while(control==true){
            System.out.println("Elejir el mundo al que quieres ir;");
            System.out.println("1-Sesamo Aventura; 2-Polynesia; 3-China; 4-Far West; 5-mediterranea; 6-Mexico; S-Para salir");
            mundo= entrada.next();           


//            if(mundo.equals("1")){
//               if(edad>=12){
//                   System.out.println("Lo sentimos tines que ser menor de 12 años para este mundo");
//               } else{
//                   System.out.println("Bienvenid@ a Sesamo Aventura");
//               } m1=false;
//            }else if(mundo.equals("2")){
//                System.out.println("Bienvenid@ a la Polynesia");
//                m2=false;
//                }
//            else if(mundo.equals("3")){
//                System.out.println("Bienvenid@ a la China");
//                m3=false;
//            } 
//            else if(mundo.equals("4")){
//                if(edad<=11){
//                   System.out.println("Lo sentimos tines que ser mayor de 11 años para este mundo");
//               } else{
//                   System.out.println("Bienvenid@ al Far West");
//                }m4=true;
//            }   
//            else if(mundo.equals("5")){
//                System.out.println("Bienvenid@ a la Mediterranea");
//                m5=true;
//            }                 
//            else if(mundo.equals("6")){
//                System.out.println("Bienvenid@ a Mexico");
//                m6=true;
//            }   
//             else if(mundo.equals("S")){
//                control=false;
//            }                
//            else if(mundo.equals("s")){
//                control=false;
//            }  

       
       switch (mundo){
            case "1":
              if(m1==true){
                if(edad>=12){
                   System.out.println("Lo sentimos tines que ser menor de 12 años para este mundo");
                } else{
                   System.out.println("Bienvenid@ a Sesamo Aventura");
                   m1=false;
                }  
              }else{
                  System.out.println("Lo sentimos ya has estado en Sesamo Aventura");
              }  
               break;
            case "2":
                if(m2==true){
                  System.out.println("Bienvenid@ a la Polynesia");
                  m2=false;
                } else {
                    System.out.println("Lo sentimos ya has estado en la Polynesia");
                }
                break;
            case "3":
                if(m3==true){
                    System.out.println("Bienvenid@ a la China");
                    m3=false;
                } else {
                    System.out.println("Lo sentimos ya has estado en la China");
                }
                break;
            case "4":
               if(m4==true){ 
                    if(edad<=11){
                       System.out.println("Lo sentimos tines que ser mayor de 11 años para este mundo");
                    } else{
                       System.out.println("Bienvenid@ al Far West");
                      m4=false;
                    }
               }else{
                       System.out.println("Lo sentimos ya has estado en el Far West");   
               }
                break;
            case "5":
                if(m5==true){ 
                    System.out.println("Bienvenid@ a la Mediterranea");
                    m5=false;
                }else{
                    System.out.println("Lo sentimos ya has estado en la Mediterranea");   
               }    
                break;
            case "6":
                if(m6==true){
                    System.out.println("Bienvenid@ a Mexico"); 
                    m6=false;
                }else{
                    System.out.println("Lo sentimos ya has estado en Mexico");   
               }  
                break;
            case "S":
                control=false;
                break;
            case "s":
                control=false;
                break; 
        }
      }    
    }// -------------- fin main ------------------------------
}
