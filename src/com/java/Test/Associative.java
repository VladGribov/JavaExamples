package com.java.Test;

public class Associative {
    int a = 1;
    int b = 2;
    int c = 3;

    Integer d = new Integer((a + b)*c);
    Integer e = new Integer(a * c + b * c);
    int f = (a + b)*c;
    int g = a * c + b * c;
    public Associative(){
        System.out.println("d = " + d);
        System.out.println("e = "+ e);
        System.out.println("d == e = " + (d == e));
    }
    public static void main(String[] args) {
        new Associative();
    }
}
