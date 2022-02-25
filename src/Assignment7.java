import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        System.out.println("Its changing code");
        //Declare an array of char, and store your first name
        char firstname[] = {'S', 'u', 'k', 'h', 'v', 'i', 'n', 'd', 'e', 'r'};
        System.out.print("First name is : ");
        for (int i = 0; i < firstname.length; i++) {
            System.out.print(firstname[i]);
        }
        System.out.println();

        //Declare an array to hold 10 decimal values and calculate sum of this values
        float num[] = new float[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 decimal numbers : ");
        for (int i = 0; i < 9; i++) {
            num[i] = sc.nextFloat();
        }
        System.out.println("Sum of these numbers are : ");
        float sum = 0;
        for (int i = 0; i < 9; i++) {
            sum = sum + num[i];
        }
        System.out.println(sum);

        //Declare a two-dimensional array  of 5 by 3, find average  of each column

        int arr[][] = new int[][]{
                {2, 5, 12},
                {34, 12, 45},
                {34, 78, 24},
                {56, 89, 46},
                {56, 78, 34}

        };


        for (int i = 0; i < 3; i++) {
            int sum1 = 0;
            float avg = 0;
            for (int j = 0; j < 5; j++) {
                sum1 = sum1 + arr[j][i];

            }
            avg = sum1 / 5;
            System.out.print(avg + "   ");

        }
    }
}
