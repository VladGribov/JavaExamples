package com.java.homework;

public class Homework19 {
    //Pattern 1
    public void pattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Pattern 2
    public void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Pattern 3
    public void pattern3() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Pattern 4
    public void pattern4() {
        for (int i = 1; i <= 9; i = i + 2) {
            for (int j = 0; j <= i - j; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Homework19 hw = new Homework19();
        hw.pattern1();
        System.out.println();
        hw.pattern2();
        System.out.println();
        hw.pattern3();
        System.out.println();
        hw.pattern4();
    }
}
