package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Televisori extends Prodotto{

    protected int pollici;
    protected boolean smart;

    

    public Televisori(String nome, String marca, BigDecimal prezzo , int pollici, boolean smart){
        super(nome,marca,prezzo);
        this.pollici = pollici;
        this.smart = smart;
    }

    public void setPollici(int pollici){
        this.pollici = pollici;
    }

    public int getPollici(){
        return pollici;
    }

    public void setSmart(boolean smart){
        this.smart = smart;
    }

    public boolean getSmart(){
        return smart;
    }

    @Override
    public void setSconto(boolean cartaFedelta){

        if(smart == true && cartaFedelta == true){
            this.prezzoScontato = getPriceIva().subtract(getPriceIva().multiply(new BigDecimal(0.10)).setScale(2, RoundingMode.DOWN));
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
        return super.toString() + String.format(" misure: %d pollici, smart: %b", this.pollici, this.smart);
    }
}
