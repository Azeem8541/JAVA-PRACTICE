package com.practice;

import java.util.Scanner;

public class TableOfN_22 {
    public static void main(String[] args) {
         /*
          WAP to display the multiplication of “N”.
          */


        // Using without Method
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = scanner.nextInt();
//
//        for(int i=1; i<=10; i++){
//            System.out.format("%d X %d = %d\n",num, i, num*i);
//        }

        // Using Method
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = scanner.nextInt();
//
//        multiplicationOfN(num);
//    }
//    static void multiplicationOfN(int n){
//        for(int i=1; i<=10; i++){
//            System.out.format("%d X %d = %d\n", n, i, n*i);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Which table you want..");
        int num = sc.nextInt();

        gettable(num);
    }
    static void gettable(int n){
        for(int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
    }
}
