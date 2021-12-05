package com.company;

public class Gracz {

    int id;
    String name;
    int[] tablicaKart = new int[60];
    private int ileKart ;

    public Gracz(int id ,String name) {
        this.id = id;
        this.name = name;
    }

    public void setIleKart(int ileKart) {
        this.ileKart = ileKart;
    }

    public int getIleKart() {
        return ileKart;
    }

    public void przedstawSie()
    {
        System.out.print(id + ": " + name + " - " + ileKart + "\t[ ");
        for (int i =0;i<ileKart;i++){
            System.out.print(tablicaKart[i] +" ");
        }
        System.out.println("]");
    }
}
