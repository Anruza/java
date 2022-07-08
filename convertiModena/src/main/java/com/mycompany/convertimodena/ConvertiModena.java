

package com.mycompany.convertimodena;
import java.util.Scanner;
/**
 *
 * @author Angel
 */
public class ConvertiModena {

    public static void main(String[] args) {
        
        float euro, yen, dolar, rublo;
        int cambio;
        boolean control=true;
        Scanner teclado= new Scanner(System.in);
        while(control==true){
            System.out.println("Cuantos € quieres convertir?");
            euro= teclado.nextFloat();
            System.out.println("A que moneda 1=dolares, 2=yenes, 3=rublos, 4=Salir");
            cambio= teclado.nextInt();
            switch (cambio){
                 case 1:
                    dolar= cdolar(euro);
                     System.out.println("El cambio de: "+euro+ " € a Dolares es: "+dolar +" Dolares");
                 break;
                 case 2:
                    yen= cyen(euro);
                     System.out.println("El cambio de: "+euro+ " € a Yenes es: "+ yen +" Yenes");
                 break;  
                 case 3:
                    rublo= crublo(euro);
                     System.out.println("El cambio de: "+euro+ " € a Rublos es: "+rublo +" Rublos");
                 break;
                 case 4:
                    control=false;
                 break;                  
             }
            
        }

  }
            
     //--------------funciones----------------
        static float cdolar(float a){ 
        float dolar= (float) (a*1.04);
        return dolar; 
        }
        static float cyen(float a){ 
        float yen= (float) (a*141.41);
        return yen; 
        }        
        static float crublo(float a){ 
        float rublo= (float) (a*56.96);
        return rublo; 
        }


}
