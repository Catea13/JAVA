package com.company;

import java.util.Scanner;

public class Employees extends MyComapany {
    int age;
    String department;
    boolean sex;//true fata ,false-baiet
    double salariu;
    double expereenta;
 String name;
    Employees() {
        super();
        age = 22;
        this.sex = false;
        this.salariu = 13000.00;
        this.expereenta = 1.5;
        this.department ="Java";
        name="Vasea";

    }

    Employees(double salariu, double expereenta,int year,long income,int nr) {
        super(year, income, nr);
        sex = true;
        salariu = 120.00;
        expereenta = 1.5;
        department="Testing";
        name="Vlad";
    }


    @Override
    void junorSauNu() {
        if (expereenta < 1) {
            System.out.println("Junior");
        } else {
            System.out.println("Senior");
        }

        }
    }

