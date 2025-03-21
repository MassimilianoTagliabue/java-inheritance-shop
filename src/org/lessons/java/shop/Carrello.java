package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String oggettoDaAquistare;
        String nome;
        String marca;
        BigDecimal prezzo;
        String scelta;
        boolean cartaFedelta = false;



        System.out.println("cosa vuoi aquistare?");
        oggettoDaAquistare = in.nextLine().toLowerCase();

        System.out.println("hai la carta fedeltà ?");
        scelta = in.nextLine();

            if(scelta.equals("si")){
            cartaFedelta = true;
            }


        System.out.println("inserisci nome dell'oggetto:");
        nome = in.nextLine();
        System.out.println("inserisci la marca dell'oggetto:");
        marca = in.nextLine();
        System.out.println("inserisci il prezzo dell'oggetto:");
        prezzo = in.nextBigDecimal();


        if(oggettoDaAquistare.equals("televisore") || oggettoDaAquistare.equals("tv")){
            int pollici;
            boolean smart = false;

            
            System.out.println("inserisci la dimensione del telvisore in pollici:");
            pollici = in.nextInt();
            System.out.println("il televisore è smart ?");
            scelta = in.nextLine();

             if(scelta.equals("si")){
                 smart = true;
             }
            

            Televisori tv = new Televisori(nome, marca, prezzo, pollici, smart);
             tv.setSconto(cartaFedelta);
            System.out.println(tv);
            

        }else if(oggettoDaAquistare.equals("telefono") || oggettoDaAquistare.equals("smartphone")){
            int codiceIMEI;
            int memoria;

            System.out.println("inserisci il codice IMEI del telefono:");
            codiceIMEI = in.nextInt();
            System.out.println("inserisci la memoria del telefono:");
            memoria = in.nextInt();

            Smatphone telefono = new Smatphone(nome, marca, prezzo, codiceIMEI, memoria);
            telefono.setSconto(cartaFedelta);
            System.out.println(telefono);

        }else if(oggettoDaAquistare.equals("cuffie") || oggettoDaAquistare.equals("auricolari")){
            String colore;
            boolean wireless = false;

            System.out.println("inserisci il colore delle cuffie:");
            colore = in.nextLine();
            System.out.println("le cuffie sono wireless ? ");
            scelta = in.nextLine();

            if(scelta.equals("si")){
                wireless = true;
             }
    
             Cuffie cuffie = new Cuffie(nome, marca, prezzo, colore, wireless);
             cuffie.setSconto(cartaFedelta);
             System.out.println(cuffie);
        }

        
        
    }
}
