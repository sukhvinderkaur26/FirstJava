import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        System.out.println("Please enter month number (1-12) :");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        printDaysOfMonth(month);

        // check the number lies between 1-100 using and operator
        System.out.println("Enter the number :");
        Scanner num=new Scanner(System.in);
        int a = num.nextInt();
        compareNumberUsingAnd(a);
        compareNumberUsingOr(a);


    }
    public static void compareNumberUsingAnd(int n)
    {
        if (n>1 && n<100)
        {
            System.out.println("This is comparison using AND operator");
        }
    }
    public static void compareNumberUsingOr(int x)

    {
        if (x>1 || x<100)
        {
            System.out.println("This is comparison using OR operator");
        }
    }
    public static void printDaysOfMonth(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("This month has 31 days");
        }
        else if ( month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("This month has 30 days");
        }
        else if (month==2)
        {
            System.out.println("This month has 28 days");
        }
        else {
            System.out.println("Sorry wrong choice");
        }
    }

}
