package com.practice;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Pattern8_60 {
    public static void main(String[] args) {

        /*

         WAP to print the following pattern.

         ABCDE
         ABCDE
         ABCDE
         ABCDE
         ABCDE

         */

        // 1st way...

//        for (int i=1; i<=5; i++){
//            System.out.print("ABCDE");
//            System.out.println();
//        }

        // 2nd way...

//        for (int i=1; i<=5; i++){
//            for(char ch='A'; ch<='E'; ch++){
//                System.out.print(ch);
//            }
//            System.out.println();
//        }

        // 3rd way...

//        int i=1;
//
//        while (i<=5){
//            char ch = 'A';
//
//            while (ch<='E'){
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//            i++;
//        }

        // Taking input from the user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        for(int i=1; i<=num; i++){
//            for (char ch='A'; ch<='E'; ch++){
//                System.out.print(ch);
//            }
//            System.out.println();
//        }

        // Using Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();

        getPattern8(num);
    }
    static int getPattern8(int n){

        String row = "ABCDE";
        for(int i=1; i<=n; i++){
            System.out.println(row);
        }
        System.out.println();
        return n;
    }
}
