package com.company;

public class Family {
    private String FatherName, MotherName, SonName, DaughterName;
    private int FatherSalary, MotherSalary, SonFee, DaughterFee;
    private int Grocery = 500;

    public Family(String fatherName, String motherName, String sonName, String daughterName, int fatherSalary, int motherSalary, int sonFee, int daughterFee) {
        FatherName = fatherName;
        MotherName = motherName;
        SonName = sonName;
        DaughterName = daughterName;
        FatherSalary = fatherSalary;
        MotherSalary = motherSalary;
        SonFee = sonFee;
        DaughterFee = daughterFee;

    }

    public String getdisplayNames() {
        return "Father name :" + FatherName + "\n" +
                "Mother name :" + MotherName + "\n" +
                "Son Name :" + SonName + "\n" +
                "Daughter name :" + DaughterName;
    }

    public int gettotalSlary() {
        return FatherSalary + MotherSalary;
    }

    public int gettotalFee() {
        return SonFee + DaughterFee;
    }

    public int getsaving() {
        int totalsavings = (FatherSalary + MotherSalary) - (SonFee + DaughterFee) - Grocery;
        return totalsavings;
    }

    public void checkSaving() {
        int saving = getsaving();
        if (saving > 1000) {
            System.out.println("Congratulations!!  " + FatherName + "  you saved this much =" + saving);
        } else {
            System.out.println("Dear  " + FatherName + " !! Please try to save for next month");
        }
    }
}
