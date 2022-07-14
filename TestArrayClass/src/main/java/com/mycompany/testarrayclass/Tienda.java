
package com.mycompany.testarrayclass;

import java.util.logging.Logger;

/**
 *
 * @author Angel
 */
public class Tienda {
    private String name="";
    private String section="";
    private double price=0;
    
    public Tienda(String name,String section,double price){
        this.name=name;
        this.price=price;
        this.section=section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n nombre= " + name + ", seccion=" + section + ", precio=" + price;
    }
    

   
}
