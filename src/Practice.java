import java.util.Locale;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        String name = "sukHi";
//        if (name.startsWith("su")) {
//            if (name.length() > 4) {
//                System.out.println(name.toUpperCase(Locale.ROOT));
//            } else {
//                System.out.println(name.toLowerCase(Locale.ROOT));
//            }
//        }
//        int i = 8;
//        if (i > 0) {
//            System.out.println("Number is positive");
//        } else if (i < 0) {
//            System.out.println("Number is Negative");
//        } else {
//            System.out.println("Zero");
//        }
//        if (i % 2 == 0) {
//            System.out.println("Number is even");
//        } else {
//            System.out.println("Number is odd");
//        }
//        for (int a = 1; a < 5; a++) {
//            System.out.println("Hello");
//        }
//        int sum = 0;
//        for (int a = 1; a <= 10; a++) {
//            if (a % 2 == 0) {
//                sum = sum + i;
//            }
//        }
//        System.out.println("sum is" + sum);
////n!=n*n-1
//        //0  1  1  3  5  8
        for (int j = 1; j <= 5; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print(k+"\t");
            }
            System.out.print("\n");
            //System.out.println();
        }
        for (int j = 5; j >= 1; j--) {
            for (int k = 1; k <= j; k++) {
                System.out.print( k+"\t");
            }
            System.out.print("\n");
            //System.out.println();
        }

//        int a = 1;
//        while (a <= 10) {
//            System.out.println("Hello sukhi");
//            a++;
//        }
//        int b = 1;
//        do {
//            System.out.println("Hello world");
//            b++;
//        } while (b <= 5);
//
//
//        int c = 1;
//        while (true) {
//            System.out.println("Hello sukhi");
//            if (b == 5) {
//                break;
//            }
//            b++;
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("I have thought a number(1-100)");
//        int computerNum=(int)((Math.random())*100);
//        System.out.println(computerNum);
//        System.out.println("Guess my number :");
//        while (true) {
//            int userInput = sc.nextInt();
//            if (userInput == computerNum) {
//                System.out.println("You won , guess was right");
//                break;
//            } else if (userInput < computerNum) {
//                System.out.println("Sorry. Your number is less than actual number, try again..");
//            } else {
//                System.out.println("Sorry. Your number is greater than actual number, try again..");
//            }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter month between (1-12) :");
//        int month = sc.nextInt();
//        switch (month) {
//            case 1:
//                System.out.println("The month is January");
//                break;
//            case 2:
//                System.out.println("The month is February");
//                break;
//            case 3:
//                System.out.println("The month is March");
//                break;
//            case 4:
//                System.out.println("The month is April");
//                break;
//            case 5:
//                System.out.println("The month is May");
//                break;
//            case 6:
//                System.out.println("The month is June");
//                break;
//            case 7:
//                System.out.println("The month is July");
//                break;
//            case 8:
//                System.out.println("The month is August");
//                break;
//            case 9:
//                System.out.println("The month is September");
//                break;
//            case 10:
//                System.out.println("The month is October");
//                break;
//            case 11:
//                System.out.println("The month is November");
//                break;
//            case 12:
//                System.out.println("The month is December");
//                break;
//            default:
//                System.out.println("Sorry wrong input");
//                break;
//        }
//      for(int i =1;i<=10;i++)
//      {
//          System.out.println("Line 1");
//          System.out.println("Line 2");
//          if(i==3||i==6){
//              continue;
//          }
//          System.out.println("Line after break");
//      }

    }
}

