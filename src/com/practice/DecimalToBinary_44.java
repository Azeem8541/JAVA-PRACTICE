package com.practice;

import java.util.Scanner;

public class DecimalToBinary_44 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter...");
//        int num = sc.nextInt();
//
//        while (num > 0){
//            int rem = num % 2;
//            System.out.print(rem);
//            num = num / 2;
//        }

        // Using method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter..");
        int num = sc.nextInt();

        getDecimalToBinary(num);
    }
    static int getDecimalToBinary(int n){

        while (n > 0){
            int rem = n % 2;
            System.out.print(rem);
            n = n / 2;
        }
        return n;
    }
}
