package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DepartmentJava javaDev[] = new DepartmentJava[6];
        javaDev[0] = new DepartmentJava();
        javaDev[1] = new DepartmentJava();
        javaDev[2] = new DepartmentJava();
        javaDev[3] = new DepartmentJava(true, 12000, 2.00, 1);
        javaDev[4] = new DepartmentJava(false, 16000, 4.00, 1);
        javaDev[5] = new DepartmentJava(true, 1000000, 3.00, 1);

        for (int i = 4; i < javaDev.length - 1; i++) {
//            System.out.println("\n------------------------");
//            javaDev[i].print();
//            if (javaDev[i] instanceof DepartmentJava) {
//                ((DepartmentJava) javaDev[4]).print();
//            } else {
//                ((DepartmentJava) javaDev[4]).nuEsteDinDepartmentJava();


            javaDev[4].cautamAngajati();
            javaDev[4].maririmSalariu();
            javaDev[4].concidiem();
            javaDev[4].junorSauNu();
            System.out.println("------------------------");

            DepartmentTesting tester[] = new DepartmentTesting[6];
            tester[0] = new DepartmentTesting(true, 12000, 1.00, "automation", "Elena");
            tester[1] = new DepartmentTesting(false, 12000, 1.00, "automation", "Vlad");
            tester[2] = new DepartmentTesting(true, 158000, 5.00, "performance", "Irina");
            tester[3] = new DepartmentTesting(true, 12000, 2.00, "manual", "Alina");
            tester[4] = new DepartmentTesting(false, 16000, 4.00, "manual", "Alexandr");
            tester[5] = new DepartmentTesting(true, 1000000, 3.00, "automation", "Dana");

            for (int j = 0; j < tester.length - 5; j++) {
                System.out.println("\n------------------------");

                if (tester[j] instanceof DepartmentTesting) {
                    ((DepartmentTesting) tester[4]).print();
                } else {
                    System.out.println("Nu este din DepartmentTesting");
                }
                tester[j].concidiem();
                tester[j].cautamAngajati();
                tester[j].maririmSalariu();
                MyComapany company = new MyComapany() {
                    @Override
                    void junorSauNu() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                };

                company.compania_prestigioasa();
                System.out.println("Anul cand a deschis compania" + company.year);
                System.out.println("Dohod" + company.income);

                System.out.println("------------------------");

                /*Salvare datelor in fisier datele sespre tester*/
                PrintWriter out = null;
                System.out.println("Introcudeci numele fisierului: ");
                Scanner scan = new Scanner(System.in);
                String fileName = scan.next();
                try {
                    out = new PrintWriter(fileName + ".txt");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                out.println("Datele despre compania");
                out.println("Anul cand a deschis compania" + company.year);
                out.println("Anul cand a deschis compania" + company.income);
                out.println("Datele despre Department Testing");
                out.println(tester[0].salariu + "Expereenta" + tester[0].expereenta + tester[0] + "El este automation");
                out.println(tester[1].salariu + "Expereenta" + tester[1].expereenta + tester[1] + "El este automation");
                out.println(tester[2].salariu + "Expereenta" + tester[2].expereenta + tester[2] + "El  este performance");
                out.println(tester[3].salariu + "Expereenta" + tester[3].expereenta + tester[3] + "El este manual");
                out.println(tester[4].salariu + "Expereenta" + tester[4].expereenta + tester[4] + "El este manual");
                out.println(tester[5].salariu + "Expereenta" + tester[5].expereenta + tester[5] + "El este automation");
                out.println("-------------------------------------------------------------------------------------");
                out.println("Datele despre department Java");
                out.println(javaDev[0].salariu + "Expereenta" + javaDev[0].expereenta + javaDev[0] + "El este programator");
                out.println(javaDev[1].salariu + "Expereenta" + javaDev[1].expereenta + javaDev[1] + "El este programator");
                out.println(javaDev[2].salariu + "Expereenta" + javaDev[2].expereenta + javaDev[2] + "El  este programator");
                out.println(javaDev[3].salariu + "Expereenta" + javaDev[3].expereenta + javaDev[3] + "El este programator");
                out.println(javaDev[4].salariu + "Expereenta" + javaDev[4].expereenta + javaDev[4] + "El este programator");
                out.println(javaDev[5].salariu + "Expereenta" + javaDev[5].expereenta + javaDev[5] + "El este programator");
                out.close();

                System.out.println("URA");


            }

        }
    }
}


