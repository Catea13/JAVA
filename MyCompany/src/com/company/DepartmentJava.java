package com.company;

public final   class DepartmentJava extends  Employees implements Marimsalariu {

    int countJava;



    public DepartmentJava(int year, long income, int nr, boolean p, double s, double e, String department, int countJava) {
        super();
       countJava=1555;
    }

    DepartmentJava(boolean sex, double salariu, double expereenta, int countJava) {
        super();

       countJava=188;
    }

    public DepartmentJava() {
        super();
    }


    public final void cautamAngajati() {
        if (countJava < 250) {
            countJava= +20;
            System.out.println("Cautam angajati"+countJava);
        }
    }

    @Override
    public void maririmSalariu() {
        if(expereenta>1){
            salariu=salariu+15000;
            System.out.println("Am ridicat salariu"+salariu);
        }
        else{
            System.out.println("Expereenta mai mic decat 1");
        }
    }

    @Override
    public void concidiem() {
        if ((name == "Vlad" && department == "Java")) {
            countJava--;
            System.out.println("Vlad deja nu lucreaza " + countJava);
        } else {
            System.out.println("Nu avem acesti angajati in department Java");
        }
    }
public final void nuEsteDinDepartmentJava(){
    System.out.println("El nu este din department java");


        }

        }








