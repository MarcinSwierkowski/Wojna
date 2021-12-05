package com.company;

public class KartaDoGry {

    private String figura;
    private int mocFigury;
    private String kolor;
    private int mocKoloru;
    private int id;

    public KartaDoGry(String figura, int mocFigury, String kolor, int mocKoloru, int id) {
        this.figura = figura;
        this.mocFigury = mocFigury;
        this.kolor = kolor;
        this.mocKoloru = mocKoloru;
        this.id = id;
    }

    public int getMocFigury() {
        return mocFigury;
    }

    public void showCard(){
        System.out.println(figura + " " + kolor);
    }
}
