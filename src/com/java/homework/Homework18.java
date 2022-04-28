package com.java.homework;

public class Homework18 {
    //1
    //12
    //123
    //1234
    //12345
    public void pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        new Homework18().pattern(5);

    }
}
