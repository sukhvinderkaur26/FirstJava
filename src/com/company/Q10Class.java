package com.company;

import java.util.Scanner;

public class Q10Class {
    public static void main(String[] args) {
        System.out.println("Enter any String");
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        String middlestring = stringMiddle(str);
        System.out.println(middlestring);

    }
    public static String  stringMiddle(String str)
    {
        int length = str.length();
        int position;
        int li;
        if(length%2==0)
        {
            position=length/2-1;
            li=2;
        }
        else {
            position=length/2;
            li=1;
        }
        return str.substring(position,position+li);

    }
}
