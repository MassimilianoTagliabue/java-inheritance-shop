package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cuffie extends Prodotto{

    protected String colore;
    protected Boolean wireless;

    public Cuffie(String nome, String marca, BigDecimal prezzo , String colore, boolean wireless){
        super(nome, marca, prezzo);
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

    @Override
    public void setSconto(boolean cartaFedelta){

        if(wireless == true && cartaFedelta == true){
            this.prezzoScontato = getPriceIva().subtract(getPriceIva().multiply(new BigDecimal(0.05)).setScale(2, RoundingMode.DOWN));
        }else if(cartaFedelta = true){
            this.prezzoScontato = getSconto();
        }else{
            this.prezzoScontato = getSconto();
        }
    }

    @Override
    public BigDecimal getSconto(){
        return prezzoScontato;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(" colore: %s, wireless: %b", this.colore, this.wireless);
    }
}
