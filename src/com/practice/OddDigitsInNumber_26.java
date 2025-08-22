package com.practice;

import java.util.Scanner;

public class OddDigitsInNumber_26 {
    public static void main(String[] args) {

        /*
         WAP to define a method to count how many
         odd digits present in a number.
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int num = sc.nextInt();
//
//        int odd = 0;
//        int count = 0;
//
//        while (num != 0){
//
//            odd = num % 10;
//
//            if(odd % 2 != 0){
//                count++;
//            }
//            num = num / 10;
//        }
//        System.out.println("Total odd number: "+count);


        // Using Method
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int num = sc.nextInt();
//
//        int result = getOdd(num);
//        System.out.println("Total odd number is: "+result);
//    }
//    static int getOdd(int n){
//        int odd = 0;
//        int count = 0;
//
//        while (n != 0){
//
//            odd = n % 10;
//
//            if (odd % 2 != 0){
//                count++;
//            }
//            n = n / 10;
//        }
//        return count;

        // Using Method for even odd digits
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        int result[] = getEvenOddDigit(num);
//
//        System.out.println("Total even digit is: "+result[0]);
//        System.out.println("Total odd digit is: "+result[1]);
//    }
//    static int[] getEvenOddDigit(int n){
//
//        int even = 0;
//        int evenCount = 0;
//
//        int odd = 0;
//        int oddCount = 0;
//
//        while(n != 0){
//
//            int digit = n % 10;
//
//            if(digit %2 == 0){
//                evenCount++;
//            }
//            else{
//                oddCount++;
//            }
//            n = n / 10;
//        }
//        return new int[]{evenCount, oddCount};
    }
}
