package com.java.Test;

public class Apple extends ProbabilityFruit {
    //subclass of ProbabilityFruit
    private String type = "Apple";
    public static void main(String[] args) {
        Apple apple = new Apple(); //create object
        apple.setAmount(300,499,1999);
        System.out.println(apple.getAmount());
    }

}
