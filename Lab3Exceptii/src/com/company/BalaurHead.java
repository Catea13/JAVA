package com.company;

import java.util.ArrayList;

public class BalaurHead {


        // Individual Characteristic
        int iq;
        int age;
        float weight;
        String name;

        // Conditions
        static int minIq = 20;
        static int maxIq = 250;
        static int minAge = 0;
        static int maxAge = 100;
        static float minWeight = 0;
        static float maxWeight = 100;

        public BalaurHead(int iq, int age, float weight, String name) {
            try {
                setIq(iq);
                setAge(age);
                setWeight(weight);
                setName(name);
            } catch (BalaurException e) {
                e.printStackTrace();
            }
        }

        public BalaurHead() {

        }

        // Show stats
        @Override
        public String toString() {
            System.out.println("Name: " + name + " IQ: " + iq + " Age: " + age + " Weight: " + weight);
            return super.toString();
        }

        // ========================================= IQ

        public int getIq() {
            return iq;
        }

        // IQ 20 - 250; ** Lenese THROW EXCEPTION USED *
        public void setIq(int iq) throws BalaurException {
            if (iq < minIq || iq > maxIq) {
                throw new BalaurException(iq, " IQ is not acceptable ---> must be > " + minIq + " AND <" + maxIq);
            }

            this.iq = iq;
        }

        // ========================================= AGE

        public int getAge() {
            return age;
        }

        // Varsta 0 - 100; ** Standart TRY CATCH USED **
        public void setAge(int age) {
            try {
                if (age < minAge || age > maxAge) {
                    throw new BalaurException(age, " age is not acceptable ---> must be > " + minAge + " AND <" + maxAge);
                }
            } catch (BalaurException e) {
                e.printStackTrace();
            }

            this.age = age;
        }

        public float getWeight() {
            return weight;
        }

        // ========================================= WEIGHT

        // Greutate 0 - 100; ** TRY TRY USED **
        public void setWeight(float weight) throws BalaurException {
            // First try
            try {
                // Second try
                try {
                    if (weight < minWeight || weight > maxWeight) {
                        throw new BalaurException(weight,
                                " weight is not acceptable ---> must be > " + minWeight + " AND <" + maxWeight);
                    }
                } catch (BalaurException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            this.weight = weight;
        }

        // ========================================= NAME

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // ========================================= Head Generator
        public static ArrayList<BalaurHead> generateBalaurHead(int iMany) {
            ArrayList<BalaurHead> balaurHeads = new ArrayList<BalaurHead>();

            for (int iHead = 0; iHead < iMany; iHead++) {
                BalaurHead head = new BalaurHead(getRandomInteger(minIq, maxIq), getRandomInteger(minAge, maxAge),
                        getRandomFloat(minWeight, maxWeight), "RandomBalaur " + iMany);
                balaurHeads.add(head);
            }

            return balaurHeads;
        }

        public static int getRandomInteger(int min, int max) {
            return (int) ((Math.random() * (max - min)) + min);
        }

        public static float getRandomFloat(float min, float max) {
            return (float) ((Math.random() * (max - min)) + min);
        }
    }


