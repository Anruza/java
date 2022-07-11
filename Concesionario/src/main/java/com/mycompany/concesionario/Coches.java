
package com.mycompany.concesionario;

/**
 *
 * @author Angel
 */
public class Coches {
    private String cmarca;
    private String cmodelo;
    private String cpotencia;
    private String ccolor;

    // -------------coches completo ----------------

    public Coches(String cmarca, String cmodelo, String cpotencia, String ccolor) {
        this.cmarca = cmarca;
        this.cmodelo = cmodelo;
        this.cpotencia = cpotencia;
        this.ccolor = ccolor;
    }
 

    // -------------coches vacio ----------------
    public Coches() {
    }

    public String getCmarca() {
        return cmarca;
    }

    public void setCmarca(String cmarca) {
        this.cmarca = cmarca;
    }

    public String getCmodelo() {
        return cmodelo;
    }

    public void setCmodelo(String cmodelo) {
        this.cmodelo = cmodelo;
    }

    public String getCpotencia() {
        return cpotencia;
    }

    public void setCpotencia(String cpotencia) {
        this.cpotencia = cpotencia;
    }

    public String getCcolor() {
        return ccolor;
    }

    public void setCcolor(String ccolor) {
        this.ccolor = ccolor;
    }

    @Override
    public String toString() {
        return "COCHE 1 " + "MARCA= " + cmarca + ", MODELO= " + cmodelo + ", POTENCIA= " + cpotencia + ", COLOR= " + ccolor;
    }
     public String toCoche2() {
        return "COCHE 2 " + "MARCA= " + cmarca + ", MODELO= " + cmodelo  + ", COLOR= " + ccolor;
    }
}
