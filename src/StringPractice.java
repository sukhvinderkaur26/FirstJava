import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        //Reverse a string
//        String name="sukhi";
//        char[] chars = name.toCharArray();
//        char reversearr[]=new char[name.length()];
//        int length=chars.length-1;
//        for (int i=0;i<=length;i++)
//        {
//            reversearr[length-i]=chars[i];
//
//        }
//
//        System.out.println(reversearr);
//        // To check string is palindrome or not
//        String s1="madam";
//        char[] chars1 = s1.toCharArray();
//        char s2[]=new char[s1.length()];
//        int length1=chars1.length-1;
//        for (int i=0;i<=length1;i++)
//        {
//            s2[length1-i]=chars1[i];
//        }
//        System.out.println("The reverse string is  :");
//        System.out.println(s2);
//        if (s1.equals(s2))
//        {
//            System.out.println("String is palindrome");
//        }
//        else
//        {
//            System.out.println("String is not palindrome");
//        }

// convert int to string
//        String s = String.valueOf(123456);
//        System.out.println(s);
//        System.out.println(s.substring(1, 3));
//// convert string to int
//        int i = 123456;
//        int i1 = Integer.parseInt("1234567");
//        System.out.println(i1);


        String str = "sukhvinder";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character whose index you want to find :");
        char c = sc.next().charAt(0);
        int i = str.indexOf(c);
        System.out.println("index of  " + c + " is :" + i);
        int length = str.length();
        System.out.println("Length of string is :"+length);
        System.out.println("Character at index 3 is  :"+str.charAt(3));
        System.out.println(str.contains("w"));


    }


}
