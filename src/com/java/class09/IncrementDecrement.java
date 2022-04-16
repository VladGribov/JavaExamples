package com.java.class09;

public class IncrementDecrement {
    public static void main(String[] args) {
        int i = 4; //6
        int j = 4; //3
        int k = i++ + --j;//8
        int m = k++ - i++; //2

        //for int k = ++j; k = 5, j = 5
        //for int k = j++; k = 4, j = 5
        //do prefix 1st
        //postfix last so + comes 1st
        //and then you do i++
        //int k = i++ + ++j;
        System.out.println(j);
        System.out.println(i);
        System.out.println(m);
        System.out.println(k);
    }
}
