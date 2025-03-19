package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smatphone extends Prodotto{

    protected int codiceIMEI;
    protected int memoria;

    public Smatphone ( String nome, String marca, BigDecimal prezzo , BigDecimal iva, int codiceIMEI, int memoria){

        super(nome, marca, prezzo, iva);
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

    public void printSmartphone(){
        System.out.println(nome + " " + marca + " " + codiceIMEI + " " + memoria + " " + getCode() );
    }
}
