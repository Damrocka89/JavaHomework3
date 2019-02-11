package Kantor;

import java.util.HashMap;
import java.util.Map;

public class Kantor {

    private Map<String, Double> cenyKupna;
    private Map<String, Double> cenySprzedazy;

    public Kantor() {
        this.cenyKupna = new HashMap<>();
        this.cenySprzedazy = new HashMap<>();

        cenyKupna.put("EUR",4.31);
        cenyKupna.put("PLN",1.00);
        cenyKupna.put("CHF",3.80);
        cenyKupna.put("USD",3.82);
        cenyKupna.put("GBP",4.91);
        cenyKupna.put("AUD",2.69);

        cenySprzedazy.put("EUR",4.34);
        cenySprzedazy.put("PLN",1.00);
        cenySprzedazy.put("CHF",3.83);
        cenySprzedazy.put("USD",3.85);
        cenySprzedazy.put("GBP",4.95);
        cenySprzedazy.put("AUD",2.72);
    }



    private double wymianaWalut(String walutaKtoraSprzedajeKlient, String walutaKtoraKupujeKlient){
        return cenyKupna.get(walutaKtoraSprzedajeKlient)/cenySprzedazy.get(walutaKtoraKupujeKlient);
    }

    public double klientChceSprzedac(String walutaKtoraSprzedajeKlient,double iloscSprzedawanejWaluty, String walutaKtoraKupujeKlient){
        double kwota=(wymianaWalut( walutaKtoraSprzedajeKlient,  walutaKtoraKupujeKlient)*iloscSprzedawanejWaluty);
        kwota=zaokraglenie(kwota);
        System.out.println("Sprzedając "+iloscSprzedawanejWaluty+" "+walutaKtoraSprzedajeKlient+" dostaniesz "+kwota+" "+walutaKtoraKupujeKlient);
        return kwota;
    }

    public double klientChceKupic(String walutaKtoraSprzedajeKlient, String walutaKtoraKupujeKlient,double iloscKupowanejWaluty){
        double kwota =1000/(wymianaWalut( walutaKtoraSprzedajeKlient,  walutaKtoraKupujeKlient));
        kwota=zaokraglenie(kwota);
        System.out.println("Chcąc kupić "+iloscKupowanejWaluty+" "+walutaKtoraKupujeKlient+" musisz zapłacić "+kwota+" "+walutaKtoraSprzedajeKlient);
        return kwota;
    }

    private double zaokraglenie(double kwota) {
        kwota = kwota * 100;
        kwota = (double) ((int) kwota);
        kwota = kwota / 100;
        return kwota;
    }
}


