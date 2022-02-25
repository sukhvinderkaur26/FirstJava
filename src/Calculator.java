import java.util.Locale;

public class Calculator {
    public static void main(String[] args) {
        int i=5;
       System.out.println(++i);
        System.out.println(i++);
        System.out.println(--i);
        System.out.println(i--);
        //sum
        int s = sum(3, 6);
        System.out.println("The of two numbers are " + s);
        //difference
        int d = diff(3, 8);
        System.out.println("The difference is" + d);
        // Multiply
        int m = mul(4, 9);
        System.out.println(" Multiplication is "+ m);
        //Division
        int diff = diff(6, 2);
        System.out.println(" Division is "+ diff);
          printTable(2);
          String fullname ="sukhvinder kaur";
        System.out.println(fullname.toUpperCase(Locale.ROOT)) ;
    }
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static int diff(int a,int b)
    {
        return a-b;
    }
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static int div(int a,int b)
    {
        return a/b;
    }
    public static void printTable(int n)
    {
        System.out.println(n+"*1="+(n*1));
        System.out.println(n+"*2="+(n*2));
        System.out.println(n+"*3="+(n*3));
        System.out.println(n+"*4="+(n*4));
        System.out.println(n+"*5="+(n*5));
        System.out.println(n+"*6="+(n*6));
        System.out.println(n+"*7="+(n*7));
        System.out.println(n+"*8="+(n*8));
        System.out.println(n+"*9="+(n*9));
        System.out.println(n+"*10="+(n*10));

    }

}


