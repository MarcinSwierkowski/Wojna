package com.company;

public class Gracz {

    int id;
    String name;
    int[] tablicaKart = new int[52];
    int ileKart ;

    public Gracz(int id ,String name) {
        this.id = id;
        this.name = name;
    }

    public void setIleKart(int ileKart) {
        this.ileKart = ileKart;
    }

    public void przedstawSie(){
        System.out.println(id + ": " + name + " - " + ileKart);
    }
}
