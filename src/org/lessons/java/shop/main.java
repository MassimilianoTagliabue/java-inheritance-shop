package org.lessons.java.shop;

import java.math.BigDecimal;

public class main {

    public static void main(String[] args) {
        
        Prodotto acqua = new Prodotto("acqua", "guizza", new BigDecimal(1));

        Smatphone s20 = new Smatphone("s20", "samsung", new BigDecimal(500), 21321321, 128);

        Televisori lg = new Televisori("lg", "lg", new BigDecimal(300), 50, true);

        Cuffie rgb = new Cuffie("rgb", "logitech" ,new BigDecimal(230), "verde", false);

        

        System.out.println(lg);

    }
}
