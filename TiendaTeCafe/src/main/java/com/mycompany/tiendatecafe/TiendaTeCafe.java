package com.mycompany.tiendatecafe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TiendaTeCafe {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Te> TES = new ArrayList<>();
        String opcion, opcionte, tecaso1, tecaso2,tecasod,tecasoro,tecasone;
        boolean Cwhile1 = true, cwhilete, cwhilecafe = true, ctecaso1 = true;

        while (Cwhile1) {
            System.out.println("Que deseas comprar Te, Cafe, Borrar(Array), Ver(Array), Salir");
            opcion = teclado.next();
            cwhilete=true;// de lo contrario nunca vuelve a entrar en el while (cwhilete)
            if (opcion.equals("t")||opcion.equals("T")) {
                while (cwhilete==true) {// todos los tes
                    System.out.println("HAS SELECCINADO COMPRAR TE");
                    System.out.println("V-te verde, R-te rojo, D-depurativo, RO-roibos, N-te negro, S-salir");
                    opcionte = teclado.next().toUpperCase();
                    if (opcionte.equals("v")||opcionte.equals("V")) {
                            System.out.println("Has seleccinado Te Verde su precio es 4,5€ los 100gr");
                            System.out.println("¿Que cantidad deseas? 1-100gr, 2-200gr, 3-300, S-salir ");
                            tecaso1 = teclado.next();
                            switch (tecaso1) {
                                case "1":
                                    System.out.println("Has escogido 100gr de Te Verde. El precio es: 4,5€");
                                    TES.add(new Te("Te Verde", 100, 4.5));
                                    System.out.println(TES);
                                    break;
                                case "2":
                                    System.out.println("Has escogido 200gr de Te Verde. El precio es: 9€");
                                    TES.add(new Te("Te Verde", 200, 9));
                                    System.out.println(TES);
                                    break;
                                case "3":
                                    System.out.println("Has escogido 300gr de Te Verde. El precio es: 13,5€");
                                    TES.add(new Te("Te Verde", 300, 13.5));
                                    System.out.println(TES);
                                    break;
                                case "s":
                                    cwhilete = false;
                                    break;
                                case "S":
                                    cwhilete = false;
                                    break;
                        }//------------ fin tecaso1----------
                    }// fin if(v)
                    if (opcionte.equals("r")||opcionte.equals("R")) {
                            System.out.println("Has seleccinado Te Rojo su precio es 6€ los 100gr");
                            System.out.println("¿Que cantidad deseas? 1-100gr, 2-200gr, 3-300, S-salir ");
                            tecaso2 = teclado.next();
                            switch (tecaso2) {
                                case "1" -> {
                                    System.out.println("Has escogido 100gr de Te Rojo. El precio es: 6€");
                                    TES.add(new Te("Te Rojo", 100, 6));
                                    System.out.println(TES);
                            }
                                case "2" -> {
                                    System.out.println("Has escogido 200gr de Te Rojo. El precio es: 12€");
                                    TES.add(new Te("Te Rojo", 200, 12));
                                    System.out.println(TES);
                            }
                                case "3" -> {
                                    System.out.println("Has escogido 300gr de Te Rojo. El precio es: 18€");
                                    TES.add(new Te("Te Rojo", 300, 18));
                                    System.out.println(TES);
                            }
                                case "s" -> cwhilete = false;
                                case "S" -> cwhilete = false;
                            } // fin switch (tecaso2)
                    }//fin if(r)
                    if (opcionte.equals("d")||opcionte.equals("D")) {
                            System.out.println("Has seleccinado Te Depurativo su precio es 5€ los 100gr");
                            System.out.println("¿Que cantidad deseas? 1-100gr, 2-200gr, 3-300, S-salir ");
                            tecasod = teclado.next();
                            switch (tecasod) {
                                case "1" -> {
                                    System.out.println("Has escogido 100gr de Te Depurativo. El precio es: 5€");
                                    TES.add(new Te("Te Depurativo", 100, 5));
                                    System.out.println(TES);
                            }
                                case "2" -> {
                                    System.out.println("Has escogido 200gr de Te Depurativo. El precio es: 10€");
                                    TES.add(new Te("Te Depurativo", 200, 10));
                                    System.out.println(TES);
                            }
                                case "3" -> {
                                    System.out.println("Has escogido 300gr de Te Depurativo. El precio es: 15€");
                                    TES.add(new Te("Te Depurativo", 300, 15));
                                    System.out.println(TES);
                            }
                                case "s" -> cwhilete = false;
                                case "S" -> cwhilete = false;
                            } // fin switch (tecaso2)
                    }//fin if(d)
                    if (opcionte.equals("ro")||opcionte.equals("RO")) {
                            System.out.println("Has seleccinado Roibos su precio es 9€ los 100gr");
                            System.out.println("¿Que cantidad deseas? 1-100gr, 2-200gr, 3-300, S-salir ");
                            tecasoro = teclado.next();
                            switch (tecasoro) {
                                case "1":
                                    System.out.println("Has escogido 100gr de Roibos. El precio es: 9€");
                                    TES.add(new Te("Roibos", 100, 9));
                                    System.out.println(TES);
                                    break;
                                case "2":
                                    System.out.println("Has escogido 200gr de Roibos. El precio es: 18€");
                                    TES.add(new Te("Roibos", 200, 18));
                                    System.out.println(TES);
                                    break;
                                case "3":
                                    System.out.println("Has escogido 300gr de Roibos. El precio es: 27€");
                                    TES.add(new Te("Roibos", 300, 27));
                                    System.out.println(TES);
                                    break;
                                case "s":
                                    cwhilete = false;
                                    break;
                                case "S":
                                    cwhilete = false;
                                    break;
                        }//------------ fin tecasoro----------
                    }// fin if(Ro)                    
                    if (opcionte.equals("n")||opcionte.equals("N")) {
                            System.out.println("Has seleccinado Te Negro su precio es 9,5€ los 100gr");
                            System.out.println("¿Que cantidad deseas? 1-100gr, 2-200gr, 3-300, S-salir ");
                            tecasone = teclado.next();
                            switch (tecasone) {
                                case "1":
                                    System.out.println("Has escogido 100gr de Te Negro. El precio es: 9,5€");
                                    TES.add(new Te("Te Negro", 100, 9.5));
                                    System.out.println(TES);
                                    break;
                                case "2":
                                    System.out.println("Has escogido 200gr de Te Negro. El precio es: 19€");
                                    TES.add(new Te("Te Negro", 200, 19));
                                    System.out.println(TES);
                                    break;
                                case "3":
                                    System.out.println("Has escogido 300gr de Te Negro. El precio es: 28,5");
                                    TES.add(new Te("Te Negro", 300, 28.5));
                                    System.out.println(TES);
                                    break;
                                case "s":
                                    cwhilete = false;
                                    break;
                                case "S":
                                    cwhilete = false;
                                    break;
                        }//------------ fin tecasoro----------
                    }// fin if(n)                    
                    if (opcionte.equals("s")||opcionte.equals("S")) { 
                         cwhilete = false;
                    }// fin switch (opcionte)
                   
                }// fin while(cwhilete)
                   
            } else if (opcion.equals("c")||opcion.equals("C")) {
                System.out.println("Será la opcion cafe \n");
                Cwhile1 = false;
            } else if (opcion.equals("v") || opcion.equals("V")) {
                System.out.println("El Array TES se compone de:\n");
                System.out.println(TES);
//                Cwhile1 = false;
            }else if (opcion.equals("b")||opcion.equals("B")) {
                System.out.println("Array TES borrada");
                TES.clear();
                System.out.println(TES);
//                Cwhile1 = false;
            }else if (opcion.equals("S") || opcion.equals("s")) {
                System.out.println("Es salir");
                Cwhile1 = false;
            }

        }// fin while(Cwhile1)
        System.out.println("La lista de su compra es:");
        System.out.println(TES);

    }// fin main
}//fin class TeindaTeCafe--------
