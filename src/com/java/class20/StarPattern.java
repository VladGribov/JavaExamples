package com.java.class20;

public class StarPattern {
    /*
//4 spaces     *
//3 spaces    ***
//2 spaces   *****
//1 spaces  *******
//0 spaces *********
   */
    public static void main(String[] args) {
        for(int i = 1; i<=9; i+=2){
            for(int j = 0; j <1; j++){
                for(int k = 0; k<(9-i)/2; k++){
                    System.out.print(" ");
                }
                for(int k = 1; k<=i; k++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i = 7; i >=1; i-=2){
            for(int j = 0; j <1; j++){
                for(int k = 0; k<(9-i)/2; k++){
                    System.out.print(" ");
                }
                for(int k = 1; k<=i; k++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
