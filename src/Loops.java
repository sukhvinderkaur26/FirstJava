public class Loops {
    public static void main(String[] args) {
        numberInc();
        numberDec();
        printEven();
        printOdd();
        incrementByTwo();
        System.out.println("hello");
    }

    public static void numberInc() {
        System.out.println("Numbers 1-100 in ascending order");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void numberDec() {
        System.out.println("Numbers 1-100 in Descending order");
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void printEven() {
        System.out.println("Even numbers are");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void printOdd() {
        System.out.println("Odd numbers are");
        for (int i = 1; i <= 100; i++) {
            if ((i % 2 )!= 0) {
                System.out.println(i);
            }

        }
    }
    public  static void incrementByTwo()
    {
        System.out.println("Number with increment by 2");
        for (int i=50;i<=100;i=i+2)
        {
            System.out.println(i);
        }
    }
}
