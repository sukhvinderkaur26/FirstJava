package com.company;

import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

public class Q11Class {
    public static void main(String[] args) {
        System.out.println("Enter any String :");
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        System.out.println("Total vowels in this string is :"+count_Vowels(str));

    }
    public static int count_Vowels(String str)
    {
        int count=0;
        String s = str.toLowerCase(Locale.ROOT);
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length-1;i++)
        {
            if(chars[i]=='a'||chars[i]=='e'||chars[i]=='i'||chars[i]=='o'||chars[i]=='u')
                 count++;

        }

        return count;
    }

}
