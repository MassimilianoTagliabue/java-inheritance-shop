package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{

    protected String colore;
    protected Boolean wireless;

    public Cuffie(String nome, String marca, BigDecimal prezzo , BigDecimal iva, String colore, boolean wireless){
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    
    }

    public void setColore(String colore){
        this.colore = colore;
    }

    public String getColore(){
        return colore;
    }

    public void setWireless(boolean wireless){
        this.wireless = wireless;
    }

    public boolean getWireless(){
        return wireless;
    }

    public void printCuffie(){
        System.out.println(nome + " " + marca + " " + colore + " " + wireless + " " + getCode() + " " + getPriceIva());
    }
}
