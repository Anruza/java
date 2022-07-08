
package com.mycompany.testgetset;

/**
 *
 * @author Angel
 */
public class Persona {
    
    private String nombre="";
    private int edad=0;
    private String dni="";
    
    public Persona(){
        
    };
    
    public Persona(String nombre,int edad,String dni){
        this.dni=dni;
        this.edad=edad;
        this.nombre= nombre;
        System.out.println("Se ha crado la persona "+nombre);
    }
    // getters y setters------------------
    //getters lee dato y lo devuelve
    //setters establece dato cambiandolo o lo crea************************
    

    public String getNombre(){
        return nombre;
    }
     
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
   
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
   
    public String getDni(){
        return dni;
    }
    
    public void setDni(String dni){
        this.dni=dni;
    }
    
    @Override
    public String toString(){
        return "El nombre es: "+ nombre+ " la edad es: "+ edad+" el DNI es: "+dni;
    }
}
