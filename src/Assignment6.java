import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Factorial of given number
        System.out.println("Enter the number which you want to find the factorial");
        int num = sc.nextInt();
        factorial(num);
        //fibonacci series
        System.out.println("Enter up to how many numbers you want to print in fibonacci series");
        int n = sc.nextInt();
        fibonacci(n);
        //Swap of two numbers
        System.out.print("Enter the value of a = \t");
        int a = sc.nextInt();
        System.out.print("Enter the value of b = \t");
        int b = sc.nextInt();
        swap(a, b);
        // calculator using switch case
        System.out.println("Enter first number for calculate");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number for calculate");
        float num2 = sc.nextFloat();
        System.out.println("Enter operator that you want to perform the operation, Here are some suggestions");
        System.out.println("Press '+' for addition\n" +
                "Press '-' for Subtraction\n" +
                "Press '*' for Multiplication\n" +
                "Press '/' for Division\n");
        char op = sc.next().charAt(0);
        calculatorUsingSwitch(num1, num2, op);
    }

    //Factorial of given number
    public static void factorial(int num) {
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + num + " is : " + fact);
    }

    //fibonacci series
    public static void fibonacci(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.println("Fibonacci series up to " + n + " is :");
        System.out.print(n1 + "\t" + n2 + "\t");
        for (int i = 1; i <= n; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + "\t");
            n1 = n2;
            n2 = n3;
        }
        System.out.println("....");
    }

    //Swap of two numbers
    public static void swap(int a, int b) {
        System.out.println("The value of a=" + a + " and value of b=" + b + " before swapping");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The value of a=" + a + " and value of b=" + b + " after swapping");
    }

    // calculator using switch case
    public static void calculatorUsingSwitch(float num1, float num2, char op) {
        switch (op) {
            case '+':
                System.out.println("Addition of two numbers are : " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction of two numbers are : " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication of two numbers are : " + (num1 * num2));
                break;
            case '/':
                System.out.println("Division of two numbers are : " + (num1 / num2));
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
