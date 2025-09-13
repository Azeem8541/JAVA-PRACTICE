package com.practice;

public class Pattern5_57 {
    public static void main(String[] args) {

        /*

         WAP to print the following pattern.

         12345
         67891
         23456
         78912
         34567

         */

        int k=1;

        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print(k);
                k++;

                if(k > 9){
                    k = 1;
                }
            }
            System.out.println();
        }
    }
}
