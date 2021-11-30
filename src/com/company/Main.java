package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] tablicakart = new int[51];
        int idGracz1 = 1;
        int idGracz2 = 2;

        KartaDoGry kier2 = new KartaDoGry("2",2,"Kier", 1,0);
        KartaDoGry kier3 = new KartaDoGry("3",3,"Kier", 1,1);
        KartaDoGry kier4 = new KartaDoGry("4",4,"Kier", 1,2);
        KartaDoGry kier5 = new KartaDoGry("5",5,"Kier", 1,3);
        KartaDoGry kier6 = new KartaDoGry("6",6,"Kier", 1,4);
        KartaDoGry kier7 = new KartaDoGry("7",7,"Kier", 1,5);
        KartaDoGry kier8 = new KartaDoGry("8",8,"Kier", 1,6);
        KartaDoGry kier9 = new KartaDoGry("9",9,"Kier", 1,7);
        KartaDoGry kier10 = new KartaDoGry("10",10,"Kier", 1,8);
        KartaDoGry kierJ = new KartaDoGry("J",11,"Kier", 1,9);
        KartaDoGry kierD = new KartaDoGry("D",12,"Kier", 1,10);
        KartaDoGry kierK = new KartaDoGry("K",13,"Kier", 1,11);
        KartaDoGry kierA = new KartaDoGry("A",14,"Kier", 1,12);

        KartaDoGry karo2 = new KartaDoGry("2",2,"Karo", 2,13);
        KartaDoGry karo3 = new KartaDoGry("3",3,"Karo", 2,14);
        KartaDoGry karo4 = new KartaDoGry("4",4,"Karo", 2,15);
        KartaDoGry karo5 = new KartaDoGry("5",5,"Karo", 2,16);
        KartaDoGry karo6 = new KartaDoGry("6",6,"Karo", 2,17);
        KartaDoGry karo7 = new KartaDoGry("7",7,"Karo", 2,18);
        KartaDoGry karo8 = new KartaDoGry("8",8,"Karo", 2,19);
        KartaDoGry karo9 = new KartaDoGry("9",9,"Karo", 2,20);
        KartaDoGry karo10 = new KartaDoGry("10",10,"Karo", 2,21);
        KartaDoGry karoJ = new KartaDoGry("J",11,"Karo", 2,22);
        KartaDoGry karoD = new KartaDoGry("D",12,"Karo", 2,23);
        KartaDoGry karoK = new KartaDoGry("K",13,"Karo", 2,24);
        KartaDoGry karoA = new KartaDoGry("A",14,"Karo", 2,25);

        KartaDoGry pik2 = new KartaDoGry("2",2,"Pik", 3,26);
        KartaDoGry pik3 = new KartaDoGry("3",3,"Pik", 3,27);
        KartaDoGry pik4 = new KartaDoGry("4",4,"Pik", 3,28);
        KartaDoGry pik5 = new KartaDoGry("5",5,"Pik", 3,29);
        KartaDoGry pik6 = new KartaDoGry("6",6,"Pik", 3,30);
        KartaDoGry pik7 = new KartaDoGry("7",7,"Pik", 3,31);
        KartaDoGry pik8 = new KartaDoGry("8",8,"Pik", 3,32);
        KartaDoGry pik9 = new KartaDoGry("9",9,"Pik", 3,33);
        KartaDoGry pik10 = new KartaDoGry("10",10,"Pik", 3,34);
        KartaDoGry pikJ = new KartaDoGry("J",11,"Pik", 3,35);
        KartaDoGry pikD = new KartaDoGry("D",12,"Pik", 3,36);
        KartaDoGry pikK = new KartaDoGry("K",13,"Pik", 3,37);
        KartaDoGry pikA = new KartaDoGry("A",14,"Pik", 3,38);

        KartaDoGry trefl2 = new KartaDoGry("2",2,"Trefl", 4,39);
        KartaDoGry trefl3 = new KartaDoGry("3",3,"Trefl", 4,40);
        KartaDoGry trefl4 = new KartaDoGry("4",4,"Trefl", 4,41);
        KartaDoGry trefl5 = new KartaDoGry("5",5,"Trefl", 4,42);
        KartaDoGry trefl6 = new KartaDoGry("6",6,"Trefl", 4,43);
        KartaDoGry trefl7 = new KartaDoGry("7",7,"Trefl", 4,44);
        KartaDoGry trefl8 = new KartaDoGry("8",8,"Trefl", 4,45);
        KartaDoGry trefl9 = new KartaDoGry("9",9,"Trefl", 4,46);
        KartaDoGry trefl10 = new KartaDoGry("10",10,"Trefl", 4,47);
        KartaDoGry treflJ = new KartaDoGry("J",11,"Trefl", 4,48);
        KartaDoGry treflD = new KartaDoGry("D",12,"Trefl", 4,49);
        KartaDoGry treflK = new KartaDoGry("K",13,"Trefl", 4,50);
        KartaDoGry treflA = new KartaDoGry("A",14,"Trefl", 4,51);

        KartaDoGry[] talia = new KartaDoGry[]{kier2,kier3,kier4,kier5,kier6,kier7,kier8,kier9,kier10,kierJ,kierD,kierK,kierA,
                karo2,karo3,karo4,karo5,karo6,karo7,karo8,karo9,karo10,karoJ,karoD,karoK,karoA,
                pik2,pik3,pik4,pik5,pik6,pik7,pik8,pik9,pik10,pikJ,pikD,pikK,pikA,
                trefl2,trefl3,trefl4,trefl5,trefl6,trefl7,trefl8,trefl9,trefl10,treflJ,treflD,treflK,treflA};



        wypelnijTabliceAssignment(tablicakart);

        for( int i= 0; i< 20;i++) {
            PomieszajTablice(tablicakart);
        }

        rozdajKarty(idGracz1,idGracz2,talia,tablicakart);
        System.out.println(Arrays.toString(tablicakart));

        for(int i=0;i<51;i++){
            talia[tablicakart[i]].showCard();
        }

        KartaDoGry wynik = graj(talia[tablicakart[5]],talia[tablicakart[6]]);
        if(wynik==null) System.out.println("Wojna !!!");
        else{
            wynik.showCard();
        }

    }

    private static void rozdajKarty(int idGracz1, int idGracz2, KartaDoGry[] talia, int[] tableCard) {
        for (int i =0 ;i< (talia.length/2)-1;i++){
            talia[tableCard[2*i]].setIdGracza(idGracz1);
            talia[tableCard[(2*i)+1]].setIdGracza(idGracz2);
        }
    }

    private static KartaDoGry graj(KartaDoGry kartaDoGry1, KartaDoGry kartaDoGry2) {
        System.out.println("Grają karty : " + kartaDoGry1.figura + "-" + kartaDoGry1.kolor +  " i " + kartaDoGry2.figura+ "-" + kartaDoGry2.kolor);
        KartaDoGry winer = null;
        if ( kartaDoGry1.mocFigury > kartaDoGry2.mocFigury) winer = kartaDoGry1;
        if ( kartaDoGry1.mocFigury < kartaDoGry2.mocFigury) winer = kartaDoGry2;
        if ( kartaDoGry1.mocFigury == kartaDoGry2.mocFigury) return winer;

        System.out.println("Wygrywa : " + winer.figura + "-" + winer.kolor);
        return winer;
    }


    public static void PomieszajTablice(int[] table) {
        for (int i = 0; i < table.length-1; i++) {
            int aktualna = table[i];
            int nastepna = table[i + 1];
            int a = (int) (Math.random() * 2.0);
            if (a > 0) {
                table[i] = nastepna;
                table[i + 1] = aktualna;
            }
        }
    }



    public static void wypelnijTabliceAssignment(int[] table) {
        for (int i = 0; i < table.length; i++) {
            table[i] = i;
        }
    }
}
