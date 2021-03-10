package com.company;

public final class DepartmentTesting  extends  Employees implements Marimsalariu  {
    int countManualTester=250;
    int countAutomationTester=250;
    int countPerformanceTester=250;
    String tester;

    public String getTester() {
        return tester;
    }

    @Override
    public String toString() {
        return "DepartmentTesting{" +
                "countManualTester=" + countManualTester +
                ", countAutomationTester=" + countAutomationTester +
                ", countPerformanceTester=" + countPerformanceTester +
                ", tester='" + tester + '\'' +
                '}';
    }

    public DepartmentTesting(int age, String department, int countManualTester, int countAutomationTester, int countPerformanceTester) {
        super();
        this.countManualTester = countManualTester;
        this.countAutomationTester = countAutomationTester;
        this.countPerformanceTester = countPerformanceTester;
        tester="automation";
    }

    DepartmentTesting(boolean sex, double salariu, double expereenta, String tester,String name) {
        super();

        tester="manual tester";
    }


    public final void cautamAngajati() {
        if (countAutomationTester < 250) {
            countAutomationTester = +20;
            System.out.println(countAutomationTester);
        }
        else {
            System.out.println("Nu avem nevoie de angajati");
        }
    }

    @Override
    public void maririmSalariu() {
        if(expereenta>1){
            salariu=+15000;
            System.out.println(salariu);
        }
    }

    @Override
    public void concidiem() {
        if ((name == "Vlad" && tester == "automation")) {
            countAutomationTester--;
            System.out.println("Vlad deja nu lucreaza " + countAutomationTester);
        } else {
            System.out.println("Nu avem acesti angajati in department Testing");
        }
    }
public final void  print(){
    System.out.println("POL"+sex);
    System.out.println(name);
    System.out.println(age);


        }
        }





