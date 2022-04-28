package com.java.class18;

public class Class18Practice {
    public void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                if(i % 2 == 0){
                    System.out.print("*");
                } else {
                    System.out.print("&");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        new Class18Practice().pattern(6);
    }
}
