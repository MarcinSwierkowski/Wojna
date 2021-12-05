package com.company;

public class Main {


    public static void main(String[] args) {


        Gracz gracz1 = new Gracz(1, "Janek");
        Gracz gracz2 = new Gracz(2, "Władek");
        Gracz gracz3 = new Gracz(3, "Piotrek");
        Gracz gracz4 = new Gracz(4, "Zenek");
        Gracz gracz5 = new Gracz(5, "Paweł");


        KartaDoGry kier2 = new KartaDoGry("2", 2, "Kier", 1, 0);
        KartaDoGry kier3 = new KartaDoGry("3", 3, "Kier", 1, 1);
        KartaDoGry kier4 = new KartaDoGry("4", 4, "Kier", 1, 2);
        KartaDoGry kier5 = new KartaDoGry("5", 5, "Kier", 1, 3);
        KartaDoGry kier6 = new KartaDoGry("6", 6, "Kier", 1, 4);
        KartaDoGry kier7 = new KartaDoGry("7", 7, "Kier", 1, 5);
        KartaDoGry kier8 = new KartaDoGry("8", 8, "Kier", 1, 6);
        KartaDoGry kier9 = new KartaDoGry("9", 9, "Kier", 1, 7);
        KartaDoGry kier10 = new KartaDoGry("10", 10, "Kier", 1, 8);
        KartaDoGry kierJ = new KartaDoGry("J", 11, "Kier", 1, 9);
        KartaDoGry kierD = new KartaDoGry("D", 12, "Kier", 1, 10);
        KartaDoGry kierK = new KartaDoGry("K", 13, "Kier", 1, 11);
        KartaDoGry kierA = new KartaDoGry("A", 14, "Kier", 1, 12);

        KartaDoGry karo2 = new KartaDoGry("2", 2, "Karo", 2, 13);
        KartaDoGry karo3 = new KartaDoGry("3", 3, "Karo", 2, 14);
        KartaDoGry karo4 = new KartaDoGry("4", 4, "Karo", 2, 15);
        KartaDoGry karo5 = new KartaDoGry("5", 5, "Karo", 2, 16);
        KartaDoGry karo6 = new KartaDoGry("6", 6, "Karo", 2, 17);
        KartaDoGry karo7 = new KartaDoGry("7", 7, "Karo", 2, 18);
        KartaDoGry karo8 = new KartaDoGry("8", 8, "Karo", 2, 19);
        KartaDoGry karo9 = new KartaDoGry("9", 9, "Karo", 2, 20);
        KartaDoGry karo10 = new KartaDoGry("10", 10, "Karo", 2, 21);
        KartaDoGry karoJ = new KartaDoGry("J", 11, "Karo", 2, 22);
        KartaDoGry karoD = new KartaDoGry("D", 12, "Karo", 2, 23);
        KartaDoGry karoK = new KartaDoGry("K", 13, "Karo", 2, 24);
        KartaDoGry karoA = new KartaDoGry("A", 14, "Karo", 2, 25);

        KartaDoGry pik2 = new KartaDoGry("2", 2, "Pik", 3, 26);
        KartaDoGry pik3 = new KartaDoGry("3", 3, "Pik", 3, 27);
        KartaDoGry pik4 = new KartaDoGry("4", 4, "Pik", 3, 28);
        KartaDoGry pik5 = new KartaDoGry("5", 5, "Pik", 3, 29);
        KartaDoGry pik6 = new KartaDoGry("6", 6, "Pik", 3, 30);
        KartaDoGry pik7 = new KartaDoGry("7", 7, "Pik", 3, 31);
        KartaDoGry pik8 = new KartaDoGry("8", 8, "Pik", 3, 32);
        KartaDoGry pik9 = new KartaDoGry("9", 9, "Pik", 3, 33);
        KartaDoGry pik10 = new KartaDoGry("10", 10, "Pik", 3, 34);
        KartaDoGry pikJ = new KartaDoGry("J", 11, "Pik", 3, 35);
        KartaDoGry pikD = new KartaDoGry("D", 12, "Pik", 3, 36);
        KartaDoGry pikK = new KartaDoGry("K", 13, "Pik", 3, 37);
        KartaDoGry pikA = new KartaDoGry("A", 14, "Pik", 3, 38);

        KartaDoGry trefl2 = new KartaDoGry("2", 2, "Trefl", 4, 39);
        KartaDoGry trefl3 = new KartaDoGry("3", 3, "Trefl", 4, 40);
        KartaDoGry trefl4 = new KartaDoGry("4", 4, "Trefl", 4, 41);
        KartaDoGry trefl5 = new KartaDoGry("5", 5, "Trefl", 4, 42);
        KartaDoGry trefl6 = new KartaDoGry("6", 6, "Trefl", 4, 43);
        KartaDoGry trefl7 = new KartaDoGry("7", 7, "Trefl", 4, 44);
        KartaDoGry trefl8 = new KartaDoGry("8", 8, "Trefl", 4, 45);
        KartaDoGry trefl9 = new KartaDoGry("9", 9, "Trefl", 4, 46);
        KartaDoGry trefl10 = new KartaDoGry("10", 10, "Trefl", 4, 47);
        KartaDoGry treflJ = new KartaDoGry("J", 11, "Trefl", 4, 48);
        KartaDoGry treflD = new KartaDoGry("D", 12, "Trefl", 4, 49);
        KartaDoGry treflK = new KartaDoGry("K", 13, "Trefl", 4, 50);
        KartaDoGry treflA = new KartaDoGry("A", 14, "Trefl", 4, 51);

        KartaDoGry[] talia = new KartaDoGry[]{kier2, kier3, kier4, kier5, kier6, kier7, kier8, kier9, kier10, kierJ, kierD, kierK, kierA,
                karo2, karo3, karo4, karo5, karo6, karo7, karo8, karo9, karo10, karoJ, karoD, karoK, karoA,
                pik2, pik3, pik4, pik5, pik6, pik7, pik8, pik9, pik10, pikJ, pikD, pikK, pikA,
                trefl2, trefl3, trefl4, trefl5, trefl6, trefl7, trefl8, trefl9, trefl10, treflJ, treflD, treflK, treflA};

        Gracz[] tablicaGraczy = new Gracz[]{gracz1, gracz2};

        int[] tablicaKart = new int[60];

        wypelnijTabliceAssignment(tablicaKart); // tablica uzupelniona id kart od 0 - 51 po kolei

        tasowanieKart(tablicaKart, 52, 20);  // tasuje id kart dostaje pseudolosowa pomieszaną tablice id kart 0-51

        rozdajKarty(tablicaGraczy, tablicaKart);  //rozdaje karty pomiedzy graczy w zaleznosci ilu kazdy dostaje np co 2*n karte

        int n=0;
        int ilePotyczek =0;

        while (gracz1.getIleKart() < 53 & gracz2.getIleKart() < 53 ){
            gracz1.przedstawSie();
            gracz2.przedstawSie();
            System.out.println(ilePotyczek++);
            if(graj(talia, tablicaGraczy,n)==1) n+=2;
            else n =0;
        }
    }

    private static int[] przesunTablice(int[] tablicakart, int offset, int ilekart) {
        int[] tablica = new int[60];
        for (int i = offset; i < ilekart + offset; i++) {
            tablica[i - offset] = tablicakart[i];
        }
        return tablica;
    }

            //wygrywa gracz 1
            //przepisujemy id karty z tabeli pozycja 0 -> na ostatnią+1 czyli pozycje ilekart
            //zabieramy wygraną karte na kolejną pozycje
            //wygrany zyskuje karte
            //przegrany traci karte
            //wygrany zyskuje karte
            //w przypadku wojny o zwyciestwie decyduje karta kolejna+1

    private static int graj(KartaDoGry[] talia, Gracz[] tablicaGraczy, int offset) {
        if (talia[tablicaGraczy[0].getTablicaKart()[offset]].getMocFigury() > talia[tablicaGraczy[1].getTablicaKart()[offset]].getMocFigury()) {
            int j = 0;
            for (int i = 0; i < offset + 1; i++) {
                tablicaGraczy[0].getTablicaKart()[tablicaGraczy[0].getIleKart() + i] = tablicaGraczy[0].getTablicaKart()[i];
                j++;
            }
            for (int i = 0; i < offset + 1; i++) {
                tablicaGraczy[0].getTablicaKart()[tablicaGraczy[0].getIleKart() + j] = tablicaGraczy[1].getTablicaKart()[i];
                j++;
            }
            tablicaGraczy[0].setIleKart(tablicaGraczy[0].getIleKart() + (1 + offset));
            tablicaGraczy[1].setIleKart(tablicaGraczy[1].getIleKart() - (1 + offset));

            tablicaGraczy[0].setTablicaKart(przesunTablice(tablicaGraczy[0].getTablicaKart(), 1 + offset, tablicaGraczy[0].getIleKart()));
            tablicaGraczy[1].setTablicaKart(przesunTablice(tablicaGraczy[1].getTablicaKart(), 1 + offset, tablicaGraczy[1].getIleKart()));
            return 0;
        }
        if (talia[tablicaGraczy[0].getTablicaKart()[offset]].getMocFigury() < talia[tablicaGraczy[1].getTablicaKart()[offset]].getMocFigury()) {
            int j = 0;
            for (int i = 0; i < offset + 1; i++) {
                tablicaGraczy[1].getTablicaKart()[tablicaGraczy[1].getIleKart() + i] = tablicaGraczy[1].getTablicaKart()[i];
                j++;
            }
            for (int i = 0; i < offset + 1; i++) {
                tablicaGraczy[1].getTablicaKart()[tablicaGraczy[1].getIleKart() + j] = tablicaGraczy[0].getTablicaKart()[i];
                j++;
            }
            tablicaGraczy[1].setIleKart(tablicaGraczy[1].getIleKart() + (1 + offset));
            tablicaGraczy[0].setIleKart(tablicaGraczy[0].getIleKart() - (1 + offset));

            tablicaGraczy[0].setTablicaKart(przesunTablice(tablicaGraczy[0].getTablicaKart(), 1 + offset, tablicaGraczy[0].getIleKart()));
            tablicaGraczy[1].setTablicaKart(przesunTablice(tablicaGraczy[1].getTablicaKart(), 1 + offset, tablicaGraczy[1].getIleKart()));
            return 0;
        }
        if (talia[tablicaGraczy[0].getTablicaKart()[offset]].getMocFigury() == talia[tablicaGraczy[1].getTablicaKart()[offset]].getMocFigury()) {
            System.out.println("wojna !!");
            return 1;
        }
        return 0;
    }


    private static void rozdajKarty(Gracz[] gracze, int[] tableCard) {
        for (int j = 0; j < gracze.length; j++) {
            for (int i = 0; i < 52 / gracze.length; i++) {
                gracze[j].getTablicaKart()[i] = tableCard[(gracze.length * i) + j];

                gracze[j].setIleKart(gracze[j].getIleKart()+1);
            }
        }
        for (int k = 0; k < 52 % gracze.length; k++) {
            gracze[k].getTablicaKart()[(52 / gracze.length)] = tableCard[(52 / gracze.length) * gracze.length + k];
            gracze[k].setIleKart(gracze[k].getIleKart()+1);
        }
    }


    public static void tasowanieKart(int[] table, int zakres, int iloscTasowan) {
        for (int j = 0; j < iloscTasowan; j++) {
            for (int i = 0; i < zakres - 1; i++) {
                int aktualna = table[i];
                int nastepna = table[i + 1];
                int a = (int) (Math.random() * 2.0);
                if (a > 0) {
                    table[i] = nastepna;
                    table[i + 1] = aktualna;
                }
            }
        }
    }


    public static void wypelnijTabliceAssignment(int[] table) {
        for (int i = 0; i < 52; i++) {
            table[i] = i;
        }
    }
}