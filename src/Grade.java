import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num2 = sc.nextInt();
        System.out.println("Enter Third number");
        int num3 = sc.nextInt();
        threeNumbers(num1, num2, num3);
        System.out.println("Enter First subject number out of 100");
        int sub1 = sc.nextInt();
        System.out.println("Enter Second subject number out of 100");
        int sub2 = sc.nextInt();
        System.out.println("Enter Third subject number out of 100");
        int sub3 = sc.nextInt();
        System.out.println("Enter Fourth subject number out of 100");
        int sub4 = sc.nextInt();
        System.out.println("Enter Fifth subject number out of 100");
        int sub5 = sc.nextInt();
        printGrade(sub1, sub2, sub3, sub4, sub5);
    }

    public static void threeNumbers(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            System.out.println("These numbers are equal");
        } else {
            System.out.println("These numbers are not equal");
        }
    }

    public static void printGrade(int s1, int s2, int s3, int s4, int s5) {
        int total = s1 + s2 + s3 + s4 + s5;
        percentage(total);


    }

    public static void percentage(int total) {
        float percentage = (total * 100) / 500;
        System.out.println("The percentage of student is :" + percentage + "%");
        if (percentage >= 80) {
            System.out.println("and grade is A");
        }
        if (percentage >= 70 && percentage < 80) {
            System.out.println("and grade is B");
        }
        if (percentage >= 60 && percentage < 70) {
            System.out.println("and grade is C");
        }
        if (percentage <= 60) {
            System.out.println("and grade is D");
        }
    }
}
