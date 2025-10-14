package com.practice;

import java.util.Scanner;

public class Pattern16_68 {
    public static void main(String[] args) {

        /*

        WAP to print following pattern.

        12345
        1234
        123
        12
        1

         */

//        for(int i=5; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Taking input from the user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        for(int i=num; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // 2nd way...

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        for(int i=num; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print(j+",");
//            }
//            System.out.println();
//        }

        // Using Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();

        getPattern16(num);
    }
    static int getPattern16(int n){

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+",");
            }
            System.out.println();
        }
        return n;
    }
}
