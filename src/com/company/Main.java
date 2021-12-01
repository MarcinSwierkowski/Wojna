package com.company;

import com.company.Gracz;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] tablicakart = new int[52];

        Gracz gracz1 = new Gracz(1,"Janek");
        Gracz gracz2 = new Gracz(2,"Władek");


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
            PomieszajTablice(tablicakart,52);
        }

        rozdajKarty(gracz1.id,gracz2.id,talia,tablicakart);  //do poprawki bez sensu to działa




        System.out.println();
        pokarzKartyGracza(gracz1.id,tablicakart,talia);
        System.out.println();
        pokarzKartyGracza(gracz2.id,tablicakart,talia);
        System.out.println();

        wypelnijTabliceGracza(gracz1.id,tablicakart,talia,tablicakartGracz1a);
        wypelnijTabliceGracza(gracz2.id,tablicakart,talia,tablicakartGracz2a);

        gracz1.setIleKart(26);
        gracz2.setIleKart(26);



        System.out.println();
        System.out.println(Arrays.toString(tablicakartGracz1a));
        System.out.println();
        System.out.println(Arrays.toString(tablicakartGracz2a));

        int offset =1;
        int i =0;
        do{
            int wynik = graj(talia[tablicakartGracz1a[i]],talia[tablicakartGracz2a[i]]);
            if(wynik==0) {
                tablicakartGracz1a[ileKartGracz1]=tablicakartGracz1a[i];
                tablicakartGracz2a[ileKartGracz2]=tablicakartGracz2a[i];
                offset = 1;
            }
            if (wynik==1){
                offset = 1;
                tablicakartGracz1a[ileKartGracz1]=tablicakartGracz1a[i];
                tablicakartGracz1a[ileKartGracz1+1]=tablicakartGracz2a[i];
                ileKartGracz1++;
                ileKartGracz2--;

            }
            if (wynik==2)
            {
                offset = 1;
                tablicakartGracz2a[ileKartGracz2]=tablicakartGracz2a[i];
                tablicakartGracz2a[ileKartGracz2+1]=tablicakartGracz1a[i];
                ileKartGracz1--;
                ileKartGracz2++;

            }
            tablicakartGracz1a= przesunTablice(tablicakartGracz1a,offset,ileKartGracz1);
            tablicakartGracz2a= przesunTablice(tablicakartGracz2a,offset,ileKartGracz2);

            //System.out.println();
            System.out.println(ileKartGracz1 + " - " + ileKartGracz2);
            //System.out.println(Arrays.toString(tablicakartGracz1a));
            //System.out.println();
            //System.out.println(Arrays.toString(tablicakartGracz2a));

        } while(true);




    }

    private static int[] przesunTablice(int[] tablicakart, int offset, int ilekart) {
        int[] tablica = new int[52];
        for (int i=offset; i<ilekart+offset; i++){
            tablica[i-offset]=tablicakart[i];
        }
        return tablica;
    }

    private static void pokarzKartyGracza(int idGracz, int[] tablicaPrzypisan ,KartaDoGry[] talia) {
        for(int i=0;i<52;i++){
            if(talia[tablicaPrzypisan[i]].idGracza == idGracz) talia[tablicaPrzypisan[i]].showCard();
        }
    }

    private static void wypelnijTabliceGracza(int idGracz, int[] tablicaPrzypisan ,KartaDoGry[] talia, int[] tablicaGracza) {
        int j=0;
        for(int i=0;i<52;i++){
            if(talia[tablicaPrzypisan[i]].idGracza == idGracz) {
                tablicaGracza[j]=talia[tablicaPrzypisan[i]].id;
                j++;
            }
        }
    }

    private static int graj(KartaDoGry[] talia, int[] tablicaGracza1, int ileKartGracz1, int[] tablicaGracza2,int ileKartGracz2, int offset) {
        if ( talia[tablicaGracza1[0]].mocFigury > talia[tablicaGracza2[0]].mocFigury){
            tablicaGracza1[ileKartGracz1]=tablicaGracza1[offset];
            tablicaGracza1[ileKartGracz1+offset]=tablicaGracza2[offset];
            ileKartGracz1++;
            ileKartGracz2--;
        }
        if ( talia[tablicaGracza1[0]].mocFigury < talia[tablicaGracza2[0]].mocFigury) {
            tablicaGracza2[ileKartGracz2]=tablicaGracza2[offset];
            tablicaGracza2[ileKartGracz2+1]=tablicaGracza1[offset];
            ileKartGracz1--;
            ileKartGracz2++;
        }
        if ( talia[tablicaGracza1[0]].mocFigury == talia[tablicaGracza2[0]].mocFigury);
        return 0;
    }

    private static void rozdajKarty(int idGracz1, int idGracz2, KartaDoGry[] talia, int[] tableCard) {
        for (int i =0 ;i< (talia.length/2);i++){
            talia[tableCard[2*i]].setIdGracza(idGracz1);
            talia[tableCard[(2*i)+1]].setIdGracza(idGracz2);
        }
    }


    public static void PomieszajTablice(int[] table,int zakres) {
        for (int i = 0; i < zakres-1; i++) {
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