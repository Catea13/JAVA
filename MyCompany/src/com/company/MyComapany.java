package com.company;


    import java.util.Scanner;

    /**
     *
     * @author Asus
     */
    public abstract class MyComapany {
        int year=2025;//
        long income=100000000;//dohod
        static int nr;//employesnr_

        MyComapany(int year, long income, int nr) {
            this.year = 2025;
            this.income = 300000000;
            MyComapany.nr++;
        }

        MyComapany(int y, long in) {
            year = y;
            income = in;
            nr++;
        }

        public MyComapany() {

        }

        abstract void junorSauNu();

        public void compania_prestigioasa() {
            if (income > 300000000) System.out.println("Co,pania este prestigioasa");
            else System.out.println("Compania nu este prestigioasa");
        }

    }







