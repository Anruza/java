/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany._bucles;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        potencia Math.pow(a,b)
//          prog
//        int num1, num2;
//        System.out.println("Introducir el numero base");
//        num1=teclado.nextInt();   
//        System.out.println("a que pontencia lo quieres");
//        num2=teclado.nextInt();  

//        System.out.println("El resultado de elevar "+ num1+ " a la "+ num2+" potencia es: "+Math.pow(num1, num2));
        //------------------------------------------------------------------------------------    
        // numero aleatorio Math.random()
        // genera un numero entre 0 y 0.99 si lo multiplicas por 10 seran solo del 1 al 10
        // ceil (cielo) nunca saldra el 0, 
        //floor (abajo) nunca saldra el 10
        //prog
        //int aleatorio = (int) Math.ceil(Math.random()*20); // evitamos los decimales y lo da por arriba
        //System.out.println(" El númro aleatorio es: "+aleatorio);
        //--------------------------------------------------------------------------  
        // bucle FOR imprime del 1 al 10
        // prog
//      for(int i=1; i<=10; i++){
//          System.out.println(i);
//      }
        //----------------------------------------------------------
        // bucle WHILE imprime del 1 al 10 y sale del bucle al llegar a 10
        //prog
//      int i=0;
//      boolean condicion =false;
//      while(condicion == false){
//          System.out.println(i);
//          i++;
//          if(i==10){
//              condicion=true;
//          }
//      }
        //-------------------------------------------------------------   
        // ARRAYS (BASICO)
        // todos los datos del array mismo tipo
        // int[] edad {5,15,25,35,45}; lo mismo que la deficion de uno a uno de ab
//   int [] edad = new int [5]; // es lo mismo que int edad[] = new int [5] arraya edad con 5 elementos
//   
//    edad[0]=5;
//    edad[1]=15;
//    edad[2]=25;
//    edad[3]=35;
//    edad[4]=45;
//    
//    for(int i=0; i<edad.length; i++){
//    System.out.println(edad[i]);
//    }
        //----------------------------------------------------------------
        // Array con String
        // prog
//    String[] nombres ={"Angel", "Rosa", "Alejandro", "Albert", "Eustaquio", "Gertrudis", "Apolonio", "Luis"};
//    
//     for(int i=0; i<nombres.length; i++){
//            System.out.println(nombres[i]);
//    }
//    
//     for(String j : nombres){ // seria un for each para toda una array importante indicar el tipo de dato String en este caso
//         System.out.println(j); 
//     }
//    
        //-*******************---EJERCICOS------------*****************************---------------------***********
        // AREA DE UN CIRCULO 
        //** prog
//        int radio ;
//        System.out.println("Introducir radio de la circunferencia");
//        radio=teclado.nextInt();   
//         
//        
//        System.out.println("El área de una circunferenica de radio "+ radio + " es: " + 3.1415927* Math.pow(radio,2));
        //****-----------------------------------------------------------------------------------------------   
        // ACERTAR NÚMERO RANDOM()
//        int secreto, entrada, veces = 1;
//        boolean intentos = true;
//        secreto = (int) Math.ceil(Math.random() * 10);
//        
//            System.out.println("Adivinar el numero secreto entre el 1 y el 10");
//        while (intentos == true) {
//            entrada = teclado.nextInt();
//            if (entrada == secreto) {
//                System.out.println("FELICIDADES EL NÚMERO SECRETO ERA: " + secreto + " y lo has acertado en: " + veces + " intentos");
//                intentos = false;
//            } else {
//                System.out.println("INTENTALO DE NUEVO");
//                veces++;
//            }
//        }

        //ARRAY CON POTENCIAS
        // PROG
//        int mitad;
//        int[] numeros={3,5,7,9,11,2,4,6,8,10};
//         System.out.println("-----------------------CAUDRADOS FOR------------------------------------------");       
//            mitad=numeros.length/2;
//            for(int i=mitad; i<numeros.length; i++){
//               System.out.println("El cuadrado de "+numeros[i]+" es "+ Math.pow(numeros[i], 2));
//                
//            }
//        System.out.println("-----------------------CUBOS FOR ------------------------------------------");//for(int j=0; j<numeros.length; j++)
//            for(int j=0; j<numeros.length; j++){
//                System.out.println("El cubo de "+numeros[j]+" es "+ Math.pow(numeros[j], 3));
//           }
//        System.out.println("------------CUADRADOS FOR EACH-----------------------------------------------------");
//           
//           for(int x:numeros){
//                System.out.println("El cuadrado de "+(x)+" es "+ Math.pow((x),2));
//           }
//         System.out.println("------------CUBOS FOR EACH-----------------------------------------------------");
//           for(int y:numeros){
//                System.out.println("El cuadrado de "+(y)+" es "+ Math.pow((y),3));    
//           }
//*****************************************************************************************************
    //-------------RESTAURANTE DESCUENTO ---------------------
//        int total1=0, resul1=0;
//
//        System.out.println("Introducir el total de la consumición");
//        total1=teclado.nextInt();
// 
//        if(total1<=100){
//                System.out.println("El total a pagar es:"+total1*1.1 );
//            }else if(total1>100 && total1<=200) {
//                resul1=(int) (total1 -(total1*.1)*1.1);
//                System.out.println("El total a pagar con 10% de descuento es:"+ resul1 );
//            }else if(total1>200 && total1<=300) {
//                System.out.println("El total a pagar con 20% de descuento es:"+(total1 -(total1*.2)*1.1) );
//            }else if(total1>300) {
//                System.out.println("El total a pagar con 30% de descuento es:"+(total1 -(total1*.3)*1.1) );
//            }
//   ///***********************************************************************************************************     
        // ACERTAR NÚMERO RANDOM() Y SALIR CON "S"
//        String entrada1;
//        int secreto1, veces1=1;
//        boolean intentos1 = true;
//        secreto1 = (int) Math.ceil(Math.random() * 10);
//        String pepito=String.valueOf(secreto1); // **conversion de int a string**
//            System.out.println("ADIVINAR UN NUMERO ENTRE 1 Y EL 10");
//            System.out.println("secreto= "+secreto1);
//        while (intentos1 == true) {  
//            entrada1 = teclado.nextLine();
//            if (entrada1.equals(pepito)) {
//                System.out.println("FELICIDADES EL NÚMERO SECRETO ERA: " + secreto1 + " y lo has acertado en: " + veces1 + " intentos");
//                intentos1 = false;
//            } else if(entrada1.equals("S") || entrada1.equals("s")){
//                System.out.println("HAS PRESIONADO 'S' PARA SALIR");
//                intentos1 = false;
//            }else if(veces1==3){
//                System.out.println("YA HAS REALIZADO 3 INTENTOS");
//                veces1++;
//            }else if(veces1==6){
//                System.out.println("YA HAS REALIZADO 6 INTENTOS");
//                veces1++;
//            }else if(veces1==9){
//                System.out.println("YA HAS REALIZADO 9 INTENTOS; PELIN TORPE ¿NO?");
//                veces1++;
//            }else{
//                System.out.println("INTENTALO DE NUEVO");
//                veces1++;
//            }
//        }
    ///*****************************************************************************************
    //-------------------- RECORRER UN ARRAY Y SUMAR SUS CONTENIDOS --------------------------------------
        int entrarray, control=0, suma=0;
        int [] numarra = new int [5];       
            while (control <5) {
                System.out.println("INTRUDUCE UN NUEVO ELEMLENTO DEL ARRAY");  
                entrarray = teclado.nextInt();
                numarra[control]=entrarray;
                suma=suma+entrarray;
                control=control+1;  

            }
//            System.out.print("los elementos del array son: " + numarra[control]+" ;");
            System.out.println("la suma total de los elementos del array: " + "es: "+ suma);
            
 ///*****************************************************************************************           
            
            
        //no borrar ----------------------------- 
    }
}
