package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
   

    protected int code;
    protected String nome;
    protected String marca;
    protected BigDecimal prezzo;        //i BigDecimal vengono usati quando lavoriamo con le valute
    protected BigDecimal iva;

    

    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        Random rand = new Random();
        this.code = rand.nextInt(1000) + 1; // numero casuale da 1 a 1000
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public int getCode(){
        return code;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setPrezzo(BigDecimal prezzo){
        this.prezzo = prezzo;
    }

    public BigDecimal getPrezzo(){
        return prezzo;
    }

    public void setIva(BigDecimal iva){
        this.iva = iva;
    }

    public BigDecimal getIva(){
        return iva;
    }


    public BigDecimal getPriceIva() {
        if(prezzo != null && iva != null){
            return prezzo.multiply(iva).setScale(2, RoundingMode.DOWN); //setscale per gestire l'arrotondamento
        }else{
            return null;
        }
       
    }

    public String getFullName() {
        return code + "-" + nome;
    }
}
