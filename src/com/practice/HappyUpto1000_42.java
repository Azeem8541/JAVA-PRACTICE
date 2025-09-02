package com.practice;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class HappyUpto1000_42 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        int count = 0;
//
//        for(int i=1; i<=num; i++){
//
//            int result = i;
//
//            while (result != 1 && result != 4){
//
//                int sum = 0;
//
//                while (result > 0){
//                    int digit = result % 10;
//                    sum += digit * digit;
//                    result = result / 10;
//                }
//                result = sum;
//            }
//            if (result == 1){
//                count++;
//            }
//        }
//        System.out.println(count);

        // Using Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();

        getHappyNumber1ToN(num);
    }
    static int getHappyNumber1ToN(int n){

        int count = 0;

        for(int i=1; i<=n; i++){

            int result = i;

            while (result != 1 && result != 4){

                int sum = 0;

                while (result > 0){
                    int digit = result % 10;
                    sum += digit * digit;
                    result = result / 10;
                }
                result = sum;
            }
            if(result == 1){
                count++;
            }
        }
        System.out.println(count);
        return n;
    }
}