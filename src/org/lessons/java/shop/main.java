package org.lessons.java.shop;

import java.math.BigDecimal;

public class main {

    public static void main(String[] args) {
        
        Prodotto acqua = new Prodotto("acqua", "guizza", new BigDecimal(1), new BigDecimal(0.22));

        Smatphone s20 = new Smatphone("s20", "samsung", new BigDecimal(500), new BigDecimal(0.22), 21321321, 128);

        s20.printSmartphone();
    }
}
