package com.practice;

import java.util.Scanner;

public class Pattern17_69 {
    public static void main(String[] args) {

        /*

        69. WAP to print following pattern.
        *
        ***
        *****
        *******
        *********

         */

        // 1st way...
//        int star = 1;
//        for(int i=1; i<=5; i++){
//           for(int j=1; j<=star; j++){
//               System.out.print("*");
//           }
//            System.out.println();
//            star = star + 2;
//        }

        // 2nd way...
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<= (2 * i - 1); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Taking input from the user

        // 1st way...
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        int star = 1;
//
//        for(int i=1; i<=num; i++){
//            for(int j=1; j<=star; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//            star = star + 2;
//        }

        // 2nd way...
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        for(int i=1; i<=num; i++){
//            for(int j=1; j<= (2*i-1); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Using method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();
        getPattern17(num);
    }
    static int getPattern17(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }
}
