package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


import java.util.Scanner;
/**Am creat clasa si campuri**/
public class Balaur {
    int nr;
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    int balauri;
    /**Constructor fara parametri**/
    public Balaur() {

    }
    /**Constructor cu parametri**/
    public Balaur(int nr, ArrayList<Integer> arrayList, int balauri) {
        this.nr = nr;
        this.arrayList = arrayList;
        this.balauri = balauri;
    }
    /**Constructor de copiere**/
    @Override
    protected Balaur clone() throws CloneNotSupportedException {
        return (Balaur) super.clone();

    }
    /**Metodele get si set**/
    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getBalauri() {
        return balauri;
    }

    public void setBalauri(int balauri) {
        this.balauri = balauri;
    }

    @Override
    public String toString() {
        return "Balaur{" + "nr=" + nr + ", arrayList=" + arrayList + ", balauri=" + balauri + '}';
    }

    /**metoda de afisare**/
    public void afisare(Balaur balaur) {
        System.out.println(balaur.getArrayList());
        System.out.println(balaur.getNr());
        System.out.println(balaur.getNr());
    }

    ;
    static int  ar, ars, nrr,l,nrl,j;
    /**metoda care completeaza toate campurile obiectui citite de la tastatura**/
    public void scaner() {
        Scanner n = new Scanner(System.in);
        System.out.println("Dati nr total de capete ale primul balaur");
        nrl = n.nextInt();
        Scanner arayList = new Scanner(System.in);
        System.out.println("Dati IQ");
        ar = arayList.nextInt();
        Scanner balauri = new Scanner(System.in);
        System.out.println("Dati nr de balaur");
        l = balauri.nextInt();

        Scanner n1 = new Scanner(System.in);
        System.out.println("Dati nr total de capete ale doilea  balaur");
        nrr = n1.nextInt();
        Scanner arayLists = new Scanner(System.in);
        System.out.println("Dati IQ");
        ars = arayLists.nextInt();
        Scanner balaur = new Scanner(System.in);
        System.out.println("Dati nr de balaur");
        j = balaur.nextInt();


    }
    public void afisareDinScaner(){
        System.out.println("Primul balauri de la tastatura are urmatoarele valori:"+"Capete ale primul balaur:"+   nrl   +   "IQ al primul balaur :  "+ ar + " Nr de balaur al primul:  "+ l);
        System.out.println("A 2-a balauri de la tastatura  are urmatoarele valori:"+"Capete ale doilea balaur:"+  nrr +      "IQ al doilea balaur:   "+ ars + " Nr de balaur al doilea: "  +  j);
    }
    /**metoda statica-media aritmetica**/
    public static  void mediaAritmetica() {

        int media = ar + ars;
        int media_arit = media / 2;
        System.out.println("Media aritmetica"+media_arit);


    }
    /**Metoda ,care completeaza toate campurili on valori aleatoare**/
    public void random(){
        Random random = new Random();
        nrl = random.nextInt(10);
        ar=random.nextInt(130);
        l=random.nextInt(10);
        nrr=random.nextInt(10);
        ars=random.nextInt(130);
        j=random.nextInt(10);
        System.out.println("Random: " +   "Capete ale primul balauri -"+   "  " +nrl+ "  "  +"IQ al primul balauri -"+ "   "  +ar+  " "+  "Nr de balauri create - " +" " +l);
        System.out.println("Random: " +   "Capete ale 2-lea balauri -"+   "  " +nrr+ "  "  +"IQ al 2-lea balauri -"+ "   "  +ars+  " "+  "Nr de balauri create - " +" " +j);
    }

    /**Metoda de lupta de IQ,cina are <IQ ,atunci el pierde cap**/
    public void cineEstemaidestept() {
        if (ar < ars) {
            nrl--;
            System.out.println("Primul IQ lui balauri <A doilea IQ balauri" + nr);
        } else if (ars < ar) {
            nrr--;
            System.out.println("A doua IQ lui balauri <Primul IQ lui balauri" + nrr);

        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("URRRRRRRRRRRRRRRRRAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
    }
}

