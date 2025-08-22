package com.practice;

import java.util.Scanner;

public class SumFibonacci_37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();

        int a = 0, b = 1;
        int sum = 0;

        for(int i=1; i<=num; i++){

            System.out.print(a+" ");

            b = a+b;
            a = b-a;
        }
        sum = b-1;
        System.out.print("= "+sum);

        // Using Method

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        getSumFibonacci(num);
//    }
//    static int getSumFibonacci(int n){
//
//        int a = 0, b =1;
//        int sum = 0;
//
//        for(int i=1; i<=n; i++){
//            System.out.print(a+" ");
//
//            b = a+b;
//            a = b-a;
//        }
//        sum = b-1;
//        System.out.print("= "+sum);
//
//        return n;

    }
}
