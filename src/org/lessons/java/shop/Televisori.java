package org.lessons.java.shop;

import java.math.BigDecimal;

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
    public String toString(){
        return super.toString() + String.format(" misure: %d pollici, smart: %b", this.pollici, this.smart);
    }
}
