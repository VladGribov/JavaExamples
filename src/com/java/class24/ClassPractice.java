package com.java.class24;

public class ClassPractice {
    static void myMethod(){
        class ClassInsideMethod {
            public static void meMethod2(){
                System.out.println("Hello World");
            }
        }
        new ClassInsideMethod().meMethod2();
    }

    public static void main(String[] args) {
        myMethod();
    }
}
