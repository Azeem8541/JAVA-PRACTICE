package com.practice;

import java.util.Scanner;

public class ConvertIntoBinary_44 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter...");
        int num = sc.nextInt();

        String binary = "";
        while (num != 0){
            int digit = num % 2;
            binary = digit + binary;
            num = num/2;
        }
        System.out.print(binary);

        // Using method
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        getDecimalToBinary(num);
//    }
//    static int getDecimalToBinary(int n){
//
//        String binary ="";
//        while (n != 0){
//            int digit = n % 2;
//            binary = digit + binary;
//            n = n/2;
//        }
//        System.out.print(binary);
//        return n;
    }
}
