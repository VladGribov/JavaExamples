package com.java.Test;

public class RunEncap {
    public static void main(String args[]) {
        EncapTest moo = new EncapTest();
        moo.setHeight(100);
        moo.setAge(30);
        moo.setName("Vlad");

        System.out.println(moo.getName() + " is " + moo.getHeight() + " feet tall.");
    }
}
