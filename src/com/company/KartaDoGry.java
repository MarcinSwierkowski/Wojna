package com.company;

public class KartaDoGry {

    String figura;
    int mocFigury;
    String kolor;
    int mocKoloru;
    int id;
    int idGracza = 0; // 0-karta niczyja

    public KartaDoGry(String figura, int mocFigury, String kolor, int mocKoloru, int id) {
        this.figura = figura;
        this.mocFigury = mocFigury;
        this.kolor = kolor;
        this.mocKoloru = mocKoloru;
        this.id = id;
    }

    public void setIdGracza(int idGracza) {
        this.idGracza = idGracza;
    }

    public void showCard(){
        System.out.println(figura + " " + kolor);
    }
}
