package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto{

    protected int pollici;
    protected boolean smart;

    public Televisori(String nome, String marca, BigDecimal prezzo , BigDecimal iva, int pollici, boolean smart){
        super(nome,marca,prezzo,iva);
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

    public void printTelevisore(){
        System.out.println(nome + "" + marca + " " + pollici + " " + smart + " " + getCode() + " " + getPriceIva());
    }
}
