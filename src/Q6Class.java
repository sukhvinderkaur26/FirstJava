import java.util.Scanner;

public class Q6Class {
    public static void main(String[] args) {
        System.out.println("Enter the number  ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        multiples3And5(n);
    }
    public static void multiples3And5( int n)
    {
       int sum=0;
       for(int i=0;i<=n;i++)
       {
           if(n%3==0||n%5==0)
           {
               sum=sum+i;

           }
       }
        System.out.println("Sum of Multiples of 3 and 5 is :"+sum);
    }
}
