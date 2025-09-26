package com.practice;

import java.util.Scanner;

public class Pattern10_62 {
    public static void main(String[] args) {

        /*

         WAP to print the following pattern.

         ABCDE
         FGHIJ
         KLMNO
         PQRST
         UVWXY

         */

        // 1st way...

//        char ch = 'A';
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=5; j++){
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//        }

        // 2nd way...

//        char ch = 'A';
//
//        for(int i=1; i<=5; i++){
//
//            int j =1;
//            while (j<=5){
//                System.out.print(ch);
//                ch++;
//                j++;
//            }
//            System.out.println();
//        }

        // 3rd way...throw exception(StringIndexOutOfBoundsException)

//        String latter = "ABCDEFGHIJKLMNOPQRST";
//        int index = 0;
//
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=5; j++){
//                System.out.print(latter.charAt(index));
//                index++;
//            }
//            System.out.println();
//        }

        // 4th way...Handle exception

//        try{
//            String latter = "ABCDEFGHIJKLMNOPQRST";
//            int index = 0;
//
//            for(int i=1; i<=5; i++){
//                for(int j=1; j<=5; j++){
//                    System.out.print(latter.charAt(index));
//                    index++;
//                }
//                System.out.println();
//            }
//        }catch(Exception e){
//            System.out.println("Complete");
//        }

        // Taking input from the user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        char letter = sc.next().charAt(0);
//
//        boolean hai = false;
//
//        for(int i=1; i<=5 && !hai; i++){
//
//            int j=1;
//            while (j<=5){
//                System.out.print(letter);
//
//                if(letter == 'Z'){
//                    hai = true;
//                    break;
//                }
//                letter++;
//                j++;
//            }
//            System.out.println();
//        }

        // If user input capital or small letter

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        char letter = sc.next().charAt(0);
//
//        boolean hai = false;
//
//        for(int i=1; i<=5 && !hai; i++){
//
//            int j=1;
//            while (j<=5){
//                System.out.print(letter);
//
//                if(Character.isUpperCase(letter) && letter == 'Z'){
//                    hai = true;
//                    break;
//                }
//
//                if(Character.isLowerCase(letter) && letter == 'z'){
//                    hai = true;
//                    break;
//                }
//
//                letter++;
//                j++;
//            }
//            System.out.println();
//        }

        // Using Method

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        char letter = sc.next().charAt(0);
//
//        getPattern10(letter);
//    }
//    static char getPattern10(char word){
//
//        boolean hai = false;
//
//        for(int i=1; i<=5 && !hai; i++){
//            int j=1;
//            while (j<=5){
//                System.out.print(word);
//
//                if(Character.isUpperCase(word) && word == 'Z'){
//                    hai = true;
//                    break;
//                }
//
//                if(Character.isLowerCase(word) && word == 'z'){
//                    hai = true;
//                    break;
//                }
//
//                word++;
//                j++;
//            }
//            System.out.println();
//        }
//        return word;

        // Invalid input handling

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        String input = sc.next();

        if(input.length() != 1){
            throw new IllegalArgumentException("Invalid input!\n Please enter only one Character");
        }

        char letter = input.charAt(0);

        if(!Character.isLetter(letter)){
            throw new IllegalArgumentException("Invalid input!\n Please enter only Character");
        }

        boolean hai = false;

        for(int i=1; i<=5 && !hai; i++){

            int j=1;
            while (j<=5){
                System.out.print(letter);

                if(Character.isUpperCase(letter) && letter == 'Z'){
                    hai = true;
                    break;
                }

                if(Character.isLowerCase(letter) && letter == 'z'){
                    hai = true;
                    break;
                }

                letter++;
                j++;
            }
            System.out.println();
        }
    }
}
