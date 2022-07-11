
package com.mycompany.concesionario;

/**
 *
 * @author Angel
 */
public class Motos {
    private String mmarca;
    private String mmodelo;
    private String mpotencia;
    private String mcolor;  
// -------------motos completo ----------------

    public Motos(String mmarca, String mmodelo, String mpotencia, String mcolor) {
        this.mmarca = mmarca;
        this.mmodelo = mmodelo;
        this.mpotencia = mpotencia;
        this.mcolor = mcolor;
    }

// -------------motos vacio ----------------
    public Motos() {
    }

    public String getMmarca() {
        return mmarca;
    }

    public void setMmarca(String mmarca) {
        this.mmarca = mmarca;
    }

    public String getMmodelo() {
        return mmodelo;
    }

    public void setMmodelo(String mmodelo) {
        this.mmodelo = mmodelo;
    }

    public String getMpotencia() {
        return mpotencia;
    }

    public void setMpotencia(String mpotencia) {
        this.mpotencia = mpotencia;
    }

    public String getMcolor() {
        return mcolor;
    }

    public void setMcolor(String mcolor) {
        this.mcolor = mcolor;
    }

    @Override
    public String toString() {
        return "MOTO 1 "+ "MARCA= " + mmarca + ", MODELO= " + mmodelo + ", POTENCIA= " + mpotencia + ", COLOR= " + mcolor;
    }

 public String toMoto2() {
        return "MOTO 2 "+ "MARCA= " + mmarca + ", MODELO= " + mmodelo + ", COLOR= " + mcolor;
    }
    
}
