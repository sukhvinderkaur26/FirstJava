package com.company;

import java.util.Scanner;

public class Q7Class {
    public static void main(String[] args) {
        System.out.println("Enter the number whose table you want to print");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        printTable(num);

    }
    public static void printTable(int num)
    {
        for(int i=0;i<=5;i++)

        {
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}
