package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class Main extends Balaur {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);


        for (int i = 0; i < arrayList.size(); i++) {

            Balaur balaur = new Balaur(5, arrayList, 5);

            System.out.println(balaur.toString());
            Main main2 = new Main();
            main2.scaner();
            main2.mediaAritmetica();
            main2.cineEstemaidestept();
            main2.afisare(balaur);
            main2.afisareDinScaner();
            main2.random();

            /*Salvare datelor in fisier*/
            PrintWriter out = null;
            try {
                out = new PrintWriter("balauri.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            out.println(balaur);
            out.println(main2);
            out.println("Capete ale primului balaur"+nrr);
            out.println("IQ al primul balaur"+ar);
            out.println("Nr de balaur al primul"+l);
            out.println("Capete ale doilea balaur:"+nrr);
            out.println("IQ al doilea"+ars);
            out.println("Nr de balaur al doilea"+j);
            ;
            out.close();
        }
    }
}



