package com.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pattern9_61 {
    public static void main(String[] args) {

        /*

         WAP to print the following pattern.

         AAAAA
         BBBBB
         CCCCC
         DDDDD
         EEEEE

         */

        // 1st way...

//        for(char ch='A'; ch<='E'; ch++){
//            for(int j=1; j<=5; j++){
//                System.out.print(ch);
//            }
//            System.out.println();
//        }

        // 2nd way...

//        for(char ch='A'; ch<='E'; ch++){
//
//            int i=1;
//            while (i<=5){
//                System.out.print(ch);
//                i++;
//            }
//            System.out.println();
//        }

        // Taking input from the user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        char word = sc.next().charAt(0);
//
//        for(char ch='A'; ch<=word; ch++){
//            for(int i=1; i<=5; i++){
//                System.out.print(ch);
//            }
//            System.out.println();
//        }

        // Using Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        char word = sc.next().charAt(0);

        getPattern9(word);
    }
    static char getPattern9(char w){

        for(char ch='A'; ch<=w; ch++){
            for(int i=1; i<=5; i++){
                System.out.print(ch);
            }
            System.out.println();
        }
        return w;
    }
}
