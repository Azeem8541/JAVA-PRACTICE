package com.practice;

import java.util.Scanner;

public class Exam2_Question_7 {
    static void marks(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your physics marks out of 100");
        double sub1 = scanner.nextDouble();

        System.out.println("Enter your chemistry marks out of 100");
        double sub2 = scanner.nextDouble();

        System.out.println("Enter your biology marks out of 100");
        double sub3 = scanner.nextDouble();

        System.out.println("Enter your mathematics marks out of 100");
        double sub4 = scanner.nextDouble();

        double result = (sub1 + sub2 + sub3 + sub4);
        System.out.println("Your Result is: "+result+ "/400");
        double percentage = (sub1 + sub2 + sub3 + sub4)/4.0;
        System.out.println("Your overall percentage is: "+percentage);

       if(sub1 <35 || sub2 <35 || sub3 <35 || sub4 <35){
           System.out.println("Failed...");
           System.out.print("You Failed in: ");
       }
       if(sub1 <35){
           System.out.println("Physics");
       }
       if(sub2 <35){
           System.out.println("Chemistry");
        }
       if(sub3 <35){
            System.out.println("Biology");
        }
        if(sub4 <35){
            System.out.println("Math");
        }

       else if(percentage >80){
           System.out.println("Congratulation Distinction Pass...");
       }
       else if(percentage >60){
           System.out.println("Congratulation First Class Pass...");
       }
       else if(percentage >50){
           System.out.println("Congratulation Second Class Pass...");
       }
       else if(percentage <50){
           System.out.println("Just pass...");
       }
       scanner.close();
    }
    public static void main(String[] args) {

        // Question 7.
        /*
        WAP to read the 4 subject marks from the user
        display the result.
        In any subject marks < 35 so fail.
        Percentage > 80% so distinction,
        >60 first class, >50 2nd class. otherwise just pass
        ALTERNATE : 2 Using Method.
         */

        marks();
    }
}
