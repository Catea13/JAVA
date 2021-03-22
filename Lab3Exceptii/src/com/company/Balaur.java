package com.company;

import java.util.ArrayList;

public class Balaur {
    // Information about heads
    ArrayList<BalaurHead> heads;

    // Conditions
    static int minHeads = 1;
    static int maxHeads = 999;

    /**
     * @author Hilea Ecaterina
     * Creates a balaur and generates a number of heads for it
     *
     * @param totalHeads - Generates heads with random parameters
     * @throws BalaurException
     */
    public Balaur(int totalHeads) {
        boolean flag=false;
        do { flag=false;
            try {
                if (totalHeads < minHeads || totalHeads > maxHeads) {
                    throw new BalaurException(totalHeads,
                            " heads are not acceptable ---> must be > " + minHeads + " AND <" + maxHeads);
                }

// Generate random heads
                heads = BalaurHead.generateBalaurHead(totalHeads);
                System.out.println(totalHeads + " heads were created");
            } catch (BalaurException e) {
                e.printStackTrace();
            }

        }
        while(flag);
    }

    public Balaur(ArrayList<BalaurHead> heads) {
        this.heads = heads;
    }

    // Shows stats in console
    public void showStats() {
        System.out.println(
                "Balaur has: " + heads.size() + " heads. Total IQ:" + getTotalIQ() + "; Total Power:" + getTotalPower());
    }

    public void showHeadsStats() {
        for (int iHead = 0; iHead < heads.size(); iHead++) {
            heads.get(iHead).toString();
        }
    }

// Attacking AND Comparing IQ

    public void fight(Balaur enemy) {
        if (getTotalPower() > enemy.getTotalPower()) {
            enemy.heads.remove(0);
        } else {
            heads.remove(0);
        }
    }

    public void whoIsSmarter(Balaur enemy) {
        if (getTotalIQ() > enemy.getTotalIQ()) {
            enemy.heads.remove(0);
        } else {
            heads.remove(0);
        }
    }

// Getters used for fighting

    public int getTotalIQ() {
        int combinedIq = 0;
        for (int iHead = 0; iHead < heads.size(); iHead++) {
            combinedIq = combinedIq + heads.get(iHead).getIq();
        }

        return combinedIq;
    }

    public float getTotalPower() {
        float totalPower = 0;
        for (int iHead = 0; iHead < heads.size(); iHead++) {
            totalPower = totalPower + heads.get(iHead).getWeight();
        }

        totalPower = totalPower + (getTotalIQ() / 2);
        return totalPower;
    }
}
