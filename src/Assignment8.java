import java.util.Arrays;
import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {

        //Given string s , and index i and Index j, create function to swap character present at index i and index j
//                Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any string :");
//        String s = sc.nextLine();
//        System.out.println("Enter the value of index i : ");
//        int i = sc.nextInt();
//        System.out.println("Enter the value of index j :");
//        int j = sc.nextInt();
//        swapChar(s,i,j);
//    }
//    public static void swapChar(String s, int i,int j){
//                char[] chars = s.toCharArray();
//        System.out.println("The Entered String is  :\n"+Arrays.toString(chars));
//        char temp;
//        temp=chars[i];
//        chars[i]=chars[j];
//        chars[j]=temp;
//        String s1 = Arrays.toString(chars);
//        System.out.println("String after swapping is :\n "+s1);
//

        // To check string is palindrome or not
        String s1 = "madam";
        char[] chars1 = s1.toCharArray();
        char s2[] = new char[s1.length()];
        int length1 = chars1.length - 1;
        for (int i = 0; i <= length1; i++) {
            s2[length1 - i] = chars1[i];
        }
        System.out.println("The reverse string is  : ");
        System.out.println(s2);
        String s3 = String.valueOf(s2);
        if (s1.equals(s3)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
