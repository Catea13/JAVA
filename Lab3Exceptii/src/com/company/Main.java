package com.company;

import java.io.FileNotFoundException;
        import java.io.PrintWriter;
        import java.util.Scanner;

        import java.util.ArrayList;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * System.out.println("========== Creating balaur automatically"); Balaur b1 = new
         * Balaur(1); b1.showStats(); b1.showHeadsStats();
         *
         * System.out.println("========== Creating balaur heads automatically");
         * ArrayList<BalaurHead> heads = new ArrayList<BalaurHead>(); BalaurHead balaurHead0
         * = new BalaurHead(25, 45, 55, "Grisha"); heads.add(balaurHead0); Balaur b2 = new
         * Balaur(heads); b2.showStats(); b2.showHeadsStats();
         */

        System.out.println("========== Creating balaur head manually");
        ArrayList<BalaurHead> headsManual = new ArrayList<BalaurHead>();
        int totalHeads = getUserInputInteger("How many heads will your balaur have?");
        if (totalHeads < 1 || totalHeads > 999) {
            System.err.println(totalHeads + " heads are not acceptable ---> must be > " + Balaur.minHeads + " AND <"
                    + Balaur.maxHeads);
            return;
        }

        for (int iHead = 0; iHead < totalHeads; iHead++) {
            BalaurHead newBalaurHead = new BalaurHead();

// Give values to the new head
            String name = getUserInputString("Give a name for the head number " + iHead);
            newBalaurHead.setName(name);
            int iq = getUserInputInteger("IQ for the head");
            try {
                newBalaurHead.setIq(iq);
            } catch (BalaurException e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }

            int age = getUserInputInteger("Age for the head");
            newBalaurHead.setAge(age);

            int weight = getUserInputInteger("Weight for the head");
            try {
                newBalaurHead.setWeight(weight);
            } catch (BalaurException e) {

                e.printStackTrace();
            }

            headsManual.add(newBalaurHead);
        }

// Create the balaur from user input
        Balaur bManual = new Balaur(headsManual);
        bManual.showStats();
        bManual.showHeadsStats();
    }

    public static int getUserInputInteger(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextInt();
    }

    public static String getUserInputString(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.next();
    }
}