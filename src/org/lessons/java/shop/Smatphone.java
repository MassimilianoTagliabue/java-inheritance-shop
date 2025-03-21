package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smatphone extends Prodotto{

    protected int codiceIMEI;
    protected int memoria;

    public Smatphone (String nome, String marca, BigDecimal prezzo , int codiceIMEI, int memoria){

        super(nome, marca, prezzo);
        this.codiceIMEI = codiceIMEI;
        this.memoria = memoria;
    }

    public void setCodiceIMEI(int codiceIMEI){
        this.codiceIMEI = codiceIMEI;
    }

    public int getCodiceIMEI(){
        return codiceIMEI;
    }

    public void setMemoria(int memoria){
        this.memoria = memoria;
    }

    public int getMemoria(){
        return memoria;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(" con codice IMEI: %d, e memoria: %dGB" , this.codiceIMEI, this.memoria);
    }
}
