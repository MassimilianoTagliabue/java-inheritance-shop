package org.lessons.java.shop;

import java.math.BigDecimal;

public class main {

    public static void main(String[] args) {
        
        Prodotto acqua = new Prodotto("acqua", "guizza", new BigDecimal(1), new BigDecimal(0.22));

        Smatphone s20 = new Smatphone("s20", "samsung", new BigDecimal(500), new BigDecimal(0.22), 21321321, 128);

        Televisori lg = new Televisori("lg", "lg", new BigDecimal(300), new BigDecimal(0.22), 50, true);

        Cuffie rgb = new Cuffie("rgb", "logitech" ,new BigDecimal(230), new BigDecimal(0.22), "verde", false);

        

        System.out.println(lg);

    }
}
